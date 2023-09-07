package com.example.eni_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.eni_shop.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonValider.setOnClickListener {
            binding.textViewHelloWorld.text = binding.editTextForm.text.toString()
        }

    }
}

/*        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val editTextTitle = findViewById<EditText>(R.id.editTextTitle)
        val editTextDescription = findViewById<EditText>(R.id.editTextDescription)
        val editTextPrice = findViewById<EditText>(R.id.editTextPrice)
        val editTextReleaseDate = findViewById<EditText>(R.id.editTextReleaseDate)
        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        val textViewPrice = findViewById<TextView>(R.id.textViewPrice)
        val textViewReleaseDate = findViewById<TextView>(R.id.textViewReleaseDate)



        buttonSave.setOnClickListener {
            // Récupérez les données entrées par l'utilisateur depuis les EditTexts
            val title = editTextTitle.text.toString()
            val description = editTextDescription.text.toString()
            val price = editTextPrice.text.toString()
            val releaseDate = editTextReleaseDate.text.toString()

            // Affichez les données dans les TextViews correspondants
            "Titre : $title".also { textViewTitle.text = it }
            textViewDescription.text = "Description : $description"
            textViewPrice.text = "Prix : $price"
            textViewReleaseDate.text = "Sortie Initiale : $releaseDate"*/



