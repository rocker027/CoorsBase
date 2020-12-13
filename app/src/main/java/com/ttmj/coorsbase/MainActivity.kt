package com.ttmj.coorsbase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ttmj.coorsbase.databinding.ActivityMainBinding
import com.ttmj.coorsbase.databinding.ActivityMainBinding.inflate
import com.ttmj.coorsbase.utils.viewBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import reactivecircus.flowbinding.android.view.clicks

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}