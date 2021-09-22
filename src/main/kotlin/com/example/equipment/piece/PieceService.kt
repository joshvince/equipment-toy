package com.example.equipment.piece

import com.example.equipment.events.Event
import com.example.equipment.events.ModeOfTransport
import org.springframework.stereotype.Service
import java.util.*

@Service
class PieceService(private val pieceRepository: PieceRepository) {

    fun handleEvent(event: Event): Unit {
        when(event.modeOfTransport) {
            ModeOfTransport.OCEAN -> ContainerService(event, pieceRepository)
            ModeOfTransport.TRUCK -> FullTruckService(event, pieceRepository)
            else -> throw NotImplementedError("Not yet implemented")
        }
    }

    fun createPiece(modeOfTransport: ModeOfTransport, cargoCount: Int): Piece {
        val piece = Piece(modeOfTransport = modeOfTransport, cargoCount = cargoCount)
        return pieceRepository.save(piece)
    }

    fun deletePiece(id: UUID): Unit = pieceRepository.deleteById(id)

    fun getPiece(id: UUID): Optional<Piece> = pieceRepository.findById(id)
}


