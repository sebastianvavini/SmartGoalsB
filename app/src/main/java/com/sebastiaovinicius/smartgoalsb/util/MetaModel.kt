package com.sebastiaovinicius.smartgoalsb.util

data class MetaModel(
    val id:Int,
    val descriptionEstalo:String,
    val expectativa:String,
    val porqueImporta:String,
    val envolvidos:List<String>
)

/**
val result="""
       META SMART: ${binding.textViewEstalo.text}

  Especifica:
       ${binding.conclusaoExpectativa.text}

       ${binding.conclusaoPorqueEImportante.text}

       ${binding.conclusaoEnvolvidos.text}

       ${binding.conclusaoRecursosNecessarios.text}

   Mensurável:
       ${binding.conclusaoNumerosEsperados.text}

       ${binding.conclusaoMensuravelFoiAlcancadaSe.text}

       ${binding.conclusaoMensuravelMetricasAcompanhamento.text}

   Atribuivel:
       ${binding.conclusaoAtribuivelEquipes.text}

   Realista:
       ${binding.conclusaoRealistaTemOrcamento.text}

       ${binding.conclusaoRealistaTemRecursosNecessarios.text}

   Temporal:
       ${binding.conclusaoDataFinal.text}

       ${binding.conclusaoResultadoPlausivel.text}

   ASSINE A SMARTGOALS E SEJA O PRIMEIRO A RECEBER AS NOVAS FUNCIONALIDADES:
       ${checkout()}

        """.trimIndent()

salvarJSON(result)

return result

 **/

