package com.example.androidchallenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidchallenge3.databinding.FragmentAbjadBinding

class FragmentAbjad : Fragment() {

    private var _binding: FragmentAbjadBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAbjadBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listAbjad = arrayListOf(
            MyAbjad("A"),
            MyAbjad("B"),
            MyAbjad("C"),
            MyAbjad("D"),
            MyAbjad("E"),
            MyAbjad("F"),
            MyAbjad("G"),
            MyAbjad("H"),
            MyAbjad("I"),
            MyAbjad("J"),
        )

        val adapter = AbjadAdapter(listAbjad)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewAbjad)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter
    }

}