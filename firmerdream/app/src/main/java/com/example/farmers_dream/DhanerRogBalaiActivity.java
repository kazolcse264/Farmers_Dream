package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DhanerRogBalaiActivity extends AppCompatActivity{
    private RecyclerView recyclerView;

    MyAdapter myAdapter;

    private String[]  title,description;
    int[] images = {R.drawable.majrapoka,R.drawable.pata_morano,
            R.drawable.kandopoca,R.drawable.node_blust,
            R.drawable.bacterial_lof_blaight};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaner_rog_balai);

        recyclerView = findViewById(R.id.reCyclerViewId);


        title = getResources().getStringArray(R.array.dhaner_rog_balai);
        description = getResources().getStringArray(R.array.dhaner_rog_balai_desc);
        myAdapter = new MyAdapter(getApplicationContext(),images,title,description);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
