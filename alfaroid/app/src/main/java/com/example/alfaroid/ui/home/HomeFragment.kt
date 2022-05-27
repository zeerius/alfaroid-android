package com.example.alfaroid.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.alfaroid.MainActivity
import com.example.alfaroid.R
import com.example.alfaroid.databinding.FragmentHomeBinding
import com.example.alfaroid.ui.calculator.CalculatorFragment

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        val calc: Button = binding.calc
        calc.setOnClickListener { view ->
            view.findNavController().navigate(R.id.navigation_calculator)
        }

        val all_schedules: TextView = binding.allSchedules
        all_schedules.setOnClickListener { view ->
            view.findNavController().navigate(R.id.navigation_schedule)
        }

        val all_syariah: TextView = binding.allSyariah
        all_syariah.setOnClickListener { view ->
            view.findNavController().navigate(R.id.navigation_syariah)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}