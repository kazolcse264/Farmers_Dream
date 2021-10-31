package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class GomerRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    GomAdapter gomAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.gomer_sting_bug_rog,R.drawable.gomer_majra_poka,
            R.drawable.gomer_blust_rog,R.drawable.gomer_edur_problem,
            R.drawable.gomer_jhul_rog,R.drawable.gomer_urconga_poka_rog,R.drawable.gomer_patar_morica_rog,
            R.drawable.gomer_jab_poka_rog,R.drawable.gomer_pata_jholsano_rog};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomer_rog_balai);

        recyclerView = findViewById(R.id.gomerReCyclerViewId);


        title = getResources().getStringArray(R.array.gomer_rog_balai);
        description = getResources().getStringArray(R.array.gomer_rog_balai_desc);
        gomAdapter = new GomAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(gomAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
