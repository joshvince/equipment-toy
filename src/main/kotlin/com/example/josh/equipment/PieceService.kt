package com.example.josh.equipment

import org.springframework.stereotype.Service
import java.util.*

@Service
class PieceService(private val pieceRepository: PieceRepository) {

    fun createPiece(piece: Piece): Piece = pieceRepository.save(piece)

    fun deletePiece(id: UUID): Unit = pieceRepository.deleteById(id)

    fun getPiece(id: UUID): Optional<Piece> = pieceRepository.findById(id)
}
