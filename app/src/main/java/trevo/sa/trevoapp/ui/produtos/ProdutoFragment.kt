package trevo.sa.trevoapp.ui.produtos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import trevo.sa.trevoapp.databinding.FragmentProdutoBinding


class ProdutoFragment : Fragment() {

    private lateinit var binding: FragmentProdutoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProdutoBinding.inflate(inflater, container, false)
        return binding.root
    }
 //   val recyclerView_produto = findViewById<RecyclerView>(R.id.nav_produto)
//        recyclerView_produto.layoutManager = LinearLayoutManager(this)
//        recyclerView_produto.setHasFixedSize(true)//fornece mais desempenho

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtProduto.text = "Produto"
    }
}