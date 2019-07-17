package com.example.simplerecyclerviewfm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        var list = arrayListOf<CarModel>()
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "1"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "2"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "3"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "4"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "5"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "6"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "7"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "8"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "9"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "10"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "11"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "12"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "13"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "14"
            )
        )
        list.add(
            CarModel(
                R.drawable.car_black_80dp,
                "15"
            )
        )


        recyclerView.adapter = CarAdapter(list)
    }
}
