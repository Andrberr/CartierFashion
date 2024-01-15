package cartier.cartierwatch.michaelkors.asos

import androidx.recyclerview.widget.RecyclerView
import cartier.cartierwatch.michaelkors.asos.databinding.CollectionItemLayoutBinding
import com.bumptech.glide.Glide

class CollectionViewHolder(
    private val binding: CollectionItemLayoutBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Item) {
        with(binding) {
            titleView.text = item.title
            descriptionView.text = item.description
            Glide.with(itemView)
                .load(item.resId)
                .into(imageView)
        }
    }
}