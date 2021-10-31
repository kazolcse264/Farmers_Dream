package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SorisarRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    SorisaAdapter sorisaAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.sorisar_jab_poka,R.drawable.sorisar_bicha_poka,
            R.drawable.sorisar_white_mold_rog,R.drawable.sorisar_korat_machi_poka,
            R.drawable.sorisar_pata_jholsano_rog};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorisar_rog_balai);

        recyclerView = findViewById(R.id.sorisarReCyclerViewId);


        title = getResources().getStringArray(R.array.sorisar_rog_balai);
        description = getResources().getStringArray(R.array.sorisar_rog_balai_desc);
        sorisaAdapter = new SorisaAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(sorisaAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}