package com.uchiha.catatlari

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.uchiha.catatlari.databinding.FragmentFormCatatLariBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [form_catat_lari.newInstance] factory method to
 * create an instance of this fragment.
 */



class form_catat_lari : Fragment() {
    private lateinit var FormcatatBinding: FragmentFormCatatLariBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        FormcatatBinding = FragmentFormCatatLariBinding.inflate(
            inflater,
            container,
            false
        )
        return FormcatatBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FormcatatBinding.buttonSimpan.setOnClickListener {
            val tanggalLari = FormcatatBinding.inputTanggal.text.toString()
            val jarakLari = FormcatatBinding.inputJarak.text.toString()
            val durasiLari = FormcatatBinding.inputDurasi.text.toString()

            if (tanggalLari.isEmpty() || jarakLari.isEmpty() || durasiLari.isEmpty())
                Toast.makeText(requireContext(), "Silahkan isi kotak yang kosong, bro!", Toast.LENGTH_SHORT).show()
            else {
                val simpanCatatLari = dataLari(tanggalLari, jarakLari, durasiLari)
                Toast.makeText(requireContext(), "Pencatatan berhasil disimpan!", Toast.LENGTH_SHORT).show()
//                findNavController().
            }
        }
    }
}