package com.example.alfaroid.ui.syariah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.alfaroid.databinding.FragmentSyariahBinding

class SyariahFragment : Fragment() {

    private var _binding: FragmentSyariahBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val syariahViewModel =
            ViewModelProvider(this).get(SyariahViewModel::class.java)

        _binding = FragmentSyariahBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textSyariah
//        syariahViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}