package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VuttarRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vuttar_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("vuttar_leda_poka")){

            imageView.setImageResource(R.drawable.vuttar_leda_poka);
            textView.setText(R.string.vuttar_leda_poka_description);

        }
        if(rog_description.equals("vutter_fli_bitol_poka")){

            imageView.setImageResource(R.drawable.vutter_fli_bitol_poka);
            textView.setText(R.string.vutter_fli_bitol_poka_description);

        }
        if(rog_description.equals("vutter_katui_poka")){

            imageView.setImageResource(R.drawable.vutter_katui_poka);
            textView.setText(R.string.vutter_katui_poka_description);

        }
        if(rog_description.equals("vuttar_ghas_foring")){

            imageView.setImageResource(R.drawable.vuttar_ghas_foring);
            textView.setText(R.string.vuttar_ghas_foring_description);

        }
        if(rog_description.equals("vuttar_dosta_sarer_ghatti")){

            imageView.setImageResource(R.drawable.vuttar_dosta_sarer_ghatti);
            textView.setText(R.string.vuttar_dosta_sarer_ghatti_description);

        }
        if(rog_description.equals("vuttar_calciyamer_ghatti")){

            imageView.setImageResource(R.drawable.vuttar_calciyamer_ghatti);
            textView.setText(R.string.vuttar_calciyamer_ghatti_description);

        }
        if(rog_description.equals("vuttar_urcongga_poka")){

            imageView.setImageResource(R.drawable.vuttar_urcongga_poka);
            textView.setText(R.string.vuttar_urcongga_poka_description);

        }
        if(rog_description.equals("vuttar_ekkkhu_bitol_poka")){

            imageView.setImageResource(R.drawable.vuttar_ekkkhu_bitol_poka);
            textView.setText(R.string.vuttar_ekkkhu_bitol_poka_description);

        }
        if(rog_description.equals("vuttar_japani_bitol_poka")){

            imageView.setImageResource(R.drawable.vuttar_japani_bitol_poka);
            textView.setText(R.string.vuttar_japani_bitol_poka_description);

        }
        if(rog_description.equals("vuttar_uriya_injuri")){

            imageView.setImageResource(R.drawable.vuttar_uriya_injuri);
            textView.setText(R.string.vuttar_uriya_injuri_description);

        }
        if(rog_description.equals("vuttar_pata_jholsano_rog")){

            imageView.setImageResource(R.drawable.vuttar_pata_jholsano_rog);
            textView.setText(R.string.vuttar_pata_jholsano_rog_description);

        }
        if(rog_description.equals("vuttar_pata_morano_rog")){

            imageView.setImageResource(R.drawable.vuttar_pata_morano_rog);
            textView.setText(R.string.vuttar_pata_morano_rog_description);

        }
        if(rog_description.equals("vuttar_japani_bitol_poka")){

            imageView.setImageResource(R.drawable.vuttar_japani_bitol_poka);
            textView.setText(R.string.vuttar_japani_bitol_poka_description);

        }



    }
}