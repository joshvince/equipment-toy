package com.example.equipment.piece

import com.example.equipment.events.Event
import org.springframework.stereotype.Service
import java.util.*

@Service
class PieceService(private val pieceRepository: PieceRepository) {

    fun handleEvent(event: Event): Unit {
        
    }

    fun createPiece(transportMode: TransportMode, cargoCount: Int): Piece {
        val piece = Piece(transportMode = transportMode, cargoCount = cargoCount)
        return pieceRepository.save(piece)
    }

    fun deletePiece(id: UUID): Unit = pieceRepository.deleteById(id)

    fun getPiece(id: UUID): Optional<Piece> = pieceRepository.findById(id)
}


