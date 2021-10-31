package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class VuttarRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    VuttaAdapter vuttaAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.vuttar_leda_poka,R.drawable.vutter_fli_bitol_poka,
            R.drawable.vutter_katui_poka,R.drawable.vuttar_ghas_foring,
            R.drawable.vuttar_dosta_sarer_ghatti,R.drawable.vuttar_calciyamer_ghatti,R.drawable.vuttar_urcongga_poka,
            R.drawable.vuttar_ekkkhu_bitol_poka,R.drawable.vuttar_japani_bitol_poka,
            R.drawable.vuttar_uriya_injuri,R.drawable.vuttar_pata_jholsano_rog,R.drawable.vuttar_pata_morano_rog,
            R.drawable.vuttar_jab_poka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vuttar_rog_balai);

        recyclerView = findViewById(R.id.vuttarReCyclerViewId);


        title = getResources().getStringArray(R.array.vuttar_rog_balai);
        description = getResources().getStringArray(R.array.vuttar_rog_balai_desc);
        vuttaAdapter = new VuttaAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(vuttaAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}