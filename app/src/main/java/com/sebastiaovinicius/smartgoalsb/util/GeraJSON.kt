package com.sebastiaovinicius.smartgoalsb.util
import android.os.Build
import androidx.annotation.RequiresApi
import org.json.JSONException
import  org.json.JSONObject
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception
import java.nio.charset.Charset

class GeraJSON {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    fun main() {
        val path = "/json/microsoft.json"
        val json= JSONObject()
        try {
            json.put("name", "Microsoft")
            json.put("employees", 182268)
            json.put("offices", listOf("California", "Washington", "Virginia"))
        }
        catch (e:JSONException){
            e.printStackTrace()
        }
        try {
            PrintWriter(FileWriter (path, Charset.defaultCharset())).use { it.write(json.toString()) }
        }
        catch (e:Exception){
            e.printStackTrace()
        }
    }
}