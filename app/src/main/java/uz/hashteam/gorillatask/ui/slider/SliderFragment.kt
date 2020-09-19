package uz.hashteam.gorillatask.ui.slider

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.fragment_slider.*
import uz.hashteam.gorillatask.R

class SliderFragment : Fragment(R.layout.fragment_slider), ViewPager.OnPageChangeListener,
    View.OnClickListener {
    private lateinit var adapter: SliderPagerAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        adapter = SliderPagerAdapter(childFragmentManager)
        view_pager.adapter = adapter
        view_pager.addOnPageChangeListener(this)
        login.setOnClickListener(this)
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

    override fun onPageSelected(position: Int) {
        setCurrentPoint(position)
    }

    override fun onPageScrollStateChanged(state: Int) {}

    private fun setCurrentPoint(position: Int) {
        context?.let {
            iv_point1?.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_unselected)
            iv_point2?.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_unselected)
            iv_point3?.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_unselected)

            when (position) {
                0 -> iv_point1?.background =
                    ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_selected)
                1 -> iv_point2?.background =
                    ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_selected)
                2 -> iv_point3?.background =
                    ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_selected)

            }
        }
        /* points?.children?.forEach {
             it.background =
                 ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_unselected)
         }
         points?.getChildAt(position)?.background =
             ContextCompat.getDrawable(requireContext(), R.drawable.bg_slider_point_selected)*/
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.login)
            findNavController().navigate(R.id.action_fragmentSlider_to_loginFragment)
    }
}