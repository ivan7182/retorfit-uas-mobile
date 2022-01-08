package com.example.myuas2.Model

class Model (
    val toko: List<Data>
) {
    data class Data (val id:String?, val nama:String?, val penulis:String?)
}