package com.example.examen_acostajurado;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

public class JBBA_Activity1 extends AppCompatActivity {

    public List<String>JBBA_listaNumeros =  new ArrayList<String>();
    public List<String>JBBA_listaNumeros2 =  new ArrayList<String>();
    private int codigo = 1;

    private Button JBBA_btnOrdenar;
    private Button JBBA_btnMostrar;
    private Button JBBA_btnSiguiente;
    private ListView JBBA_lvOrdenado;
    private ListView JBBA_lvIndices;
    private ListView JBBA_lvOriginal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JBBA_btnOrdenar = findViewById(R.id.JBBA_btnOrdenar);
        JBBA_btnMostrar = findViewById(R.id.JBBA_btnMostrar);
        JBBA_btnSiguiente = findViewById(R.id.JBBA_btnSiguiente);

        JBBA_lvIndices = findViewById(R.id.JBBA_lvVectorIndices);
        JBBA_lvOrdenado = findViewById(R.id.JBBA_lvVectorOrdenado);
        JBBA_lvOriginal = findViewById(R.id.JBBA_lvOriginal);

        JBBA_btnMostrar.setEnabled(false);
        JBBA_btnOrdenar.setEnabled(false);
        JBBA_lvOriginal.setEnabled(false);
        JBBA_lvOrdenado.setEnabled(false);
        JBBA_lvIndices.setEnabled(false);
    }

    public void onClickSiguiente(View view) {
        Intent intent = new Intent(this, JBBA_Activity2.class);
        startActivityForResult(intent, codigo);
    }

    public void onClickMostrarResultados(View view) {
        /*
        tvNombre.setText(nombre.toUpperCase(Locale.ROOT));
        tvApellido.setText(apellido.toUpperCase(Locale.ROOT));
        tvBase.setText(base);
        tvExponente.setText(exponente);
        tvFactorial.setText(String.valueOf(factorial(Double.valueOf(numero))));
        tvPotencia.setText(String.valueOf(potencia(Integer.valueOf(base), Integer.valueOf(exponente))));

         */
    }

    public void Ordenar(){
        int i =0;
        do{

            i++;
        }while(i <= JBBA_listaNumeros.size()-1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String informacion;
        JBBA_listaNumeros2  = (List<String>)data;

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  JBBA_listaNumeros2);
        JBBA_lvOriginal.setAdapter(adapter);

        JBBA_btnMostrar.setEnabled(true);
        JBBA_btnOrdenar.setEnabled(true);


    }
}