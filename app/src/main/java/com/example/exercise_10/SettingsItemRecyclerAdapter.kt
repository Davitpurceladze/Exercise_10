package com.example.exercise_10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.exercise_10.databinding.SettingsItemBinding

class SettingsItemRecyclerAdapter(): ListAdapter<SettingsDataForRecycler.Item, SettingsItemRecyclerAdapter.RecyclerViewHolder>
    (object :DiffUtil.ItemCallback<SettingsDataForRecycler.Item>(){

    override fun areItemsTheSame(
        oldItem: SettingsDataForRecycler.Item,
        newItem: SettingsDataForRecycler.Item
    ): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(
        oldItem: SettingsDataForRecycler.Item,
        newItem: SettingsDataForRecycler.Item
    ): Boolean {
         return oldItem == newItem
    }
}) {

    fun setData(item: MutableList<SettingsDataForRecycler.Item>) {
        submitList(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = SettingsItemBinding.inflate(layoutInflater, parent, false)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind()
    }

    inner class RecyclerViewHolder(private val binding: SettingsItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind() {
            val item = currentList[adapterPosition]
            with(binding){
                imgSettingsItemIcon.setImageResource(item.icon)
                tvSettingsItemTitle.text = item.name
            }
        }
    }
}