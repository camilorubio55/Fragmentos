package com.example.fragmentnav


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_fragmento1.*
import kotlinx.android.synthetic.main.fragment_fragmento2.*

class Fragmento2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments.let {
            val rta = getArguments()?.getString("FRAG1")
            Toast.makeText(context,rta,Toast.LENGTH_SHORT).show()
        }
        IdbFrag2?.setOnClickListener {v -> Navigation.findNavController(v).navigate(R.id.action_fragmento2_to_fragmento3) }
    }

}
