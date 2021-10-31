package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class KathalerRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    KathalAdapter kathalAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.kataler_kando_cidrokari_poka,R.drawable.kataler_fol_bikkriti,
            R.drawable.kataler_fol_pocha_rog,R.drawable.kataler_wyipoka,
            R.drawable.kataler_scela_poka,R.drawable.kataler_folchidrokari_poka,R.drawable.kataler_jab_poka,
            R.drawable.kataler_patar_dagrog};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kathaler_rog_balai);

        recyclerView = findViewById(R.id.reCyclerViewId);


        title = getResources().getStringArray(R.array.kathaler_rog_balai);
        description = getResources().getStringArray(R.array.kathaler_rog_balai_desc);
        kathalAdapter = new KathalAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(kathalAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
