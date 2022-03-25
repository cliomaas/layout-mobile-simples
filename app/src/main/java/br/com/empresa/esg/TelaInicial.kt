package br.com.empresa.esg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.LinearLayout
import android.widget.TextView

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val bemVinda = findViewById<TextView>(R.id.textView_bemVinda)
        val email = intent.getStringExtra("email")
        val novoTexto = "Seja bem vindo(a), ${email}"
        bemVinda.text = novoTexto

        val cardPlantio = findViewById<LinearLayout>(R.id.cardPlantio)
        val cardReciclagem = findViewById<LinearLayout>(R.id.cardReciclagem)
        val textoPlantio = findViewById<TextView>(R.id.text_plant)
        val textoReciclagem = findViewById<TextView>(R.id.texto_reciclagem)

        cardPlantio.setOnClickListener {
            cardPlantio.setBackgroundResource(R.drawable.shape_banner_white)
            textoPlantio.typeface = resources.getFont(R.font.bebasneue_bold)
        }

        cardReciclagem.setOnClickListener {
            cardReciclagem.setBackgroundResource(R.drawable.shape_banner_white)
            textoReciclagem.typeface = resources.getFont(R.font.bebasneue_bold)
        }
    }


}