package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LicurRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licur_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("licur_patar_uilive")){

            imageView.setImageResource(R.drawable.licur_patar_uilive);
            textView.setText(R.string.licur_patar_uilive_description);

        }
        if(rog_description.equals("licur_pata_murano_poka")){

            imageView.setImageResource(R.drawable.licur_pata_murano_poka);
            textView.setText(R.string.licur_pata_murano_poka_description);

        }
        if(rog_description.equals("licur_pata_pora_rog")){

            imageView.setImageResource(R.drawable.licur_pata_pora_rog);
            textView.setText(R.string.licur_pata_pora_rog_description);

        }
        if(rog_description.equals("licur_sceal_poka")){

            imageView.setImageResource(R.drawable.licur_sceal_poka);
            textView.setText(R.string.licur_sceal_poka_description);

        }
        if(rog_description.equals("licur_fol_jore_jawa_somossa")){

            imageView.setImageResource(R.drawable.licur_fol_jore_jawa_somossa);
            textView.setText(R.string.licur_fol_jore_jawa_somossa_description);

        }
        if(rog_description.equals("licur_pata_surongokari_poka")){

            imageView.setImageResource(R.drawable.licur_pata_surongokari_poka);
            textView.setText(R.string.licur_pata_surongokari_poka_description);

        }
        if(rog_description.equals("licur_dauli_mildiu_rog")){

            imageView.setImageResource(R.drawable.licur_dauli_mildiu_rog);
            textView.setText(R.string.licur_dauli_mildiu_rog_description);

        }
        if(rog_description.equals("licur_fol_sukeya_jawa_samossa")){

            imageView.setImageResource(R.drawable.licur_fol_sukeya_jawa_samossa);
            textView.setText(R.string.licur_fol_sukeya_jawa_samossa_description);

        }
        if(rog_description.equals("licur_kander_marja_poka")){

            imageView.setImageResource(R.drawable.licur_kander_marja_poka);
            textView.setText(R.string.licur_kander_marja_poka_description);

        }
        if(rog_description.equals("licur_patar_dag_rog")){

            imageView.setImageResource(R.drawable.licur_patar_dag_rog);
            textView.setText(R.string.licur_patar_dag_rog_description);

        }


    }
}