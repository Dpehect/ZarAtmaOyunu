package com.yunusemre.kronometreuygulamas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yunusemre.kronometreuygulamas.databinding.ActivityMainBinding
import kotlin.properties.Delegates
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var sayi1 :Int = 0
    var sayi2 : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var kazanan: Int? = 0

        binding.zaratmabutonu.setOnClickListener {
             sayi1 = (1 until 7).random()
             sayi2 = (1 until 7).random()

            when(sayi1){
                1-> binding.resim1.setImageResource(R.drawable.zar1)
                2-> binding.resim1.setImageResource(R.drawable.zar2)
                3-> binding.resim1.setImageResource(R.drawable.zar3)
                4-> binding.resim1.setImageResource(R.drawable.zar4)
                5-> binding.resim1.setImageResource(R.drawable.zar5)
                6-> binding.resim1.setImageResource(R.drawable.zar6)
            }
            when(sayi2){
                1-> binding.resim2.setImageResource(R.drawable.zar1)
                2-> binding.resim2.setImageResource(R.drawable.zar2)
                3-> binding.resim2.setImageResource(R.drawable.zar3)
                4-> binding.resim2.setImageResource(R.drawable.zar4)
                5-> binding.resim2.setImageResource(R.drawable.zar5)
                6-> binding.resim2.setImageResource(R.drawable.zar6)
            }

            if(sayi1>sayi2){
                kazanan = sayi1
                sayi1 = 0
                sayi2 = 0
                binding.kazanantext.text="Oyuncu 1"

            }else if(sayi2>sayi1) {
                kazanan = sayi2
                sayi1 = 0
                sayi2 = 0
                binding.kazanantext.text="Oyuncu 2"

            }else{
                sayi1 = 0
                sayi2 = 0
                binding.kazanantext.text="Berabere"

            }
        }
        binding.sifirlabutonu.setOnClickListener {
            kazanan = null
            sayi1 = 0
            sayi2 = 0
            binding.kazanantext.text = ""
            binding.resim1.setImageResource(R.drawable.images)
            binding.resim2.setImageResource(R.drawable.images)

        }




    }
}