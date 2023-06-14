package com.sebastiaovinicius.smartgoalsb.util
//import android.os.Build
//import androidx.annotation.RequiresApi
import org.json.JSONException
import  org.json.JSONObject
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception
import java.nio.charset.Charset

class GeraJSON {
    //@RequiresApi(Build.VERSION_CODES.TIRAMISU)
    fun salvar(texto:String) {
        val path = "/json/healthpay.json"
        val json= JSONObject()
        try {
            json.put("name", "HealthPay")
            json.put("employees", 3)
            json.put("offices", listOf("Maranhão", "Piauí", "Ceará"))
        }
        catch (e:JSONException){
            e.printStackTrace()
        }
        try {
           // PrintWriter(FileWriter (path, Charset.defaultCharset())).use { it.write(json.toString()) }
        }
        catch (e:Exception){
            //e.printStackTrace()
        }
    }
}