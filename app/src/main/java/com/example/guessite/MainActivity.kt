package com.example.guessite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        val wordtoguess = FourLetterWordList.getRandomFourLetterWord.getRandomFourLetterWord()
        val guessesField = findViewById<TextView>(R.id.guesses_view)
        val editText = findViedById<EditText>(R.id.four_letter)
        val showAnswer = findViewById<TextView>(R.id.info_view)
        val debugView = findViewById<TextView>(R.id.guess_wrd)

        val button = findViewById<Button>(R.id.button)
            var guessLimit = 3
            var checkGuessDisplay = ""
            var userInputDisplay = ""

            button.setOnClickListener {////view it

                if (guessLimit == 0){
                    finish()
                    overridePendingTransition();/////
                    startActivity(intent):
                    overridePendingTransition();////
                }

                counter++
                if (counter >= 3) {
                    Toast.makeText(
                        it.context,
                        /////
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}