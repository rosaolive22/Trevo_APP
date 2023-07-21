package trevo.sa.trevoapp.ui.model

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import trevo.sa.trevoapp.R
import trevo.sa.trevoapp.databinding.FragmentProdutoBinding
import trevo.sa.trevoapp.ui.model.adapter.AdapterItem
import android.content.Intent
import trevo.sa.trevoapp.ui.model.Info_ProdutoFragment

class ProdutoFragment : Fragment() {

    private lateinit var binding: FragmentProdutoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflar o layout do fragmento
        binding = FragmentProdutoBinding.inflate(inflater, container, false)

        // Inicializar a RecyclerView
        val recyclerView: RecyclerView = binding.txtProduto
        // Configurar o layout manager
        recyclerView.layoutManager = LinearLayoutManager(context)
        // Fornece mais desempenho
        recyclerView.setHasFixedSize(true)


        // Configurar o Adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterItem = AdapterItem(requireContext(), listaProdutos)
        recyclerView.adapter = adapterItem


        //Criar os itens de modo manual
        val produto1 = Produto(
            R.drawable.meridia200,
            "Meridian 200",
            button = "Ver Detalhes"

        )
        listaProdutos.add(produto1)

        //Criar os itens de modo manual
        val produto2 = Produto(
            R.drawable.hover500,
            "Hover 500",
            "Ver Detalhes"
        )
        listaProdutos.add(produto2)

        //Criar os itens de modo manual
        val produto3 = Produto(
            R.drawable.k3500,
            "K 3500",
            "Ver Detalhes"
        )
        listaProdutos.add(produto3)

        //Criar os itens de modo manual
        val produto4 = Produto(
            R.drawable.uniport5030,
            "Uniport 5030",
            "Ver Detalhes"
        )
        listaProdutos.add(produto4)




        return binding.root
    }
}