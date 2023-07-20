package trevo.sa.trevoapp.ui.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import trevo.sa.trevoapp.databinding.FragmentInfoClienteBinding


class Info_ClienteFragment : Fragment() {

    private lateinit var binding: FragmentInfoClienteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoClienteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtInfoCliente.text = "Adicionar mais informação"
    }

}