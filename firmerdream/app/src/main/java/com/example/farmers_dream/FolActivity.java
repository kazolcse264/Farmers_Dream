package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FolActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView amCardView,jamCardView,kolaCardView,lichuCardView,kathalCardView,pepeCardView;
    private ImageView threeDot,userProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fol);


        amCardView = findViewById(R.id.amId);
        jamCardView = findViewById(R.id.jamId);
        kolaCardView = findViewById(R.id.kolaId);
        lichuCardView = findViewById(R.id.licuId);
        kathalCardView = findViewById(R.id.kathalId);
        pepeCardView = findViewById(R.id.pepeId);



        amCardView.setOnClickListener(this);
        jamCardView.setOnClickListener(this);
        kolaCardView.setOnClickListener(this);
        lichuCardView.setOnClickListener(this);
        kathalCardView.setOnClickListener(this);
        pepeCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.amId)
        {
            Intent intent = new Intent(FolActivity.this,AmerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.jamId)
        {
            Intent intent = new Intent(FolActivity.this,JamerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.kolaId)
        {
            Intent intent = new Intent(FolActivity.this,KolarRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.licuId)
        {
            Intent intent = new Intent(FolActivity.this,LicurRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.kathalId)
        {

            Intent intent = new Intent(FolActivity.this,KathalerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.pepeId)
        {
            Intent intent = new Intent(FolActivity.this,PeperRogBalaiActivity.class);
            startActivity(intent);
        }

    }
}