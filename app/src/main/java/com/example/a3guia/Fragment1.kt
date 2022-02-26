package com.example.a3guia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        val nxtbtn : Button = view.findViewById(R.id.btn_total)
        nxtbtn.setOnClickListener {
            val horas = R.id.Ed_horas
            val editText1 : EditText = view.findViewById(horas)
            val editText2 : EditText = view.findViewById(R.id.Ed_nombre)

            val input1 = editText1.text.toString()
            val salario = horas*8.50-((horas*8.50*0.02)+(horas*8.50*0.03)+(horas*8.50*0.04))
            val input2 = editText2.text.toString()
            val total = editText1.toString()
            val bundle = Bundle()
            bundle.putString("salario",input1)
            bundle.putString("nombre",input2)
            val fragment = Fragment2()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.nav_container,fragment)?.commit()
        }
        return view
    }

}