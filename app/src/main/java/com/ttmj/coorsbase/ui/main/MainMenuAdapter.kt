package com.ttmj.coorsbase.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ttmj.coorsbase.databinding.ItemMainMenuBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.ldralighieri.corbind.view.clicks

class MainMenuAdapter :
    RecyclerView.Adapter<MainMenuAdapter.ViewHolder>() {
    interface ItemClickListener {
        fun onItemClick(title: String)
    }

    private var data = mutableListOf(
        "TransformationLayout",
        "test 1",
        "test 12",
        "test 123",
        "test 124"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBing: ItemMainMenuBinding =
            ItemMainMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(viewBing)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(private val binding: ItemMainMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(title: String) {
            with(binding) {
                tvMenuTitle.text = title
//                root.setOnClickListener { Toast.makeText(binding.root.context, title, Toast.LENGTH_SHORT).show() }
                root.clicks()
                    .onEach {
                        Toast.makeText(binding.root.context, title, Toast.LENGTH_SHORT).show()
                    }


            }
        }
    }
}