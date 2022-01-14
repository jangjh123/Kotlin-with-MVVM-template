package jiho.pub.kotlinmvvm.ui.component

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jiho.pub.kotlinmvvm.data.model.Match
import jiho.pub.kotlinmvvm.databinding.ItemMatchBinding
import jiho.pub.kotlinmvvm.domain.component.GenericDiffUtil

class MatchAdapter : ListAdapter<Match, RecyclerView.ViewHolder>(GenericDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            ItemMatchBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder) {
            val match = getItem(position)
            holder.bind(match)
        }
    }

    inner class ViewHolder(private val binding: ItemMatchBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(match: Match) {
            with(binding) {
                textViewMatch.text = match.name
            }
        }
    }
}