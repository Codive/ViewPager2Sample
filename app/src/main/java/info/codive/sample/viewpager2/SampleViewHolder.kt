package info.codive.sample.viewpager2

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleViewHolder(
    itemView: View,
    private val onBackButtonClicked: () -> Unit,
    private val onNextButtonClicked: () -> Unit,
    private val onEndButtonClicked: () -> Unit,
) : RecyclerView.ViewHolder(itemView) {

    private val titleLabel = itemView.findViewById<TextView>(R.id.page_title)
    private val backButton = itemView.findViewById<Button>(R.id.back_button)
    private val nextButton = itemView.findViewById<Button>(R.id.next_button)

    fun bind(data: SampleData, isFirst: Boolean, isLast: Boolean) {
        titleLabel.text = data.title

        //BACKボタンのイベント処理割り当て
        if (isFirst) {
            //最初のページの場合「BACKボタン」は非表示
            backButton.visibility = View.INVISIBLE
        } else {
            //前のページに戻る
            backButton.setOnClickListener { onBackButtonClicked() }
        }

        //NEXTボタンのイベント処理割り当て
        if (isLast) {
            //最後のページの場合「NEXTボタン」を「ENDボタンに変更」
            nextButton.text = "END"
            nextButton.setOnClickListener { onEndButtonClicked() }
        } else {
            //次のページに進む
            nextButton.setOnClickListener { onNextButtonClicked() }
        }
    }
}