package br.com.brq.imagelist.view.activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.brq.imagelist.R
import br.com.brq.imagelist.model.Games
import kotlinx.android.synthetic.main.activity_detalhe.*

class DetalheActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        val recebidos = intent.extras?.getSerializable("Key10") as Games

 // image_view_detalhe.background = resources.getDrawable(recebidos.foto_detalhe)//(recebidos.foto_detalhe)
        image_view_detalhe.setImageDrawable(resources.getDrawable(recebidos.foto_detalhe))
        text_view_detalhe_titulo.text = recebidos.titulo_detalhe
        textViewDes.text = recebidos.descricao


        buttonEntendi.setOnClickListener {
           finish()
        }
    }
}
