package com.example.examen_acostajurado;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class JBBA_Activity2 extends AppCompatActivity {

    ArrayList<String> lista = new ArrayList<String>();

    EditText JBBA_editTextnumero;
    Button JBBA_buttoningresar;
    ListView JBBA_lvNumeros;
    Button JBBA_buttoncerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ja2);
        JBBA_buttoncerrar = findViewById(R.id.JBBA_buttonCerrar);
        JBBA_buttoningresar= findViewById(R.id.JBBA_buttonIngresar);
        JBBA_editTextnumero = findViewById(R.id.JBBA_editTextIngreseunNumero);
        JBBA_lvNumeros =  findViewById(R.id.JBBA_ListViewNumeros);


    }

    public void onClickCerrar(View view){
        Intent intent = new Intent(getApplicationContext(), JBBA_Activity1.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Lista", lista);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void OnClickAgregar(View view){
        lista.add(JBBA_editTextnumero.getText().toString());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        JBBA_lvNumeros.setAdapter(adapter);
        JBBA_editTextnumero.setText("");
    }
}