package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MoslaActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView peyajCardView,rosunCardView,moricCardView,adaCardView,holudCardView,kalojiraCardView;
    private ImageView threeDot,userProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mosla);


        peyajCardView = findViewById(R.id.peyajId);
        rosunCardView = findViewById(R.id.rosunId);
        moricCardView = findViewById(R.id.moricId);
        adaCardView = findViewById(R.id.adaId);
        holudCardView = findViewById(R.id.holudId);
        kalojiraCardView = findViewById(R.id.kalojiraId);



        peyajCardView.setOnClickListener(this);
        rosunCardView.setOnClickListener(this);
        moricCardView.setOnClickListener(this);
        adaCardView.setOnClickListener(this);
        holudCardView.setOnClickListener(this);
        kalojiraCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.peyajId)
        {
            Intent intent = new Intent(MoslaActivity.this,PeyajerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.rosunId)
        {
            Intent intent = new Intent(MoslaActivity.this,RosunerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.moricId)
        {
            Intent intent = new Intent(MoslaActivity.this,MoricerRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.adaId)
        {
            Intent intent = new Intent(MoslaActivity.this,AdarRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.holudId)
        {

            Intent intent = new Intent(MoslaActivity.this,HoluderRogBalaiActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.kalojiraId)
        {
            Intent intent = new Intent(MoslaActivity.this,KalojirarRogBalaiActivity.class);
            startActivity(intent);
        }

    }
}