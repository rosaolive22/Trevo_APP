package trevo.sa.trevoapp.ui.model.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import trevo.sa.trevoapp.R
import trevo.sa.trevoapp.databinding.FragmentProdutoBinding
import trevo.sa.trevoapp.ui.model.Produto

class AdapterItem(private val context: Context,private val produto: MutableList<Produto>): RecyclerView.Adapter<AdapterItem.ProdutoViewHolder>(){

    private lateinit var binding: FragmentProdutoBinding

    //Cria os Itens
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        val holder = ProdutoViewHolder(itemLista)
        return holder
    }
    //Responsavel por exibir os itens
    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.imagem.setImageResource(produto[position].foto)
        holder.nome.text = produto[position].nome
        holder.botao.text = "Detalhes do Produto"
        holder.botao.bottom
    }
    //Informa tamanho da lista de itens
    override fun getItemCount(): Int = produto.size

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nome = itemView.findViewById<TextView>(R.id.item_nome)
        val imagem = itemView.findViewById<ImageView>(R.id.item_img)
        val botao = itemView.findViewById<Button>(R.id.botao_detalhes)

    }
}





