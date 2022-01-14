package jiho.pub.kotlinmvvm.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import jiho.pub.kotlinmvvm.data.model.Match
import jiho.pub.kotlinmvvm.ui.component.MatchAdapter

object BindingAdapter {
    @JvmStatic
    @BindingAdapter("setAdapter", "setItemList")
    fun setAdapter(view: RecyclerView, matchAdapter: MatchAdapter, itemList: ArrayList<Match>) {
        view.adapter = matchAdapter
        matchAdapter.submitList(itemList)
    }
}