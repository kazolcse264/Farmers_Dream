package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PeperRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    PepeAdapter pepeAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.pyper_chara_dhosha_rog,R.drawable.pyper_ghora_pocha_rog,
            R.drawable.pyper_potas_sharer_gharti,R.drawable.pyper_suti_mondo_rog,
            R.drawable.pyper_dholepora_rog,R.drawable.pyper_boron_sharer_gharti,R.drawable.pyper_vairasjonito_pata_kujkano_rog,
            R.drawable.pyper_vairasjonito_mojayek_rog,R.drawable.pyper_milibag_ba_catra_poka};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peper_rog_balai);

        recyclerView = findViewById(R.id.reCyclerViewId);


        title = getResources().getStringArray(R.array.peper_rog_balai);
        description = getResources().getStringArray(R.array.peper_rog_balai_desc);
        pepeAdapter = new PepeAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(pepeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
