package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class JamerRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    JamAdapter jamAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.jamer_patar_uilive,R.drawable.jamer_pathar_dag_rog,
            R.drawable.jamer_lal_moricha_rog,R.drawable.jamer_pata_morano_rog};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamer_rog_balai);

        recyclerView = findViewById(R.id.reCyclerViewId);


        title = getResources().getStringArray(R.array.jamer_rog_balai);
        description = getResources().getStringArray(R.array.jamer_rog_balai_desc);
        jamAdapter = new JamAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(jamAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
