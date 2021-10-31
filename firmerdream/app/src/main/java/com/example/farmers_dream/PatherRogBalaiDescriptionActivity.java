package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PatherRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pather_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("pather_cele_poka")){

            imageView.setImageResource(R.drawable.pather_cele_poka);
            textView.setText(R.string.pather_cele_poka_description);

        }
        if(rog_description.equals("pather_mojaik_rog")){

            imageView.setImageResource(R.drawable.pather_mojaik_rog);
            textView.setText(R.string.pather_mojaik_rog_description);

        }
        if(rog_description.equals("pather_kalopotti_rog")){

            imageView.setImageResource(R.drawable.pather_kalopotti_rog);
            textView.setText(R.string.pather_kalopotti_rog_description);

        }
        if(rog_description.equals("pather_makor_rog")){

            imageView.setImageResource(R.drawable.pather_makor_rog);
            textView.setText(R.string.dhaner_kando_poca_description);

        }
        if(rog_description.equals("pater_bicha_poka")){

            imageView.setImageResource(R.drawable.pater_bicha_poka);
            textView.setText(R.string.pather_makor_rog_description);

        }
        if(rog_description.equals("pater_gora_poca_rog")){

            imageView.setImageResource(R.drawable.pater_gora_poca_rog);
            textView.setText(R.string.pater_gora_poca_rog_description);

        }
        if(rog_description.equals("pata_morano")){

            imageView.setImageResource(R.drawable.pata_morano);
            textView.setText(R.string.pata_morano_description);

        }
        if(rog_description.equals("pather_chatra_poka")){

            imageView.setImageResource(R.drawable.pather_chatra_poka);
            textView.setText(R.string.pather_chatra_poka_description);

        }
        if(rog_description.equals("pather_kushon_scale_poka")){

            imageView.setImageResource(R.drawable.pather_kushon_scale_poka);
            textView.setText(R.string.pather_kushon_scale_poka_description);

        }
        if(rog_description.equals("pather_leda_poka")){

            imageView.setImageResource(R.drawable.pather_leda_poka);
            textView.setText(R.string.pather_leda_poka_description);

        }
        if(rog_description.equals("pater_aga_mora_rog")){

            imageView.setImageResource(R.drawable.pater_aga_mora_rog);
            textView.setText(R.string.pater_aga_mora_rog_description);

        }
        if(rog_description.equals("pater_anthraknoj_rog")){

            imageView.setImageResource(R.drawable.pater_anthraknoj_rog);
            textView.setText(R.string.pater_anthraknoj_rog_description);

        }
        if(rog_description.equals("pater_dhole_pora_rog")){

            imageView.setImageResource(R.drawable.pater_dhole_pora_rog);
            textView.setText(R.string.pater_dhole_pora_rog_description);

        }


    }
}