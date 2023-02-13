package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersOfCustomers = intent.getStringExtra(MainActivity.KEY)
        tVOrder.text = "order placed\n" + ordersOfCustomers.toString()
    }
}