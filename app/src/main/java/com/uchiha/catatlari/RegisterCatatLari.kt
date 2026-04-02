package com.uchiha.catatlari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.uchiha.catatlari.databinding.FragmentRegisterCatatLariBinding

class RegisterCatatLari : Fragment() {

    private var _binding: FragmentRegisterCatatLariBinding? = null
    private val binding get() = _binding!!

    // Variabel penampung data class dari Data.kt
    private var userTerdaftar: DataUser? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterCatatLariBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Logic Klik Tombol Sign Up
        binding.btnSignUp.setOnClickListener {
            val nama = binding.etName.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            if (nama.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(requireContext(), "Lengkapi data dulu ya!", Toast.LENGTH_SHORT).show()
            } else {
                // SIMPAN KE DATA CLASS (Data.kt)
                userTerdaftar = DataUser(nama, email, password)

                Toast.makeText(requireContext(), "Berhasil daftar, $nama!", Toast.LENGTH_SHORT).show()

                // PINDAH KE BERANDA
                findNavController().navigate(
                    RegisterCatatLariDirections.actionRegisterCatatLariToBerandaFragment()
                )
            }
        }

        // Kembali ke Login
        binding.tvLoginAction.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}