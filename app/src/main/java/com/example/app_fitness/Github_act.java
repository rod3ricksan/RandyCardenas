package com.example.app_fitness;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Clases.Planes;

public class Github_act extends AppCompatActivity {
    private Spinner spin1;

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        spin1 = (Spinner)findViewById(R.id.spn1);
        text = (TextView)findViewById(R.id.tv);

        // Recibir el dato.
        // <----
        ArrayList<String> listalibros = (ArrayList<String>) getIntent().getSerializableExtra("listalibros");



        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listalibros);


        spin1.setAdapter(adapt);

    }
    public void Calcular(View v)
    {
        String libros = spin1.getSelectedItem().toString();



        Planes libro= new Planes();
        int resultFarenheith = libro.getFarenheith();
        int resultRevival =  libro.getRevival();
        int resultElAlquimista = libro.getElAlquimista();
        int resultDespertar =  libro.getElDespertar();
        int resultelPoder =  libro.getElPoder();



        if(libros.equals("Farenheith"))
        {
            text.setText("El precio del libro es "+ resultFarenheith);
        }



        if(libros.equals("Revival"))
        {
            text.setText("El precio del Libro es: "+resultRevival );
        }



        if(libros.equals("El Alquimista") )
        {
            text.setText("El precio del Libro es: "+resultElAlquimista );
        }


        if(libros.equals("Despertar") )
        {
            text.setText("El precio del Libro es: "+resultDespertar );
        }



        if(libros.equals("El Poder") )
        {
            text.setText("El precio del Libro es: "+resultelPoder );
        }
    }
}