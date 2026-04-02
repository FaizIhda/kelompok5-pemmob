package com.uchiha.catatlari

// Pastikan nama class diawali huruf kapital agar sesuai standar Kotlin
data class DataUser(
    val nama: String,
    val email: String,
    val password: String
)

data class dataLari(val simpanLari: String, val simpanJarak: String, val simpanDurasi: String)