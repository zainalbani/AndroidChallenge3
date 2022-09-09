package com.example.androidchallenge3

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class AbjadAdapter(private val listAbjad: ArrayList<MyAbjad>)
    : RecyclerView.Adapter<AbjadAdapter.ViewHolder>(){
    private lateinit var context : Context
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val abjad = itemView.findViewById<Button>(R.id.btnAbjad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_abjad_data, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.abjad.text = listAbjad[position].abjad
        holder.abjad.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                if(holder.abjad.length() == 1){
                    var bundle = Bundle()
                    bundle.putString("abjad_choosen", holder.abjad.text.toString())
                    Navigation.findNavController(holder.itemView).navigate(R.id.action_fragmentAbjad_to_fragmentKata,bundle)
                } else{
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=${holder.abjad.text.toString()}"))
                    context.startActivity(browserIntent)
                }
            }
        })
    }

    override fun getItemCount(): Int {
        return listAbjad.size
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }
}