package com.carolmusyoka.caranimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carolmusyoka.caranimation.databinding.ActivitySelectDestinationBinding

class SelectDestination : AppCompatActivity() {
    private lateinit var binding: ActivitySelectDestinationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectDestinationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            CustomBottomSheetDialogFragment().apply {
                show(supportFragmentManager, tag)
            }
        }

    }
}