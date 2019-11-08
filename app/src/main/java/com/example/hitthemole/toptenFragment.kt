package com.example.hitthemole


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.hitthemole.adapter.toptenadapter
import com.example.hitthemole.data.MyData
import com.example.hitthemole.databinding.ActivityMainBinding
import com.example.hitthemole.databinding.FragmentPlagameBinding
import com.example.hitthemole.databinding.FragmentToptenBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class toptenFragment : Fragment() {

    @SuppressLint("TimberArgCount")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val items = listOf(
            MyData("Omen สกิลติดตัว","การโจมตีปกติจะได้รับ 1 ความกระหาย ซึ่งหากสะสมเต็ม Omen จะวิ่งเร็วขึ้น 60 และโจมตีเร็วขึ้น 25% เป็นเวลา 5 วิ จากนั้นจากโจมตีปกติจะสร้าง ความเสียหายจริง 60 พร้อมลดคูลดาวน์ให้สกิล 1 และ 2 ครั้งละ 1 วิ มีโอกาสที่ Omen จะโจมตีทีเดียว 2 ครั้ง โดยครั้งที่ 2 จะเบาลง 50%"),
            MyData("Skill 1","Omen ใช้ดาบแส้ของเขาดึงฮีโร่ศัตรูเข้าหาตัวเอง สร้าง ความเสียหายกายภาพ 200 (+80% AD) พร้อมกับลดความเร็วเคลื่อนที่ลง 25%"),
            MyData("Skill 2","Omen เข้าสู่ภาวะหวาดระแวง ทำให้เขาลดความเสียหายที่ได้รับลง 50% และเพิ่มความเร็วเคลื่อนที่ 30% เป็นเวลา 2 วินอกจากนี้ Omen ยังสามารถสะท้อนความเสียหายจากการโจมตีปกติกลับไปยังผู้ที่โจมตีเขาด้วยความเสียหายกายภาพ พร้อมกับลดความเร็วลง 30% โดยความเสียหายที่สะท้อนกลับไป จะยังคงได้รับผลจากไอเทม และบัฟต่างๆ (สามารถสะท้อนการโจมตีจากศัตรูได้คนละครั้งเท่านั้น)")
        )

        val binding = DataBindingUtil.inflate<FragmentToptenBinding>(inflater, R.layout.fragment_topten, container, false)
        val adapter = toptenadapter()
        adapter.replaceItems(items)
        binding.recyclerView.adapter = adapter
        //Log.i("test","sssssssssssssss")
        Timber.i("topten called")
        Toast.makeText(context, "นี่คือฮีโร่ที่ควรหัดเล่น", Toast.LENGTH_SHORT).show()

        return binding.root

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_topten, container, false)
    }


}
