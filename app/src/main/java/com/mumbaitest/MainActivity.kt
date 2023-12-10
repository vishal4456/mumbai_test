package com.mumbaitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mumbaitest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var vm : MainVm
    lateinit var binding: ActivityMainBinding
    lateinit var adapter : RecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        vm = ViewModelProvider(this)[MainVm::class.java]
        onClick()
        observer()
    }
    private fun setRecycler(){

    }
    private fun observer(){

        vm.apiResult2.observe(this){
            adapter = RecycleAdapter(it.data)
            val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
            binding.rcView.layoutManager = layoutManager
            binding.rcView.adapter = adapter

        }
    }

    private fun onClick() {
        binding.tvView.setOnClickListener {
            vm.UserLogin()

        }
    }
}