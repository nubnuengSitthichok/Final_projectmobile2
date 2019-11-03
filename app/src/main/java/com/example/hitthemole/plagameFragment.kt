package com.example.hitthemole


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.hitthemole.databinding.ActivityMainBinding
import com.example.hitthemole.databinding.FragmentMainBinding
import com.example.hitthemole.databinding.FragmentPlagameBinding
import kotlinx.android.synthetic.main.fragment_plagame.*
import kotlinx.android.synthetic.main.fragment_rank.*

/**
 * A simple [Fragment] subclass.
 */
class plagameFragment : Fragment() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentPlagameBinding>(inflater,R.layout.fragment_plagame, container, false)
        return binding.root


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_plagame, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



}