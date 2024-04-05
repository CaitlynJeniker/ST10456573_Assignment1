package com.example.st10456573_assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.TextView) // Define textView





        button.setOnClickListener {
            val userAgeString = findViewById<EditText>(R.id.TextNumberEnterYourAge).text.toString()
            val userAge = userAgeString.toIntOrNull()



            // Create a HashMap to store historical figures and their ages at death
            val historicalAges = hashMapOf(
                "Rosa Louise McCauley Parks- was an American activist in the civil rights movement best known for her pivotal role in the Montgomery bus boycott. " to 92,
                "Sarah 'Saartje' Baartman- was a Khoikhoi woman who was exhibited as a freak show attraction in 19th-century Europe under the name Hottentot Venus" to 26,
                "Mary Teresa better known as Mother Teresa- was an Albanian-Indian Catholic nun and the founder of the Missionaries of Charity" to 87,
                "Neil Alden Armstrong- was the first person to walk on the Moon " to 82,
                "Rosalind Elsie Franklin-was a British chemist and X-ray crystallographer whose work was central to the understanding of the molecular structures of DNA, RNA " to 37,
                "Whitney Elizabeth Houston- she is regarded as one of the greatest singers in the history of music and one of the best-selling music artists of all time, with over 220 million records sold worldwide" to 48,
                "Walter Elias Disney- was an American animator.As a film producer, he holds the record for most Academy Awards earned and nominations by an individual" to 65,
                "Diana, Princess of Wales- Her activism and glamour made her an international icon, and earned her enduring popularity" to 36,
                "Adolf Hitler-who was the dictator of Germany,he rose to power as the leader of the Nazi Party" to 56,
                "Christiaan Neethling Barnard-was a South African cardiac surgeon who performed the world's first human-to-human heart transplant operation" to 78
            )

        if (userAge != null) {
            // Find historical figures who died at the same age as the user
            val matchedFigures = historicalAges.filterValues { it == userAge }.keys

            if (matchedFigures.isNotEmpty()) {
                val result = StringBuilder()
                result.append("You share the same age as the following historical figures:\n")
                matchedFigures.forEach { result.append("$it\n") }
                textView.text = result.toString()
            } else {
                textView.text =
                    "There are no historical figures who died at the age of $userAge."
            }
        }


    }

    fun main(textView: TextView) {
            // Create a HashMap to store historical figures and their ages at death
            val historicalAges = hashMapOf(
                "Leonardo da Vinci" to 67,
                "Albert Einstein" to 76,
                "William Shakespeare" to 52,
                "Mahatma Gandhi" to 78,
                "Cleopatra" to 39
                // Add more historical figures and their ages as needed
            )

            // Get user input for age
            val userAgeString = findViewById<EditText>(R.id.TextNumberEnterYourAge).text.toString()
            val userAge = userAgeString.toIntOrNull()

            if (userAge != null) {
                // Find historical figures who died at the same age as the user
                val matchedFigures = historicalAges.filterValues { it == userAge }.keys

                if (matchedFigures.isNotEmpty()) {
                    val result = StringBuilder()
                    result.append("You share the same age as the following historical figures:\n")
                    matchedFigures.forEach { result.append("$it\n") }
                    textView.text = result.toString()
                } else {
                    textView.text =
                        "There are no historical figures who died at the age of $userAge."
                }
            }
        }
    }
}


