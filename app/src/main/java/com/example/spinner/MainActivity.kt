package com.example.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener{
    private lateinit var itemSpinner: Spinner

    // Step 1: Create list
    val listItems = listOf("Chocolate","Strawberry","Vanilla","Mango")              //immutable list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        itemSpinner=findViewById(R.id.itemSpinner)



        //Step 2: Create Adapter
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item,listItems)  //default layout of spinner - layout of items present in the spinner
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)  //drop down layout - layout of the drop down layout
        itemSpinner.adapter = arrayAdapter

        //Step 3: Select ite,
        itemSpinner.onItemSelectedListener = this

    }

    override fun onItemSelected( parent: AdapterView<*>?,view: View?, position: Int,id: Long ) {
        val selectedItem = listItems[position]
        Toast.makeText(this, "You have selected: $selectedItem", Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}