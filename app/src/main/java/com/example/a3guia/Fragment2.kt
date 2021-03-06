package com.example.a3guia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragment2(val salario:Double, val nombre:String) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        val textView1: TextView = view.findViewById(R.id.tv_salario)
        textView1.text = salario.toString()
        val textView2 : TextView = view.findViewById(R.id.tv_nombre)
        textView2.text = nombre
        return view
    }

}