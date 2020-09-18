package uz.hashteam.gorillatask.ui.slider

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.item_slider.*
import uz.hashteam.gorillatask.R

class ItemSliderFragment : Fragment(R.layout.item_slider), View.OnClickListener {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        login.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.login)
            findNavController().navigate(R.id.action_fragmentSlider_to_loginFragment)
    }
}