package com.example.a3guia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        val textView1 : TextView = view.findViewById(R.id.tv_salario)

        val args1 = this.arguments
        val inputData1 = args1?.get("salario")
        textView1.text = inputData1.toString()
        val textView2 : TextView = view.findViewById(R.id.tv_nombre)

        val args2 = this.arguments
        val inputData2 = args2?.get("nombre")
        textView2.text = inputData2.toString()
        return view
    }

}