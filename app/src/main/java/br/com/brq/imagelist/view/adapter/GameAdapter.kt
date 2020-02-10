package br.com.brq.imagelist.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.imagelist.R
import br.com.brq.imagelist.model.Games
import br.com.brq.imagelist.view.activitys.DetalheActivity
import kotlinx.android.synthetic.main.item_recycler.view.*


class GameAdapter(private val context: Context, private var gameslist: MutableList<Games>) :
    RecyclerView.Adapter<GameAdapter.GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameAdapter.GameViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycler, parent, false)

        return GameViewHolder(view)
    }

    override fun getItemCount(): Int = gameslist.size

    override fun onBindViewHolder(holder: GameAdapter.GameViewHolder, position: Int) {
        holder.bindView(gameslist[position])

    }

    class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titulo = itemView.titulo_listt_text_view
        val foto_externa = itemView.image_list_image_view

        fun bindView(games: Games) {
            titulo.text = games.titulo
            foto_externa.setBackgroundResource(games.foto_lista)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetalheActivity::class.java)
                intent.putExtra("Key10", games)
                itemView.context.startActivity(intent)

            }
        }
    }
}