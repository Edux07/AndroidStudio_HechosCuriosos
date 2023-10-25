package com.example.myapplication_hechos_curiosos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ColoresFondo cf = new ColoresFondo();

    public int aux = cf.Colorespuros();
    CheckBox check;
    Button btn;
    TextView modificar;
    ListaHechos listaHechos = new ListaHechos();
    List<Integer> Listacolores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = findViewById(R.id.checkBox);
        btn= findViewById(R.id.button);
        Listacolores =  new ArrayList<>();
        int[] Listacoloritos = getResources().getIntArray(R.array.ListaColores);

        cf.setcolor(Listacoloritos);

        String[] arrayStrings = getResources().getStringArray(R.array.HechosCuriosos2);
        listaHechos.setLista(arrayStrings);


    }
    public void onBtnClic (View view){

      modificar = findViewById(R.id.textView9);
        //modificar.setText(listaHechos.getHechoAleatorio());

        int i =(int)(Math.random()*10);
        System.out.println(i);
        String[] arrayStrings = getResources().getStringArray(R.array.HechosCuriosos);
        modificar.setText(arrayStrings[i]);

        ConstraintLayout cl = findViewById(R.id.Colorcitos);
        cl.setBackgroundColor(cf.cambiarColor());

        /*switch (i) {
            case 0: modificar.setText(getString(R.string.Hecho1));break;
            case 1: modificar.setText(getString(R.string.Hecho2));break;
            case 2: modificar.setText(getString(R.string.Hecho3));break;
            case 3: modificar.setText(getString(R.string.Hecho4));break;
            case 4: modificar.setText(getString(R.string.Hecho5));break;
            case 5: modificar.setText(getString(R.string.Hecho6));break;
            case 6: modificar.setText(getString(R.string.Hecho7));break;
            case 7: modificar.setText(getString(R.string.Hecho8));break;
            case 8: modificar.setText(getString(R.string.Hecho9));break;
            case 9: modificar.setText(getString(R.string.Hecho10));break;
        }*/
    }
    public void Boton1(View view){
        modificar = findViewById(R.id.textView9);
        if(check.isChecked()){
            onBtnClic(view);
        }else{
            String[] arrayStrings = getResources().getStringArray(R.array.HechosCuriosos);
            int i =(int)(Math.random()*0);
            modificar.setText(arrayStrings[i]);
            ConstraintLayout cl = findViewById(R.id.Colorcitos);
            cl.setBackgroundColor(cf.garnet());
        }

    }


    /*
     * La finalidad de el main en estos ejercicios es hacer una llamada a los metodos de las clases que correspondan
     * no como el metodo de arriba.
     * Para ello se necesita crearun objeto de la clase que te interesa como en la linea 25:
     *     ColoresFondo cf = new ColoresFondo();
     *
     *
     * */
    public void Boton2(View view){//Declaras view, no se porque pero sino no vale.

        //en vuestro xml vuestro layout
        if (check.isChecked()){
            btn.performClick();
        }else {
            ConstraintLayout cl = findViewById(R.id.Colorcitos);
            //Es de tipo ConstraintLayout, antes de crear este objeto, lo compruebas en la primera linea del xml
            int c = aux; //Variable de control para entrar siempre en el bucle y conseguir un color nuevo

            while(c==aux){//Control para entrar siempre que pulse el botón

                c = cf.Colorespuros();//Aqui buscamos un color hasta que sea diferente del anterior
            }
            aux = c;//Ahora aux es una variable de clase, la puedes ver al principio del programa, y es para que
            //se guarde el valor durante la ejecucion del codigo. Aqui le damos el valor del color anterior para
            //evitar que se repita.
            cl.setBackgroundColor(c);//Lanzamos el color nuevo, todo con un clic, comprobando que no se repite.
        }

    }
    public void Boton3(View view){
        modificar = findViewById(R.id.textView9);
        if (check.isChecked()){
            btn.callOnClick();

        }else {
            ConstraintLayout cl = findViewById(R.id.Colorcitos);

            modificar.setText(listaHechos.getFacts());
            cl.setBackgroundColor(cf.cambiarColor());
        }


    }
    public void Check (View view){
        if(check.isChecked()){
            Toast.makeText(getApplicationContext(), "Casilla marcada", Toast.LENGTH_SHORT).show();
        }
    }
}