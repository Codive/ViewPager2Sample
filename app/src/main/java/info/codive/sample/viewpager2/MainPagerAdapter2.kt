package info.codive.sample.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainPagerAdapter2(
    private val list: List<SampleData>,
    private val onBackButtonClicked: () -> Unit,
    private val onNextButtonClicked: () -> Unit,
    private val onEndButtonClicked: () -> Unit,
) :
    RecyclerView.Adapter<SampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_sample, parent, false)
        return SampleViewHolder(
            itemView,
            onBackButtonClicked,
            onNextButtonClicked,
            onEndButtonClicked,
        )
    }

    override fun onBindViewHolder(viewHolder: SampleViewHolder, position: Int) {
        val isFirst = position == 0
        val isLast = position == itemCount - 1
        viewHolder.bind(list[position], isFirst, isLast)
    }

    override fun getItemCount(): Int = list.size //ページ数
}