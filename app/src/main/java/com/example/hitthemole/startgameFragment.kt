package com.example.hitthemole


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.hitthemole.databinding.ActivityMainBinding
import com.example.hitthemole.databinding.FragmentMainBinding
import com.example.hitthemole.databinding.FragmentStartgameBinding
import kotlinx.android.synthetic.main.fragment_rank.*
import kotlinx.android.synthetic.main.fragment_startgame.*

/**
 * A simple [Fragment] subclass.
 */
class startgameFragment : Fragment() {
    private lateinit var binding: ActivityMainBinding
    var mywebview: WebView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentStartgameBinding>(inflater,R.layout.fragment_startgame, container, false)

        mywebview = binding.webview
        mywebview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        mywebview!!.loadUrl("https://www.facebook.com/ROVTH/")

        return binding.root

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_startgame, container, false)
    }




}
