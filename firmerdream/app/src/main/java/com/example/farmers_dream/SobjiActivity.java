package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SobjiActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView begunCardView,tometoCardView,gajorCardView,puishakCardView,lauCardView,fulkopiCardView;
    private ImageView threeDot,userProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobji);


        begunCardView = findViewById(R.id.begunId);
        tometoCardView = findViewById(R.id.tometoId);
        gajorCardView = findViewById(R.id.gajorId);
        puishakCardView = findViewById(R.id.puishakId);
        lauCardView = findViewById(R.id.lauId);
        fulkopiCardView = findViewById(R.id.fulkopiId);



        begunCardView.setOnClickListener(this);
        tometoCardView.setOnClickListener(this);
        gajorCardView.setOnClickListener(this);
        puishakCardView.setOnClickListener(this);
        lauCardView.setOnClickListener(this);
        fulkopiCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.begunId)
        {
            Intent intent = new Intent(SobjiActivity.this,BegunerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.tometoId)
        {
            Intent intent = new Intent(SobjiActivity.this,TometorRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.gajorId)
        {
            Intent intent = new Intent(SobjiActivity.this,GajorerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.puishakId)
        {
            Intent intent = new Intent(SobjiActivity.this,PuishakerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.lauId)
        {

            Intent intent = new Intent(SobjiActivity.this,LauerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.fulkopiId)
        {
            Intent intent = new Intent(SobjiActivity.this,FulkopirRogBalaiActivity.class);
            startActivity(intent);
        }

    }
}