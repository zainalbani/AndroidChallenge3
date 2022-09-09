package com.example.androidchallenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidchallenge3.databinding.FragmentAbjadBinding
import com.example.androidchallenge3.databinding.FragmentKataBinding


class FragmentKata : Fragment() {
    private var _binding : FragmentKataBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var abjadDipilih = arguments?.getString("abjad_choosen")

        if(abjadDipilih == "A"){
            dipilihA()
        }else if(abjadDipilih == "B"){
            dipilihB()
        }else if(abjadDipilih == "C"){
            dipilihC()
        }else if(abjadDipilih == "D"){
            dipilihD()
        }else if(abjadDipilih == "E"){
            dipilihE()
        }else if(abjadDipilih == "F"){
            dipilihF()
        }else if(abjadDipilih == "G"){
            dipilihG()
        }else if(abjadDipilih == "H"){
            dipilihH()
        }else if(abjadDipilih == "I"){
            dipilihI()
        }else if(abjadDipilih == "J"){
            dipilihJ()
        } else{
            Toast.makeText(context, "Belum memberikan List", Toast.LENGTH_SHORT).show()
        }
    }
    fun dipilihA(){
        val listKata = arrayListOf(
            MyAbjad("Abjad"),
            MyAbjad("Aespa"),
            MyAbjad("AI"),
            MyAbjad("Air"),
            MyAbjad("Alam"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihB(){
        val listKata = arrayListOf(
            MyAbjad("Binar"),
            MyAbjad("Bakugou"),
            MyAbjad("Batam"),
            MyAbjad("Bazar"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihC(){
        val listKata = arrayListOf(
            MyAbjad("Cair"),
            MyAbjad("Chen"),
            MyAbjad("Chanyeol"),
            MyAbjad("Cinta"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihD(){
        val listKata = arrayListOf(
            MyAbjad("Dokar"),
            MyAbjad("Donat"),
            MyAbjad("Drakula"),
            MyAbjad("Dora"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihE(){
        val listKata = arrayListOf(
            MyAbjad("Ebay"),
            MyAbjad("Everyday"),
            MyAbjad("Everytime"),
            MyAbjad("EXO"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihF(){
        val listKata = arrayListOf(
            MyAbjad("Fancy"),
            MyAbjad("Future"),
            MyAbjad("Fragment"),
            MyAbjad("Freak"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihG(){
        val listKata = arrayListOf(
            MyAbjad("Gaara"),
            MyAbjad("Giselle"),
            MyAbjad("Gojou"),
            MyAbjad("Gon"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihH(){
        val listKata = arrayListOf(
            MyAbjad("Hanasui"),
            MyAbjad("Himalaya"),
            MyAbjad("Hitomi"),
            MyAbjad("Honda"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihI(){
        val listKata = arrayListOf(
            MyAbjad("Icon"),
            MyAbjad("Iguana"),
            MyAbjad("Islam"),
            MyAbjad("Island"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
    fun dipilihJ(){
        val listKata = arrayListOf(
            MyAbjad("Joglo"),
            MyAbjad("Jogja"),
            MyAbjad("Job"),
            MyAbjad("Jawa"),
        )

        val adapter = AbjadAdapter(listKata)

        val layoutManager = LinearLayoutManager(context)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerViewKata)

        recyclerView?.layoutManager = layoutManager

        recyclerView?.adapter = adapter
    }
}