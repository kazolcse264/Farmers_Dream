package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FulActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView gadaCardView,golapCardView,jobaCardView,kusumfulCardView,rojonigondhaCardView,surjomukhiCardView;
    private ImageView threeDot,userProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ful);


        gadaCardView = findViewById(R.id.gadafulId);
        golapCardView = findViewById(R.id.golapfulId);
        jobaCardView = findViewById(R.id.jobafulId);
        kusumfulCardView = findViewById(R.id.kusumfulId);
        rojonigondhaCardView = findViewById(R.id.rojonigondhafulId);
        surjomukhiCardView = findViewById(R.id.surjomukhifulId);



        gadaCardView.setOnClickListener(this);
        golapCardView.setOnClickListener(this);
        jobaCardView.setOnClickListener(this);
        kusumfulCardView.setOnClickListener(this);
        rojonigondhaCardView.setOnClickListener(this);
        surjomukhiCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.gadafulId)
        {
            Intent intent = new Intent(FulActivity.this,GadaFulerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.golapfulId)
        {
            Intent intent = new Intent(FulActivity.this,GolapFulerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.jobafulId)
        {
            Intent intent = new Intent(FulActivity.this,JobaFulerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.kusumfulId)
        {
            Intent intent = new Intent(FulActivity.this,KusumFulerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.rojonigondhafulId)
        {

            Intent intent = new Intent(FulActivity.this,RojonigondharRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.surjomukhifulId)
        {
            Intent intent = new Intent(FulActivity.this,SurjomukhirRogBalaiActivity.class);
            startActivity(intent);
        }

    }
}