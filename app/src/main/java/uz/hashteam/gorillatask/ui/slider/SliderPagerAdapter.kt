package uz.hashteam.gorillatask.ui.slider

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class SliderPagerAdapter(
    private val fragmentManager: FragmentManager
) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private var data: ArrayList<Fragment> = ArrayList()

    init {
        data.add(ItemSliderFragment())
        data.add(ItemLoremFragment())
        data.add(ItemLoremFragment())
    }
    override fun getCount() = data.size

    override fun getItem(position: Int): Fragment = data[position]
}