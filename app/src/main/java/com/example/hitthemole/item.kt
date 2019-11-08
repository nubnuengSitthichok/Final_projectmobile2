package com.example.hitthemole


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.hitthemole.databinding.ActivityMainBinding
import com.example.hitthemole.databinding.FragmentItemBinding
import com.example.hitthemole.databinding.FragmentRankBinding

/**
 * A simple [Fragment] subclass.
 */
class item : Fragment() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentItemBinding>(inflater,R.layout.fragment_item, container, false)        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_item, container, false)
        return binding.root

    }


}
