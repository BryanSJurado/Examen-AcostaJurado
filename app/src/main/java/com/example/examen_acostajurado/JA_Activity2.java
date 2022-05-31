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

public class JA_Activity2 extends AppCompatActivity {
    private EditText editTextnumeros;
    private ListView listViewdatos;
    private Button buttonIngresar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ja2);

        editTextnumeros = findViewById(R.id.JBBA_editTextIngreseunNumero);
        listViewdatos = findViewById(R.id.JBBA_ListViewNumeros);
        buttonIngresar = findViewById(R.id.JBBA_buttonIngresar);

        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, JBBA_ingresarDatos());
        listViewdatos.setAdapter(adapter);

    }

    private List<String> JBBA_ingresarDatos(){
        List<String> list = new ArrayList<String>();
        list.add(editTextnumeros.getText().toString());
        return list;

    }
}