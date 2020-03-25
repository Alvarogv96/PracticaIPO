package com.example.practicaipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        ImageView img = (ImageView)findViewById(R.id.img_hola);
        TextView txt = (TextView)findViewById(R.id.txt_bienvenida);
        Animation aniFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        txt.startAnimation(aniFade);
        img.startAnimation(aniFade);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i = new Intent(Bienvenida.this, MainActivity.class);
                startActivity(i);
            }
        }, 5000);
    }


}
