package com.example.practicaipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class ActividadScreen extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_screen);
    }

    public void correcto(View v) {

        Toast toast = Toast.makeText(getApplicationContext(), "¡¡¡MUY BIEN!!!", Toast.LENGTH_SHORT);
        toast.show();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
               Intent i = new Intent(ActividadScreen.this, RoutineLevels.class);
               startActivity(i);
            }
        }, 3000);
    }


    public void erroneo(View v){

        Toast toast = Toast.makeText(getApplicationContext(), "PRUEBA DE NUEVO", Toast.LENGTH_SHORT);
        toast.show();
    }

}
