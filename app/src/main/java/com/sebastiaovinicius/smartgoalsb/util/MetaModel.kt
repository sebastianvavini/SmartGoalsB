package com.sebastiaovinicius.smartgoalsb.util

import android.hardware.camera2.CameraExtensionSession.StillCaptureLatency

data class MetaModel(

    val id:Int,
    val descriptionEstalo:String,
    val expectativa:String,
    val porqueImporta:String,
    //val envolvidos:List<String>,
    val envolvidos:String,
    //val recursosNecessarios:List<String>,
    val recursosNecessarios:String,
  //  val numerosEsperados:Double,
    val numerosEsperados:String,
    val metaFoiAtingidaSe:String,
    val metricasDeAcompanhamento:String,
    //val equipeEnvolvida:List<String>,
    //val equipeEnvolvida:List<String>,
    val equipeEnvolvida:String,
    //val orcamentoDisponivel:Double,
    val orcamentoDisponivel:String,
   // val temOsRecursosNecessarios:Boolean,
    val temOsRecursosNecessarios:String,
    val dataFinalPrazo:String,
    val resultadoPlausivelEsperado:String

)



