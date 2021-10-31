package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AkherRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    AkhAdapter akhAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.akher_kalo_pata_foring,R.drawable.akher_patar_lal_dag_rog,
            R.drawable.akher_mojaik_rog,R.drawable.akher_patar_surongokari_poka,
            R.drawable.akher_pata_kheko_uindil_poka,R.drawable.akher_cokkhu_dag_rog,R.drawable.akher_ui_poka,
            R.drawable.akher_thrips_poka,R.drawable.akher_sada_pata_rog,
            R.drawable.akher_sada_makor,R.drawable.akher_kalo_shis_rog,R.drawable.akher_sutimold_rog,
            R.drawable.akher_poshomi_jab_poka,R.drawable.akher_jab_poka,R.drawable.akher_bij_poca_rog,
            R.drawable.akher_wild_rog,R.drawable.akher_lal_poca_rog,R.drawable.akher_kander_majra_poka,
            R.drawable.akher_gorar_majra_poka,R.drawable.akher_agar_majra_poka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akher_rog_balai);

        recyclerView = findViewById(R.id.akherReCyclerViewId);


        title = getResources().getStringArray(R.array.akher_rog_balai);
        description = getResources().getStringArray(R.array.akher_rog_balai_desc);
        akhAdapter = new AkhAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(akhAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}