package com.trinad.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf<String>("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random: Random = Random()
            var randomFood: Int = random.nextInt(foodList.count())

            selectedFoodText.text = foodList.get(randomFood)
        }

        addFoodButton.setOnClickListener {
            val foodText: String = addFoodText.text.toString()
            foodList.add(foodText)
            addFoodText.text.clear()
        }
    }
}
