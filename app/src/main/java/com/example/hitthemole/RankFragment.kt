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
import com.example.hitthemole.databinding.FragmentRankBinding
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_rank.*

/**
 * A simple [Fragment] subclass.
 */
class RankFragment : Fragment() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentRankBinding>(inflater,R.layout.fragment_rank, container, false)
        return inflater.inflate(R.layout.fragment_rank, container, false)
        setHasOptionsMenu(true)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        home_inrank_button.setOnClickListener {
            findNavController().navigate(R.id.rankFragment_to_mainFragment)
        }

    }


}





