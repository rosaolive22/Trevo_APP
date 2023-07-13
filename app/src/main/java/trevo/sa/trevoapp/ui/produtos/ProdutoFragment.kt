package trevo.sa.trevoapp.ui.produtos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import trevo.sa.trevoapp.databinding.FragmentProdutoBinding


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

       return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}