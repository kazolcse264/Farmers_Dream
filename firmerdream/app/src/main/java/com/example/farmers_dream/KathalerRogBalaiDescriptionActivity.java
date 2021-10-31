package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class KathalerRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kathaler_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("kataler_kando_cidrokari_poka")){

            imageView.setImageResource(R.drawable.kataler_kando_cidrokari_poka);
            textView.setText(R.string.kataler_kando_cidrokari_poka_description);

        }
        if(rog_description.equals("kataler_fol_bikkriti")){

            imageView.setImageResource(R.drawable.kataler_fol_bikkriti);
            textView.setText(R.string.kataler_fol_bikkriti_description);

        }
        if(rog_description.equals("kataler_fol_pocha_rog")){

            imageView.setImageResource(R.drawable.kataler_fol_pocha_rog);
            textView.setText(R.string.kataler_fol_pocha_rog_description);

        }
        if(rog_description.equals("kataler_wyipoka")){

            imageView.setImageResource(R.drawable.kataler_wyipoka);
            textView.setText(R.string.kataler_wyipoka_description);

        }
        if(rog_description.equals("kataler_scela_poka")){

            imageView.setImageResource(R.drawable.kataler_scela_poka);
            textView.setText(R.string.kataler_scela_poka_description);

        }
        if(rog_description.equals("kataler_folchidrokari_poka")){

            imageView.setImageResource(R.drawable.kataler_folchidrokari_poka);
            textView.setText(R.string.kataler_folchidrokari_poka_description);

        }
        if(rog_description.equals("kataler_jab_poka")){

            imageView.setImageResource(R.drawable.kataler_jab_poka);
            textView.setText(R.string.kataler_jab_poka_description);

        }
        if(rog_description.equals("kataler_patar_dagrog")){

            imageView.setImageResource(R.drawable.kataler_patar_dagrog);
            textView.setText(R.string.kataler_patar_dagrog_description);

        }


    }
}