package com.a1knackiges.wena;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by gap on 13.11.16.
 */

public class Overview extends Activity {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overview);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Puzzle.class);
                startActivityForResult(intent, 1);
            }
        });
        imageView1.setImageResource(R.drawable.scantowin);

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Puzzle.class);
                startActivityForResult(intent, 1);
            }
        });
        imageView2.setImageResource(R.drawable.scantowin);

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Puzzle.class);
                startActivityForResult(intent, 1);
                //imageView3.setImageResource(R.drawable.scantowin);
            }
        });

        imageView3.setImageResource(R.drawable.scantowin);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Puzzle.class);
                startActivityForResult(intent, 1);
                //imageView3.setImageResource(R.drawable.scantowin);
            }
        });
        imageView4.setImageResource(R.drawable.scantowin);


        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.yooo);

        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.yooo);

        imageView = (ImageView) findViewById(R.id.imageView7);
        imageView.setImageResource(R.drawable.yooo);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {//fügt element in einkaufsliste ein, welche man am ende sieht
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {//resultcode = 2 // Kamera
            Log.d("yo",data.getStringExtra("barcoderesult"));
            imageView1.setImageResource(R.drawable.checkmark21);
        }
    }
}
