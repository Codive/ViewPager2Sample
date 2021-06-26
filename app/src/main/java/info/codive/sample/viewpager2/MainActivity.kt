package info.codive.sample.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

private const val PAGE_MAX: Int = 5

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //テストデータ作成
        val listItem = createTestData()

        val viewPager = findViewById<ViewPager2>(R.id.sample_view_pager2)
        val pagerAdapter2 = MainPagerAdapter2(listItem)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = pagerAdapter2

//        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
//            override fun onPageScrolled(
//                position: Int,
//                positionOffset: Float,
//                positionOffsetPixels: Int
//            ) {}
//        })
    }

    // テストデータ作成
    private fun createTestData(): MutableList<SampleData> {
        val listItem = mutableListOf<SampleData>()
        for (i in 1..PAGE_MAX) {
            listItem.add(SampleData("Title $i"))
        }
        return listItem
    }
}