package com.example.parkingmiejski

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.parkingmiejski.ui.theme.ParkingMiejskiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberOfHours = findViewById<SeekBar>(R.id.hoursBar)
        val hours = findViewById<TextView>(R.id.hours)

        numberOfHours.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                hours.text = "$progress h"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}

        })


    }

    fun CheckVehicleNumber(view: View){
        val numberOfVehicle = findViewById<EditText>(R.id.editTextId)
        val numberOfVehicleText = numberOfVehicle.text.toString()
        var amount = 0
        if ((numberOfVehicleText.length in 4..9) && (numberOfVehicleText.all { it.isLetterOrDigit() })){
            return
        }
        else{

        }
    }

    fun Counter(){
        val citezenCard = findViewById<CheckBox>(R.id.checkBox)
    }
}