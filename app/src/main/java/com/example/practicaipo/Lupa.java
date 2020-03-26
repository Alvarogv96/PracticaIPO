package com.example.practicaipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Lupa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa);
      /*  Intent intent = getIntent();
        ImageView img1 = findViewById(R.id.img_lupa1);
        ImageView img2 = findViewById(R.id.img_lupa2);
        Bitmap bitmap1 = (Bitmap) intent.getParcelableExtra("bitmap1");
        Bitmap bitmap2 = (Bitmap) intent.getParcelableExtra("bitmap2");

        img1.setImageBitmap(bitmap1);
        img2.setImageBitmap(bitmap2);*/
    }

    public void atras(View v){
        Intent i = new Intent(this, ActividadScreen.class);
        startActivity(i);
    }
}
