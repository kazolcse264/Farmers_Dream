package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PatherRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    PatAdapter patAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.pather_cele_poka,R.drawable.pather_mojaik_rog,
            R.drawable.pather_kalopotti_rog,R.drawable.pather_makor_rog,
            R.drawable.pater_bicha_poka,R.drawable.pater_gora_poca_rog,R.drawable.pata_morano,
            R.drawable.pather_chatra_poka,R.drawable.pather_kushon_scale_poka,
            R.drawable.pather_leda_poka,R.drawable.pater_aga_mora_rog,R.drawable.pater_anthraknoj_rog,
            R.drawable.pater_dhole_pora_rog};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pather_rog_balai);

        recyclerView = findViewById(R.id.paterReCyclerViewId);


        title = getResources().getStringArray(R.array.pater_rog_balai);
        description = getResources().getStringArray(R.array.pater_rog_balai_desc);
        patAdapter = new PatAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(patAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}