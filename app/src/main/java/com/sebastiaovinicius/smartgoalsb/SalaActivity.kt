package com.sebastiaovinicius.smartgoalsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sebastiaovinicius.smartgoalsb.databinding.ActivitySalaBinding

class SalaActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivitySalaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySalaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonValidar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id==R.id.button_validar){

            if(binding.editEstalo.text.toString()!="") {
               // chamarOfertaOuDemanda()
                callViewSpecific()
            }
            else{
                Toast.makeText(this,"Entre com um Texto", Toast.LENGTH_LONG).show()
            }
        }

    }
    fun callViewSpecific(){

        var descricaoMeta= binding.editEstalo.text.toString()

        var intencao= Intent (this,EspecificaActivity::class.java)

        intencao.putExtra("estalo",descricaoMeta)

        startActivity(intencao)

    }


}