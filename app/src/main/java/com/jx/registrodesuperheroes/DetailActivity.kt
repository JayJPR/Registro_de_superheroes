package com.jx.registrodesuperheroes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jx.registrodesuperheroes.databinding.ActivityDetailBinding
import com.jx.registrodesuperheroes.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    companion object{
        const val SUPERHERO_KEY = "superhero"
        const val BITMAP_KEY = "bitmap"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val superhero = bundle.getParcelable<Superhero>(SUPERHERO_KEY)!!

        binding.superhero = superhero

    }
}