package com.sebastiaovinicius.smartgoalsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sebastiaovinicius.smartgoalsb.databinding.ActivityAtribuivelBinding
import com.sebastiaovinicius.smartgoalsb.shared.SharedData

class AtribuivelActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityAtribuivelBinding
    private lateinit var estalo:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAtribuivelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        estalo=intent.getStringExtra("estalo").toString()
        binding.textViewEstalo.text=estalo
        binding.buttonAvancarParaRealista.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if(v.id==R.id.button_avancar_para_realista){
            validarAtribuivel()
        }
    }
    fun validarAtribuivel(){
        avancarParaRealista()
    }
    fun  avancarParaRealista(){


        println("Avançar para Nova Activity - Realista")
        val responsaveis= binding.editTextResponsaveis.text.toString()
        SharedData(this).storeString("responsaveis", responsaveis)


        var intenteRealista= Intent (this,RealistaActivity::class.java)
        intenteRealista.putExtra("estalo",estalo)
        startActivity(intenteRealista)
        finish()

    }


}