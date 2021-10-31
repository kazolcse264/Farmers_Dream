package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AkherRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akher_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("akher_kalo_pata_foring")){

            imageView.setImageResource(R.drawable.akher_kalo_pata_foring);
            textView.setText(R.string.akher_kalo_pata_foring_description);

        }
        if(rog_description.equals("akher_patar_lal_dag_rog")){

            imageView.setImageResource(R.drawable.akher_patar_lal_dag_rog);
            textView.setText(R.string.akher_patar_lal_dag_rog_description);

        }
        if(rog_description.equals("akher_mojaik_rog")){

            imageView.setImageResource(R.drawable.akher_mojaik_rog);
            textView.setText(R.string.akher_mojaik_rog_description);

        }
        if(rog_description.equals("akher_patar_surongokari_poka")){

            imageView.setImageResource(R.drawable.akher_patar_surongokari_poka);
            textView.setText(R.string.akher_patar_surongokari_poka_description);

        }
        if(rog_description.equals("akher_pata_kheko_uindil_poka")){

            imageView.setImageResource(R.drawable.akher_pata_kheko_uindil_poka);
            textView.setText(R.string.akher_pata_kheko_uindil_poka_description);

        }
        if(rog_description.equals("akher_cokkhu_dag_rog")){

            imageView.setImageResource(R.drawable.akher_cokkhu_dag_rog);
            textView.setText(R.string.akher_cokkhu_dag_rog_description);

        }
        if(rog_description.equals("akher_ui_poka")){

            imageView.setImageResource(R.drawable.akher_ui_poka);
            textView.setText(R.string.akher_ui_poka_description);

        }
        if(rog_description.equals("akher_thrips_poka")){

            imageView.setImageResource(R.drawable.akher_thrips_poka);
            textView.setText(R.string.akher_thrips_poka_description);

        }
        if(rog_description.equals("akher_sada_pata_rog")){

            imageView.setImageResource(R.drawable.akher_sada_pata_rog);
            textView.setText(R.string.akher_sada_pata_rog_description);

        }
        if(rog_description.equals("akher_sada_makor")){

            imageView.setImageResource(R.drawable.akher_sada_makor);
            textView.setText(R.string.akher_sada_makor_description);

        }
        if(rog_description.equals("akher_kalo_shis_rog")){

            imageView.setImageResource(R.drawable.akher_kalo_shis_rog);
            textView.setText(R.string.akher_kalo_shis_rog_description);

        }
        if(rog_description.equals("akher_sutimold_rog")){

            imageView.setImageResource(R.drawable.akher_sutimold_rog);
            textView.setText(R.string.akher_sutimold_rog_description);

        }
        if(rog_description.equals("akher_poshomi_jab_poka")){

            imageView.setImageResource(R.drawable.akher_poshomi_jab_poka);
            textView.setText(R.string.akher_poshomi_jab_poka_description);

        }
        if(rog_description.equals("akher_jab_poka")){

            imageView.setImageResource(R.drawable.akher_jab_poka);
            textView.setText(R.string.akher_jab_poka_description);

        }
        if(rog_description.equals("akher_bij_poca_rog")){

            imageView.setImageResource(R.drawable.akher_bij_poca_rog);
            textView.setText(R.string.akher_bij_poca_rog_description);

        }
        if(rog_description.equals("akher_wild_rog")){

            imageView.setImageResource(R.drawable.akher_wild_rog);
            textView.setText(R.string.akher_wild_rog_description);

        }
        if(rog_description.equals("akher_lal_poca_rog")){

            imageView.setImageResource(R.drawable.akher_lal_poca_rog);
            textView.setText(R.string.akher_lal_poca_rog_description);

        }
        if(rog_description.equals("akher_kander_majra_poka")){

            imageView.setImageResource(R.drawable.akher_kander_majra_poka);
            textView.setText(R.string.akher_kander_majra_poka_description);

        }
        if(rog_description.equals("akher_gorar_majra_poka")){

            imageView.setImageResource(R.drawable.akher_gorar_majra_poka);
            textView.setText(R.string.akher_gorar_majra_poka_description);

        }
        if(rog_description.equals("akher_agar_majra_poka")){

            imageView.setImageResource(R.drawable.akher_agar_majra_poka);
            textView.setText(R.string.akher_agar_majra_poka_description);

        }



    }
}