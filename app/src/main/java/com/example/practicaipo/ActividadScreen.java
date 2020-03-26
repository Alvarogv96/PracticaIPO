package com.example.practicaipo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ActividadScreen extends AppCompatActivity{

    private ImageView img1;
    private ImageView img2;
    private Bitmap bitmap1;
    private Bitmap bitmap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_screen);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        img1 = findViewById(R.id.img_actividad1);
        img2 = findViewById(R.id.img_actividad2);
        bitmap1 = ((BitmapDrawable)img1.getDrawable()).getBitmap();
        bitmap2 = ((BitmapDrawable)img2.getDrawable()).getBitmap();

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

        Toast toast = Toast.makeText(getApplicationContext(), "¡PRUEBA DE NUEVO!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void ampliar(View v){


        Intent intent = new Intent(this, Lupa.class);
       /* intent.putExtra("bitmap1", bitmap1);
        intent.putExtra("bitmap2", bitmap2);*/

        startActivity(intent);
    }

    public void atras(View v){
        Intent i = new Intent(this, RoutineLevels.class);
        startActivity(i);
    }
}
