package com.example.equipment.piece

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "pieces")
data class Piece(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    var id: UUID? = null,
    @Column(name = "transport_mode", nullable = false)
    @Enumerated(EnumType.STRING)
    val transportMode: TransportMode,
    @Column(name = "cargo_count")
    val cargoCount: Int
)

enum class TransportMode { TRUCK, OCEAN, AIR }
