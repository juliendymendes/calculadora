package com.me.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.me.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //vinculação de views
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val operacaoTv = binding.operacaoTv
        val resultadoTv = binding.resultadoTv

        binding.acBtn.setOnClickListener {
            operacaoTv.text = ""
            resultadoTv.text = ""
        }

        binding.zeroBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.zeroBtn)
        }
        binding.umBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.umBtn)
        }
        binding.doisBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.doisBtn)
        }
        binding.tresBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.tresBtn)
        }
        binding.quatroBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.quatroBtn)
        }
        binding.cincoBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.cincoBtn)
        }
        binding.seisBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.seisBtn)
        }
        binding.seteBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.seteBtn)
        }
        binding.oitoBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.oitoBtn)
        }
        binding.noveBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.noveBtn)
        }

        binding.adicaoBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.adicaoBtn)
        }
        binding.subtracaoBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.subtracaoBtn)
        }
        binding.divisaoBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.divisaoBtn)
        }
        binding.multiplicacaoBtn.setOnClickListener {
            atualizaViewOperacao(operacaoTv, binding.multiplicacaoBtn)
        }

        binding.igualBtn.setOnClickListener {
            binding.resultadoTv.text = Calculadora.calcular(operacaoTv.text.toString()).toString()
        }


    }

    // atualiza o TextView que mostra o que está sendo digitado
    private fun atualizaViewOperacao(tv: TextView, button: Button){
        (tv.text.toString() + button.text.toString()).also { tv.text = it }
    }



}

