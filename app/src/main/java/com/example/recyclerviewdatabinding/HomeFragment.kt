package com.example.recyclerviewdatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdatabinding.data.Conversa
import com.example.recyclerviewdatabinding.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val colecaoConversas = mutableListOf<Conversa>(
            Conversa("Seu Barriga", "Seu Madruga, pague o Aluguel","21:31",R.drawable.imagem_00),
            Conversa("Seu Madruga", "Só não te dou outra porque, minha vózinha...","21:30",R.drawable.imagem_01),
            Conversa("Dona Florinda", "Prof. Girafales, não quer entrar e tomar uma xicará de café?","21:22",R.drawable.imagem_02),
            Conversa("Chaves", "Miau, é o outro gato.","21:00",R.drawable.imagem_03),
            Conversa("Chiquinha", "Ué, Ué, Ué ué ué","20:55",R.drawable.imagem_04),
        Conversa("Kiko", "Espera até ver minha bola Quadrada","20:42",R.drawable.imagem_05),
            Conversa("Bruxa do 71", "Satanás é você?","20:12",R.drawable.imagem_06),
            Conversa("Prof. Girafales", "Dooona Florinda!!!","20:04",R.drawable.imagem_07),
            Conversa("Nhonho", "Ai, Ai, Ai, minha barriguinha","19:58",R.drawable.imagem_08)

        )
    binding.recyclerView.adapter = Adaptador(colecaoConversas)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
    }

}