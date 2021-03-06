package com.example.equipment.piece

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PieceRepository : JpaRepository<Piece, UUID>
