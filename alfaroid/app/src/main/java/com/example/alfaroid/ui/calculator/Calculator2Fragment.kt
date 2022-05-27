package com.example.alfaroid.ui.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.alfaroid.R
import com.example.alfaroid.databinding.FragmentCalculator2Binding

class Calculator2Fragment : Fragment() {

    private var _binding: FragmentCalculator2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCalculator2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val next2: Button = binding.next2
        next2.setOnClickListener { view ->
            view.findNavController().navigate(R.id.calculator3Fragment)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}