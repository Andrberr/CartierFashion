package cartier.cartierwatch.michaelkors.asos

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cartier.cartierwatch.michaelkors.asos.databinding.CollectionItemLayoutBinding

class CollectionAdapter : RecyclerView.Adapter<CollectionViewHolder>() {

    private val items = mutableListOf<Item>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val binding =
            CollectionItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CollectionViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.bind(items[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<Item>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }
}