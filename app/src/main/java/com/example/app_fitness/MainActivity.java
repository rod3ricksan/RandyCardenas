package com.example.app_fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progress;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress = (ProgressBar) findViewById(R.id.pb);
        btn = (Button) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Task().execute();
            }
        });


        progress.setVisibility(View.INVISIBLE);
    }


    // Tarea Asíncrona.

    class Task extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {

            progress.setVisibility(View.VISIBLE);
        }


        @Override
        protected String doInBackground(String... strings) {

            for (int i = 1; i < 10; i++) {
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }


    }
    public void Libros (View v) {
        ArrayList<String> Libros = new ArrayList<>();

        Libros.add("Farenheith");
        Libros.add("Revival");
        Libros.add("El Alquimista");
        Libros.add("Despertar");
        Libros.add("El Poder");

        Intent i = new Intent(getBaseContext(), Github_act.class);

        i.putExtra("listalibros", Libros);
        startActivity(i);

    }
}