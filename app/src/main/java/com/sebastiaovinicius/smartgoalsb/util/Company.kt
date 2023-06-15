package com.sebastiaovinicius.smartgoalsb.util

class Company (
    var name:String,
    var employees:Int,
    var offices: List<String>
    )

fun main () {
    val companies =
        Company ("Microsoft",1236, listOf("California", "Washigton","Virginia"))
    val path = "/json/microsoft.json"
}