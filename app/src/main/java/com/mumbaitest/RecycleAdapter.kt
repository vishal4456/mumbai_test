package com.mumbaitest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mumbaitest.data.Data
import com.mumbaitest.databinding.UserBinding

class RecycleAdapter(val data: List<Data>)
    :RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: UserBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.ViewHolder {
        val binding = UserBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecycleAdapter.ViewHolder, position: Int) {
        val user = data[position]
        holder.binding.username.text =user.first_name
        holder.binding.year.text = user.last_name
        holder.binding.pantoneValue.text = user.email
    }

    override fun getItemCount(): Int {
       return data.size
    }
}