package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GomerRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomer_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("gomer_sting_bug_rog")){

            imageView.setImageResource(R.drawable.gomer_sting_bug_rog);
            textView.setText(R.string.pather_cele_poka_description);

        }
        if(rog_description.equals("gomer_majra_poka")){

            imageView.setImageResource(R.drawable.gomer_majra_poka);
            textView.setText(R.string.pather_mojaik_rog_description);

        }
        if(rog_description.equals("gomer_blust_rog")){

            imageView.setImageResource(R.drawable.gomer_blust_rog);
            textView.setText(R.string.pather_kalopotti_rog_description);

        }
        if(rog_description.equals("gomer_edur_problem")){

            imageView.setImageResource(R.drawable.gomer_edur_problem);
            textView.setText(R.string.dhaner_kando_poca_description);

        }
        if(rog_description.equals("gomer_jhul_rog")){

            imageView.setImageResource(R.drawable.gomer_jhul_rog);
            textView.setText(R.string.pather_makor_rog_description);

        }
        if(rog_description.equals("gomer_urconga_poka_rog")){

            imageView.setImageResource(R.drawable.gomer_urconga_poka_rog);
            textView.setText(R.string.pater_gora_poca_rog_description);

        }
        if(rog_description.equals("gomer_patar_morica_rog")){

            imageView.setImageResource(R.drawable.gomer_patar_morica_rog);
            textView.setText(R.string.pata_morano_description);

        }
        if(rog_description.equals("gomer_jab_poka_rog")){

            imageView.setImageResource(R.drawable.gomer_jab_poka_rog);
            textView.setText(R.string.pather_chatra_poka_description);

        }
        if(rog_description.equals("gomer_pata_jholsano_rog")){

            imageView.setImageResource(R.drawable.gomer_pata_jholsano_rog);
            textView.setText(R.string.pather_kushon_scale_poka_description);

        }



    }
}