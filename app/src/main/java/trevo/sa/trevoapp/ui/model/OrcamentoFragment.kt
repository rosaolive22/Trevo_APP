package trevo.sa.trevoapp.ui.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import trevo.sa.trevoapp.databinding.FragmentOrcamentoBinding


class OrcamentoFragment : Fragment() {

    private lateinit var binding: FragmentOrcamentoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         binding = FragmentOrcamentoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtOrcamento.text = "Orçamento"
    }

}