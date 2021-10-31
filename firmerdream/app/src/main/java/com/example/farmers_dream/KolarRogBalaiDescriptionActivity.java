package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class KolarRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolar_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("kolar_kukambar_mojaik_vairas_rog")){

            imageView.setImageResource(R.drawable.kolar_kukambar_mojaik_vairas_rog);
            textView.setText(R.string.kolar_kukambar_mojaik_vairas_rog_description);

        }
        if(rog_description.equals("kola_gacher_kander_uilive")){

            imageView.setImageResource(R.drawable.kola_gacher_kander_uilive);
            textView.setText(R.string.kola_gacher_kander_uilive_description);

        }
        if(rog_description.equals("kolar_kardanar_dag_rog")){

            imageView.setImageResource(R.drawable.kolar_kardanar_dag_rog);
            textView.setText(R.string.kolar_kardanar_dag_rog_description);

        }
        if(rog_description.equals("kolar_anthraknoj_rog")){

            imageView.setImageResource(R.drawable.kolar_anthraknoj_rog);
            textView.setText(R.string.kolar_anthraknoj_rog_description);

        }
        if(rog_description.equals("kolar_pata_o_faler_bitol")){

            imageView.setImageResource(R.drawable.kolar_pata_o_faler_bitol);
            textView.setText(R.string.kolar_pata_o_faler_bitol_description);

        }
        if(rog_description.equals("kolar_guscomatha_rog")){

            imageView.setImageResource(R.drawable.kolar_guscomatha_rog);
            textView.setText(R.string.kolar_guscomatha_rog_description);

        }
        if(rog_description.equals("kolar_panama_rog")){

            imageView.setImageResource(R.drawable.kolar_panama_rog);
            textView.setText(R.string.kolar_panama_rog_description);

        }


    }
}