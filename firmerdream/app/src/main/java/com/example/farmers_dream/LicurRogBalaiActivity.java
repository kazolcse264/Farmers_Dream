package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class LicurRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    LicuAdapter licuAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.licur_patar_uilive,R.drawable.licur_pata_murano_poka,
            R.drawable.licur_pata_pora_rog,R.drawable.licur_sceal_poka,
            R.drawable.licur_fol_jore_jawa_somossa,R.drawable.licur_pata_surongokari_poka,R.drawable.licur_dauli_mildiu_rog,
            R.drawable.licur_fol_sukeya_jawa_samossa,R.drawable.licur_kander_marja_poka,
            R.drawable.licur_patar_dag_rog};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licur_rog_balai);

        recyclerView = findViewById(R.id.reCyclerViewId);


        title = getResources().getStringArray(R.array.licur_rog_balai);
        description = getResources().getStringArray(R.array.licur_rog_balai_desc);
        licuAdapter = new LicuAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(licuAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
