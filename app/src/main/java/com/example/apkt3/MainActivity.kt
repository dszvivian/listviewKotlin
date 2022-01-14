package com.example.apkt3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arr = listOf("Lionel Messi\tForward" ,
                "Cristiano Ronaldo\tForward" ,
                "Xavi\tMidfielder" ,
                "Andres Iniesta\tMidfielder" ,
                "Zlatan Ibrahimovic\tForward" ,
                "Radamel Falcao\tForward" ,
                "Robin van Persie\tForward" ,
                "Andrea Pirlo\tMidfielder" ,
                "Yaya Toure\tMidfielder" ,
                "Edinson Cavani\tForward" ,
                "Sergio Aguero\tForward" ,
                "Iker Casillas\tGoalkeeper" ,
                "Neymar\tForward" ,
                "Sergio Busquets\tDefender/midfielder" ,
                "Xabi Alonso\tMidfielder" ,
                "Thiago Silva\tDefender" ,
                "Mesut Ozil\tMidfielder" ,
                "David Silva\tMidfielder/forward" ,
                "Bastian Schweinsteiger\tMidfielder" ,
                "Gianluigi Buffon\tGoalkeeper"
                )


        val arrayAdapter : ArrayAdapter<*>

        val nameList = findViewById<ListView>(R.id.lvPlayers)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)

        nameList.adapter = arrayAdapter




    }
}