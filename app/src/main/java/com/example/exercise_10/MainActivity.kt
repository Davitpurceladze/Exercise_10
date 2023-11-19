package com.example.exercise_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercise_10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
    }

    private fun setUp() {
        val adapter = SettingsItemRecyclerAdapter()
        adapter.setData(SettingsDataForRecycler.getItems())
        binding.settingsRecycler.adapter = adapter
    }
}