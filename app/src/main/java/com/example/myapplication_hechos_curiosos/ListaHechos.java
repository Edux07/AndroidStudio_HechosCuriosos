package com.example.myapplication_hechos_curiosos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class ListaHechos {
    String[] curiosidades = new String[10];
    String[] Curiosidadesvocales = new String[4];


    public void setLista(String[] aux){

        curiosidades = aux;
    }
    public String getHechoAleatorio() {
        //Seleccionar un hecho aleatorio
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(curiosidades.length);
        //devuelve un String con un hecho Aleatorio
        return curiosidades[randomNumber];
    }
    public String getCuriosidadesvocales() {

        int randomNumber = (int) (Math.random() * Curiosidadesvocales.length);
        //devuelve un String con un hecho Aleatorio
        return Curiosidadesvocales[randomNumber];
    }

    public String getFacts(){

        int aux = (int) (Math.random()*curiosidades.length);

        return curiosidades[aux];
    }
    public String getHecho() {
        //Seleccionar un hecho aleatorio

        //devuelve un String con un hecho Aleatorio
        return curiosidades[0];
    }


}
