package com.example.hitthemole


import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.hitthemole.databinding.FragmentMainBinding
import com.example.hitthemole.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_plagame.*
import kotlinx.android.synthetic.main.fragment_title.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class titleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,R.layout.fragment_title, container, false)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_title, container, false)
    }



}
