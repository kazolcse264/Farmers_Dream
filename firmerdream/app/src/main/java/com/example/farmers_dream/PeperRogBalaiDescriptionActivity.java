package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PeperRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peper_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("pyper_chara_dhosha_rog")){

            imageView.setImageResource(R.drawable.pyper_chara_dhosha_rog);
            textView.setText(R.string.pyper_chara_dhosha_rog_description);

        }
        if(rog_description.equals("pyper_ghora_pocha_rog")){

            imageView.setImageResource(R.drawable.pyper_ghora_pocha_rog);
            textView.setText(R.string.pyper_ghora_pocha_rog_description);

        }
        if(rog_description.equals("pyper_potas_sharer_gharti")){

            imageView.setImageResource(R.drawable.pyper_potas_sharer_gharti);
            textView.setText(R.string.pyper_potas_sharer_gharti_description);

        }
        if(rog_description.equals("pyper_suti_mondo_rog")){

            imageView.setImageResource(R.drawable.pyper_suti_mondo_rog);
            textView.setText(R.string.pyper_suti_mondo_rog_description);

        }
        if(rog_description.equals("pyper_dholepora_rog")){

            imageView.setImageResource(R.drawable.pyper_dholepora_rog);
            textView.setText(R.string.pyper_dholepora_rog_description);

        }
        if(rog_description.equals("pyper_boron_sharer_gharti")){

            imageView.setImageResource(R.drawable.pyper_boron_sharer_gharti);
            textView.setText(R.string.pyper_boron_sharer_gharti_description);

        }
        if(rog_description.equals("pyper_vairasjonito_pata_kujkano_rog")){

            imageView.setImageResource(R.drawable.pyper_vairasjonito_pata_kujkano_rog);
            textView.setText(R.string.pyper_vairasjonito_pata_kujkano_rog_description);

        }
        if(rog_description.equals("pyper_vairasjonito_mojayek_rog")){

            imageView.setImageResource(R.drawable.pyper_vairasjonito_mojayek_rog);
            textView.setText(R.string.pyper_vairasjonito_mojayek_rog_description);

        }
        if(rog_description.equals("pyper_milibag_ba_catra_poka")){

            imageView.setImageResource(R.drawable.pyper_milibag_ba_catra_poka);
            textView.setText(R.string.pyper_milibag_ba_catra_poka_description);

        }

    }
}