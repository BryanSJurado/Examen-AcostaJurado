package com.example.examen_acostajurado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

public class JA_Activity2 extends AppCompatActivity {
    private EditText editTextnumeros;
    private ListView listViewdatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ja2);

        editTextnumeros = findViewById(R.id.JBBA_editTextIngreseunNumero);
        listViewdatos = findViewById(R.id.JBBA_ListViewNumeros);
    }


}