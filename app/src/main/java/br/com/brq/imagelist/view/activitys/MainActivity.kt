package br.com.brq.imagelist.view.activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.brq.imagelist.R
import br.com.brq.imagelist.model.*
import br.com.brq.imagelist.view.adapter.GameAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    lateinit var gameAdapter: GameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        with(recycler_principal1) {
            adapter = GameAdapter(this@MainActivity, Lojaslist)
            layoutManager =
                LinearLayoutManager(this@MainActivity, horizontalFadingEdgeLength, false)
        }

        with(recycler_principal2) {
            adapter = GameAdapter(this@MainActivity, Ps4list)
            layoutManager =
                LinearLayoutManager(this@MainActivity, horizontalFadingEdgeLength, false)
        }

        with(recycler_principal3) {
            adapter = GameAdapter(this@MainActivity, Xboxlist)
            layoutManager =
                LinearLayoutManager(this@MainActivity, horizontalFadingEdgeLength, false)
        }

        with(recycler_principal4) {
            adapter = GameAdapter(this@MainActivity, Nintendolist)
            layoutManager =
                LinearLayoutManager(this@MainActivity, horizontalFadingEdgeLength, false)
        }

        with(recycler_principal5) {
            adapter = GameAdapter(this@MainActivity, Mobilelist)
            layoutManager =
                LinearLayoutManager(this@MainActivity, horizontalFadingEdgeLength, false)
        }

        with(recycler_principal6) {
            adapter = GameAdapter(this@MainActivity, gameslist)
            layoutManager =
                LinearLayoutManager(this@MainActivity, horizontalFadingEdgeLength, false)
        }

        with(recycler_principal7) {
            adapter = GameAdapter(this@MainActivity, gameslist)
            layoutManager =
                LinearLayoutManager(this@MainActivity, horizontalFadingEdgeLength, false)
        }

        with(recycler_principal8) {
            adapter = GameAdapter(this@MainActivity, gameslist)
            layoutManager =
                LinearLayoutManager(this@MainActivity, horizontalFadingEdgeLength, false)
        }

    }
}