package com.uchiha.catatlari

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout fragment_login
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        // Inisialisasi View
        val etEmail = view.findViewById<TextInputEditText>(R.id.etEmail)
        val etPassword = view.findViewById<TextInputEditText>(R.id.etPassword)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        val tvRegisterLink = view.findViewById<TextView>(R.id.tvRegisterLink)

        // Logic Klik Tombol Login
        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(requireContext(), "Email dan Password harus diisi!", Toast.LENGTH_SHORT).show()
            } else {
                // Simulasi verifikasi login
                if (email == "user@email.com" && password == "12345") {
                    Toast.makeText(requireContext(), "Selamat Datang!", Toast.LENGTH_SHORT).show()

                    // Pindah ke MainActivity
                    val intent = Intent(requireContext(), MainActivity::class.java)
                    startActivity(intent)
                    activity?.finish()
                } else {
                    Toast.makeText(requireContext(), "Email atau Password salah", Toast.LENGTH_SHORT).show()
                }
            }
        }

        // Logic Klik link "Daftar"
        tvRegisterLink.setOnClickListener {
            // Di sini kamu bisa tambahkan perpindahan ke Fragment Registrasi
            Toast.makeText(requireContext(), "Membuka halaman pendaftaran...", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}