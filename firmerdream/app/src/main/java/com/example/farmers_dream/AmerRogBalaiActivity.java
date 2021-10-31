package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AmerRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    AmAdapter amAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.amer_jayant_milibag,R.drawable.amer_kusan_sceal_poka,
            R.drawable.amer_machi_poka,R.drawable.amer_uypoka,
            R.drawable.amer_thripos_poka,R.drawable.amer_fol_fete_jawa,R.drawable.amer_sceal_poka,
            R.drawable.amer_atha_jora_rog,R.drawable.amer_aga_mora_rog,
            R.drawable.amer_kando_cirdkari_poka, R.drawable.amer_pata_poka_rog,R.drawable.amer_shut_gol,
            R.drawable.amer_ango_bikriti_rog};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amer_rog_balai);

        recyclerView = findViewById(R.id.reCyclerViewId);


        title = getResources().getStringArray(R.array.amer_rog_balai);
        description = getResources().getStringArray(R.array.amer_rog_balai_desc);
        amAdapter = new AmAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(amAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
