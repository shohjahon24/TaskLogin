package uz.hashteam.gorillatask.ui.slider

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class SliderPagerAdapter(
    private val data: List<Fragment>,
    private val fragmentManager: FragmentManager
) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount() = data.size

    override fun getItem(position: Int): Fragment = data[position]
}