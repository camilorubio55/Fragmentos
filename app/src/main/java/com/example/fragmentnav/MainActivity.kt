package com.example.fragmentnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_fragmento1.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IdbFrag1?.setOnClickListener {v -> Navigation.findNavController(v).navigate(R.id.action_fragmento1_to_fragmento2) }
    }
}
