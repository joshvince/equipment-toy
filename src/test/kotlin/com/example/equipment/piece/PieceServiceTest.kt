package com.example.equipment.piece

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PieceServiceTest {
    private val repository = mockk<PieceRepository>()
    private val service = PieceService(repository)
    private val piece = Piece(transportMode = TransportMode.OCEAN, cargoCount = 1)

    @BeforeEach
    fun setUp() {
        every { repository.save(piece) } returns piece
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun `it calls the repository to save a new piece`() {
        service.createPiece(transportMode = TransportMode.OCEAN, cargoCount = 1)

        verify(exactly = 1) { repository.save(piece) }
    }
}
