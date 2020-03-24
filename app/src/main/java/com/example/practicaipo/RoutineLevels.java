package com.example.practicaipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RoutineLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_levels);
    }

    public void NivelRojo(View view){
        Intent actividad = new Intent(this, ActividadScreen.class);
        startActivity(actividad);
    }
}
