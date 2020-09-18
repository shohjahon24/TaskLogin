package uz.hashteam.gorillatask.ui.slider

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.fragment_slider.*
import uz.hashteam.gorillatask.R

class SliderFragment : Fragment(R.layout.fragment_slider), ViewPager.OnPageChangeListener {
    private lateinit var adapter: SliderPagerAdapter
    private var data: ArrayList<Fragment> = ArrayList()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        data.add(ItemSliderFragment())
        data.add(ItemLoremFragment())
        data.add(ItemLoremFragment())
        adapter = SliderPagerAdapter(data, childFragmentManager)
        view_pager.adapter = adapter
        view_pager.addOnPageChangeListener(this)
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

    override fun onPageSelected(position: Int) {
        setCurrentPoint(position)
    }

    override fun onPageScrollStateChanged(state: Int) {}

    private fun setCurrentPoint(position: Int) {
        points.children.forEach {
            it.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_unselected)
        }
        points.getChildAt(position).background =
            ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_selected)
    }
}