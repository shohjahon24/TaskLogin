package uz.hashteam.gorillatask.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*
import uz.hashteam.gorillatask.R

class LoginFragment : Fragment(R.layout.fragment_login), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        login.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
    }
}