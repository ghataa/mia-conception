package com.ghataa.miaconception.ui.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ghataa.miaconception.R
import com.ghataa.miaconception.databinding.ItemMessageBinding
import com.ghataa.miaconception.model.Message

class MessageAdapter(private val items: List<Message>) : RecyclerView.Adapter<MessageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemMessageBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_message,
                parent,
                false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.message = items[position]
    }

    override fun getItemCount() = items.size

    class ViewHolder(val binding: ItemMessageBinding) : RecyclerView.ViewHolder(binding.root)
}