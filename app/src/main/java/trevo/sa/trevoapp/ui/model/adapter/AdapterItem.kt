package trevo.sa.trevoapp.ui.model.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import trevo.sa.trevoapp.R
import trevo.sa.trevoapp.ui.model.Produto
import trevo.sa.trevoapp.ui.model.ProdutoFragment

//Parâmetro add ao contrutor pr ser possível transmitir a lista
class AdapterItem(private val context: Context, private val produtos: MutableList<Produto>): RecyclerView.Adapter<AdapterItem.ItemViewHolder>() {

    //Criar itens:
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val itemList = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
       val holder = ItemViewHolder(itemList)
       return holder
    }
    //Mostrar itens:
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.botao.text = produtos[position].button
    }

    //Passar o tamanho da lista:
    override fun getItemCount(): Int = produtos.size

    inner class ItemViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val foto = itemview.findViewById<ImageView>(R.id.item_img)
        val nome = itemview.findViewById<TextView>(R.id.item_nome)
        val botao = itemview.findViewById<TextView>(R.id.botao_detalhes)
    }

}