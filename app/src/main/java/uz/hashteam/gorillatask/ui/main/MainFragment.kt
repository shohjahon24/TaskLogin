package uz.hashteam.gorillatask.ui.main

import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import uz.hashteam.gorillatask.R

class MainFragment : Fragment(R.layout.fragment_main), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_menu.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_menu -> {
                drawer?.openDrawer(GravityCompat.START)
            }
        }
    }

}
