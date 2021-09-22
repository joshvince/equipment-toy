package com.example.equipment.piece

import com.example.equipment.events.ModeOfTransport
import org.hibernate.annotations.GenericGenerator
import java.time.LocalDate
import java.time.LocalTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "pieces")
data class Piece(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    var id: UUID? = null,
    @Column(name = "transport_mode")
    @Enumerated(EnumType.STRING)
    val modeOfTransport: ModeOfTransport? = null,
    @Column(name = "cargo_count")
    val cargoCount: Int? = null,
    @Column
    val zencargoReference: String? = null,
    @Column
    val collectionDate: LocalDate? = null,
    @Column
    val collectionTime: LocalTime? = null
)
