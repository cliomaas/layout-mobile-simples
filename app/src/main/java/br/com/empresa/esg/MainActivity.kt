package br.com.empresa.esg

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtSenha = findViewById<EditText>(R.id.edtSenha)
        val btnLogin = findViewById<MaterialButton>(R.id.materialButton)

        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString()
            val senha = edtSenha.text.toString()
            if (email != "" && senha != "") {
                val i = Intent(this, TelaInicial::class.java)
                i.putExtra("email", email)
                startActivity(i)
            } else {

                val contextView = findViewById<ConstraintLayout>(R.id.view)
                Snackbar.make(
                    contextView,
                    "Preencha as informações corretamente",
                    Snackbar.LENGTH_LONG
                )
                    .setBackgroundTint(resources.getColor(R.color.backgroundTint))
                    .show()
            }
        }

    }
}

