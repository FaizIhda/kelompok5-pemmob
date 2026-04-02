package com.uchiha.catatlari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.uchiha.catatlari.databinding.FragmentBerandaBinding

class BerandaFragment : Fragment() {

    private var _binding: FragmentBerandaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBerandaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // MENGAKTIFKAN LOGIKA KLIK:
        // Saat tombol plus hijau (btnStartRun) diklik, pindah ke halaman Form Catat Lari
        binding.btnStartRun.setOnClickListener {
            findNavController().navigate(R.id.action_berandaFragment_to_formCatatLari)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
