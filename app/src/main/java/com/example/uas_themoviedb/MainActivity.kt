package com.example.uas_themoviedb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uas_themoviedb.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPageAdapter(supportFragmentManager, lifecycle)

        with(binding){
            viewPager.adapter = viewPagerAdapter

            TabLayoutMediator(botLayout, viewPager) { tab, position ->
                when(position){
                    0 -> tab.setIcon(R.drawable.baseline_local_movies_24).text = "Movie"
                    1 -> tab.setIcon(R.drawable.ic_live_tv_24).text = "TV"
                }
            }.attach()
        }
    }
}