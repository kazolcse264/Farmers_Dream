package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class KolarRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    KolaAdapter kolaAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.kolar_kukambar_mojaik_vairas_rog,R.drawable.kola_gacher_kander_uilive,
            R.drawable.kolar_kardanar_dag_rog,R.drawable.kolar_anthraknoj_rog,
            R.drawable.kolar_pata_o_faler_bitol,R.drawable.kolar_guscomatha_rog,R.drawable.kolar_panama_rog};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolar_rog_balai);

        recyclerView = findViewById(R.id.reCyclerViewId);


        title = getResources().getStringArray(R.array.kolar_rog_balai);
        description = getResources().getStringArray(R.array.kolar_rog_balai_desc);
        kolaAdapter = new KolaAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(kolaAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
