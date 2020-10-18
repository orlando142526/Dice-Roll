/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
  //contenedor de imagen
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        //para crear un evento
        super.onCreate(savedInstanceState)
        //Aqui puedes indicarle a que directorio quieres ir, creas y vas al layout que tu le digas
        setContentView(R.layout.activity_orlando)
        //contenedor de button
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
      //Con el R.id cambiamos la imagen que indicamos en el layout
        //contenedor imagen
        diceImage = findViewById(R.id.mi_image)
    }
 //genera los números aleatoriamente
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
     //podemos cambiar la imagen
        diceImage.setImageResource(drawableResource)
    }
}
