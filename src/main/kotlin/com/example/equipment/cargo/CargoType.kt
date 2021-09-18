package com.example.equipment.cargo

enum class CargoType {
    VEHICLE, CONTAINER, LOOSE;

    companion object {
        fun getCargoTypeByName(name: String): CargoType = valueOf(name.uppercase())
    }
}