package com.uchiha.catatlari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.uchiha.catatlari.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Logic Tombol Login
        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(requireContext(), "Email dan Password harus diisi!", Toast.LENGTH_SHORT).show()
            } else {
                // Simulasi verifikasi (Sesuai permintaanmu)
                if (email == "user@email.com" && password == "12345") {
                    Toast.makeText(requireContext(), "Selamat Datang!", Toast.LENGTH_SHORT).show()

                    // PINDAH KE BERANDA MENGGUNAKAN NAVIGATION COMPONENT
                    // Pastikan action ini sudah ada di nav_graph.xml
                    findNavController().navigate(
                        LoginFragmentDirections.actionLoginFragment2ToBerandaFragment()
                    )
                } else {
                    Toast.makeText(requireContext(), "Email atau Password salah", Toast.LENGTH_SHORT).show()
                }
            }
        }

        // Logic link ke Register (Jika diperlukan)
        binding.tvRegisterLink.setOnClickListener {
            findNavController().navigate(
                LoginFragmentDirections.actionLoginFragment2ToRegisterCatatLari()
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}