package com.muhammadiyahtiga.muga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity{
    CardView menu1,menu2,menu3,menu4,menu5,menu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu1 = findViewById(R.id.menu_1);
        menu2 = findViewById(R.id.menu_2);
        menu3 = findViewById(R.id.menu_3);
        menu4 = findViewById(R.id.menu_4);
        menu5 = findViewById(R.id.menu_5);
        menu6 = findViewById(R.id.menu_6);

        Intent intent= new Intent(MainActivity.this,WebActivity.class);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("url","https://www.smamuh3jogja.sch.id");
                startActivity(intent);
            }
        });
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("url","http://58.145.168.214/perpus");
                startActivity(intent);
            }
        });
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("url","http://58.145.168.214/siro");
                startActivity(intent);
            }
        });
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("url","http://58.145.168.214:8888/sino");
                startActivity(intent);
            }
        });
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("url","http://58.145.168.214:5774");
                startActivity(intent);
            }
        });
        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("url","https://tes.smamuh3jogja.sch.id");
                startActivity(intent);
            }
        });
    }

}