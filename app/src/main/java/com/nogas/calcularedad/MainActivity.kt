package com.nogas.calcularedad

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculaClick(view:View){

        try {
            val anioDeNacimiento:Int = txtAnioNacimiento.text.toString().toInt()
            val anioActual:Int = Calendar.getInstance().get(Calendar.YEAR)

            if (anioDeNacimiento > 1900 && anioDeNacimiento < anioActual){

                val miEdad = anioActual - anioDeNacimiento
                txtMuestraEdad.text = "Tu edad es $miEdad años"


            }else{

                txtMuestraEdad.text = "INGRESE UN AÑO VALIDO"
            }






        }catch (e:Exception){
            txtMuestraEdad.text = "INGRESE UN DATO VALIDO"
        }


        }

}
