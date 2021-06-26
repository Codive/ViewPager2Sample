package info.codive.sample.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainPagerAdapter2(private val list: List<SampleData>) :
    RecyclerView.Adapter<SampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_sample, parent, false)
        return SampleViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: SampleViewHolder, position: Int) {
        viewHolder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size //ページ数
}