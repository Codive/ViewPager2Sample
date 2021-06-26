package info.codive.sample.viewpager2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(data: SampleData) {
        itemView.findViewById<TextView>(R.id.page_title).text = data.title
    }
}