package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MathFosolActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView dhanCardView,pathCardView,gomCardView,akhCardView,vuttaCardView,sorishaCardView;
    private ImageView threeDot,userProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_fosol);


        dhanCardView = findViewById(R.id.dhanId);
        pathCardView = findViewById(R.id.pathId);
        gomCardView = findViewById(R.id.gomId);
        vuttaCardView = findViewById(R.id.vuttaId);
        akhCardView = findViewById(R.id.akhId);
        sorishaCardView = findViewById(R.id.sorishaId);



        dhanCardView.setOnClickListener(this);
        pathCardView.setOnClickListener(this);
        gomCardView.setOnClickListener(this);
        akhCardView.setOnClickListener(this);
        vuttaCardView.setOnClickListener(this);
        sorishaCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.dhanId)
        {
            Intent intent = new Intent(MathFosolActivity.this,DhanerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.pathId)
        {
            Intent intent = new Intent(MathFosolActivity.this,PatherRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.gomId)
        {
            Intent intent = new Intent(MathFosolActivity.this,GomerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.vuttaId)
        {
            Intent intent = new Intent(MathFosolActivity.this,VuttarRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.akhId)
        {

            Intent intent = new Intent(MathFosolActivity.this,AkherRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.sorishaId)
        {
            Intent intent = new Intent(MathFosolActivity.this,SorisarRogBalaiActivity.class);
            startActivity(intent);
        }

    }
}