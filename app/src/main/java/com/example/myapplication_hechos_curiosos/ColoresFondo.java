package com.example.myapplication_hechos_curiosos;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColoresFondo {


    List<Integer> Listacolore = new ArrayList<>();

    int c1 = 0;
    public void setcolor(int[] aux){

        for (int a:aux) {

            Listacolore.add(a);
        }
    }
    public ArrayList<String> Colorespuros = new ArrayList<>(Arrays.asList(
            "#FF0000",
            "#008F39",
            "#0000FF"
    ));
    public ArrayList<String> listaaux = new ArrayList<>();
    public int ColorRandom () {
        ColoresFondo random = new ColoresFondo();
        int ColorAleatorio = random.ColorRandom();

        return Listacolore.get(ColorAleatorio);
    }
    public int Colorespuros() {

        //Variable para indicar el elemento del arraylist
        int aux = 0;//Variable a 0 para establecer el color

        aux = (int)(Math.random()*Colorespuros.size());//color random


        return Color.parseColor(Colorespuros.get(aux));//Devolvemos el color

    }
    public int garnet() {

        return Color.parseColor("#7a2021");//Devolvemos el color

    }

    public int cambiarColor(){

        int a = this.c1;

        while (a==this.c1){

            a = Listacolore.get((int)(Math.random()*Listacolore.size()));
        }
        return a;
    }


}