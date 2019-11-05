package com.tjoeunit.a20111105_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var  roomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     fun sum(num1:Int, num2:Int)  = num1 + num2



     }
    }

     fun addRooms(){

        var room1 = RoomData
        room1.price = 7000
        room1.address = "마포구 서교동"
        room1.floor = 1
        roomList.add(room1)

        var room2 = RoomData
        room2.price = 8000
        room2.address = "강남구 서교동"
        room2.floor = 1
        roomList.add(room2)

        var room3 = RoomData
        room3.price = 8000
        room3.address = "서초구 서교동"
        room3.floor = 1
        roomList.add(room3)


    }


}
