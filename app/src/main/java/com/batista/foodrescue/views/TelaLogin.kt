package com.batista.foodrescue.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.batista.foodrescue.R
import com.batista.foodrescue.databinding.FragmentTelaLoginBinding


class TelaLogin : Fragment() {
    private var _binding: FragmentTelaLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTelaLoginBinding.inflate(inflater, container, false)
        binding.buttonLogin.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTelaLogin_to_fragmentTelaListaProdutos)
        }
        return binding.root
    }

}