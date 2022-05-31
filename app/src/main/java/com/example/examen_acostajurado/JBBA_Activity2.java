package com.example.examen_acostajurado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class JBBA_Activity2 extends AppCompatActivity {
    EditText JBBA_editTextnumero;
    Button JBBA_buttoningresar;
    ListView JBBA_listViewnumeros;
    Button JBBA_buttoncerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ja2);
        JBBA_buttoncerrar = findViewById(R.id.JBBA_buttonCerrar);
        JBBA_buttoningresar= findViewById(R.id.JBBA_buttonIngresar);
        JBBA_editTextnumero = findViewById(R.id.JBBA_editTextIngreseunNumero);
        JBBA_listViewnumeros =  findViewById(R.id.JBBA_ListViewNumeros);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, JBBA_ingresarDatos());
        JBBA_listViewnumeros.setAdapter(adapter);

    }

    public List<String> JBBA_ingresarDatos(){
    List<String> list = new ArrayList<String>();
    list.add(JBBA_editTextnumero.getText().toString());
    return list;


    }
}