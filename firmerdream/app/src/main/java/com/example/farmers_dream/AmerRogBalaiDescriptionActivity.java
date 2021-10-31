package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AmerRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amer_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("amer_jayant_milibag")){

            imageView.setImageResource(R.drawable.amer_jayant_milibag);
            textView.setText(R.string.amer_jayant_milibag_description);

        }
        if(rog_description.equals("amer_kusan_sceal_poka")){

            imageView.setImageResource(R.drawable.amer_kusan_sceal_poka);
            textView.setText(R.string.amer_kusan_sceal_poka_description);

        }
        if(rog_description.equals("amer_machi_poka")){

            imageView.setImageResource(R.drawable.amer_machi_poka);
            textView.setText(R.string.amer_machi_poka_description);

        }
        if(rog_description.equals("amer_uypoka")){

            imageView.setImageResource(R.drawable.amer_uypoka);
            textView.setText(R.string.amer_uypoka_description);

        }
        if(rog_description.equals("amer_thripos_poka")){

            imageView.setImageResource(R.drawable.amer_thripos_poka);
            textView.setText(R.string.amer_thripos_poka_description);

        }
        if(rog_description.equals("amer_fol_fete_jawa")){

            imageView.setImageResource(R.drawable.amer_fol_fete_jawa);
            textView.setText(R.string.amer_fol_fete_jawa_description);

        }
        if(rog_description.equals("amer_sceal_poka")){

            imageView.setImageResource(R.drawable.amer_sceal_poka);
            textView.setText(R.string.amer_sceal_poka_description);

        }
        if(rog_description.equals("amer_atha_jora_rog")){

            imageView.setImageResource(R.drawable.amer_atha_jora_rog);
            textView.setText(R.string.amer_atha_jora_rog_description);

        }
        if(rog_description.equals("amer_aga_mora_rog")){

            imageView.setImageResource(R.drawable.amer_aga_mora_rog);
            textView.setText(R.string.amer_aga_mora_rog_description);

        }
        if(rog_description.equals("amer_kando_cirdkari_poka")){

            imageView.setImageResource(R.drawable.amer_kando_cirdkari_poka);
            textView.setText(R.string.amer_kando_cirdkari_poka_description);

        }
        if(rog_description.equals("amer_pata_poka_rog")){

            imageView.setImageResource(R.drawable.amer_pata_poka_rog);
            textView.setText(R.string.amer_pata_poka_rog_description);

        }
        if(rog_description.equals("amer_shut_gol")){

            imageView.setImageResource(R.drawable.amer_shut_gol);
            textView.setText(R.string.amer_shut_gol_description);

        }
        if(rog_description.equals("amer_ango_bikriti_rog")){

            imageView.setImageResource(R.drawable.amer_ango_bikriti_rog);
            textView.setText(R.string.amer_ango_bikriti_rog_description);

        }

    }
}