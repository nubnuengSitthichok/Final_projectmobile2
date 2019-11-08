package com.example.hitthemole
import android.graphics.drawable.AnimationDrawable
import android.media.Image
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
import androidx.core.os.postDelayed
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.hitthemole.databinding.ActivityMainBinding
import com.example.hitthemole.databinding.FragmentMainBinding
import com.example.hitthemole.databinding.FragmentPlagameBinding
import kotlinx.android.synthetic.main.fragment_plagame.*
import kotlinx.android.synthetic.main.fragment_rank.*
import kotlinx.coroutines.handleCoroutineException
import org.w3c.dom.Text
import kotlin.random.Random
import androidx.annotation.NonNull
import kotlinx.android.synthetic.main.fragment_main.*



/**
 * A simple [Fragment] subclass.
 */
class plagameFragment : Fragment() {

    internal lateinit var mole1 : ImageView
    internal lateinit var mole2 : ImageView
    internal lateinit var mole3 : ImageView
    internal lateinit var mole4 : ImageView
    internal lateinit var mole5 : ImageView
    internal lateinit var  tv_left : TextView
    internal lateinit var  tv_score : TextView
    internal lateinit var  start_button: Button
    internal lateinit var  r : Random
    internal lateinit var handler: Handler
    //internal  lateinit var x : AnimationDrawable
    internal  lateinit var  contextCompat : ContextCompat
    var score = 0
    var fps = 1000
    var left = 5
    var tempifleft =0
    var which = 0
    var witchsave = 0

    private lateinit var binding: ActivityMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentPlagameBinding>(inflater, R.layout.fragment_plagame, container, false)
        mole1 = binding.mole1
        mole2 = binding.mole2
        mole3 = binding.mole3
        mole4 = binding.mole4
        mole5 = binding.mole5
        start_button = binding.startButton
        tv_left = binding.tvLeft
        tv_score = binding.tvScore

//        mole1.visibility = View.INVISIBLE
//        mole2.visibility = View.INVISIBLE
//        mole3.visibility = View.INVISIBLE
//        mole4.visibility = View.INVISIBLE
//        mole5.visibility = View.INVISIBLE

        binding.startButton.setOnClickListener {
            left = 5
            tv_left.setText("LEFT: $left"  )
            score = 0
            tv_score.setText("SCORE: $score")
            handler = Handler()
            handler.postDelayed(object : Runnable {
                override fun run() {
                    theGameActions()
                }
            }, 1000)
            start_button.isEnabled = false
       }
        binding.mole1.setOnClickListener {
            tempifleft = 1
            binding.mole1.setImageResource(R.drawable.molehit)
            score = score + 1
            tv_score.setText("SCORE: $score " )
            mole1.isEnabled = false
        }
        binding.mole2.setOnClickListener {
            tempifleft = 1
            binding.mole2.setImageResource(R.drawable.molehit)
            score = score + 1
            tv_score.setText("SCORE :  $score" )
            mole2.isEnabled = false
        }
        binding.mole3.setOnClickListener {
            tempifleft = 1
            binding.mole3.setImageResource(R.drawable.molehit)
            score = score + 1
            tv_score.setText("SCORE: $score" )
            mole3.isEnabled = false
        }
        binding.mole4.setOnClickListener {
            tempifleft = 1
            binding.mole4.setImageResource(R.drawable.molehit)
            score = score + 1
            tv_score.setText("SCORE: $ score" )
            mole4.isEnabled = false
        }
        binding.mole5.setOnClickListener {

            tempifleft = 1
            binding.mole5.setImageResource(R.drawable.molehit)
            score = score + 1
            tv_score.setText("SCORE: $ score")
            mole5.isEnabled = false
        }
        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_plagame, container, false)
    }
    private fun  theGameActions() {

        if (score < 10)
        {
            fps = 1000
        }
        else if (score >= 10 && score < 15)
        {
            fps = 950
        }
        else if (score >= 15 && score < 20)
        {
            fps = 900
        }
        else if (score >= 20 && score < 25)
        {
            fps = 850
        }
        else if (score >= 25 && score < 30)
        {
            fps = 800
        }
        else if (score >= 30 && score < 35)
        {
            fps = 750
        }
        else if (score >= 35 && score < 40)
        {
            fps = 700
        }
        else if (score >= 40 && score < 45)
        {
            fps = 650
        }
        else if (score >= 45 && score < 50)
        {
            fps = 600
        }
        else if (score >= 50 && score < 55)
        {
            fps = 550
        }
        else if (score >= 55 && score < 60)
        {
            fps = 500
        }
        else if (score >= 60 && score < 65)
        {
            fps = 450
        }
        else if (score >= 65 && score < 70)
        {
            fps = 400
        }
        else if (score >= 70)
        {
            fps = 350
        }
       // var xx =  frameAnimation: AnimationDrawable = drawable.anim as AnimationDrawable

//         x = ContextCompat.getDrawable(context!!, R.drawable.anim) as AnimationDrawable
//           x = ContextCompat.getDrawable(context!!, R.drawable.anim) as AnimationDrawable
//        do {
//            which = Random.nextInt(5)+1
//        } while (witchsave == which)
//        witchsave = which
//
//        if(which == 1 ){
//            mole1.setImageDrawable(x)
//            mole1.visibility = View.VISIBLE
//            mole1.isEnabled = true

//        }else if(which == 2 ){
//            mole2.setImageDrawable(x)
//            mole2.visibility = View.VISIBLE
//            mole2.isEnabled = true
//        }else if(which == 3 ){
//            mole3.setImageDrawable(x)
//            mole3.visibility = View.VISIBLE
//            mole3.isEnabled = true
//
//        }else if(which == 4 ){
//            mole4.setImageDrawable(x)
//            mole4.visibility = View.VISIBLE
//            mole4.isEnabled = true
//
//        }else if(which == 5 ){
//            mole5.setImageDrawable(x)
//            mole5.visibility = View.VISIBLE
//            mole5.isEnabled = true
//        }
//        x.start()

        handler = Handler()
        handler.postDelayed(object : Runnable {
             override fun run() {
                mole1.visibility = View.INVISIBLE
                mole2.visibility = View.INVISIBLE
                mole3.visibility = View.INVISIBLE
                mole4.visibility = View.INVISIBLE
                mole5.visibility = View.INVISIBLE

                mole1.isEnabled = false
                mole2.isEnabled = false
                mole3.isEnabled = false
                mole4.isEnabled = false
                mole5.isEnabled = false

                if(tempifleft == 0)
                {
                    left =  left - 1
                    tv_left.setText("LEFT: $left" );
                }else if (tempifleft == 1){
                    tempifleft = 0

                }
                if (left == 0){
                    Toast.makeText(activity, "GAME OVER", Toast.LENGTH_LONG).show()
                    start_button.isEnabled = true
                }else if (left < 0){
                    theGameActions()
                }
            }
        }, fps.toLong())


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
    }







}