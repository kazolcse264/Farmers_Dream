package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DhanerRogBalaiDescription extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaner_rog_balai_description);

        imageView = findViewById(R.id.dhanerRogImageViewId);
        textView = findViewById(R.id.dhanerTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("majra_poka")){

            imageView.setImageResource(R.drawable.majrapoka);
            textView.setText(R.string.dhaner_majra_poka_description);

        }
        if(rog_description.equals("pata_morano")){

            imageView.setImageResource(R.drawable.pata_morano);
            textView.setText(R.string.dhaner_pata_morano_poka_description);

        }
        if(rog_description.equals("bacterial_lof_blight")){

            imageView.setImageResource(R.drawable.bacterial_lof_blaight);
            textView.setText(R.string.dhaner_bacterial_lof_blight_description);

        }
        if(rog_description.equals("kando_poca")){

            imageView.setImageResource(R.drawable.kandopoca);
            textView.setText(R.string.dhaner_kando_poca_description);

        }
        if(rog_description.equals("node_blust")){

            imageView.setImageResource(R.drawable.node_blust);
            textView.setText(R.string.dhaner_node_blust_description);

        }

    }
}