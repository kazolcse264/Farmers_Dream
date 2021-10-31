package com.example.farmers_dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class JamerRogBalaiDescriptionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamer_rog_balai_description);

        imageView = findViewById(R.id.rogBalaiDescriptionImageViewId);
        textView = findViewById(R.id.rogBalaiDescriptionTextViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String rog_description = bundle.getString("key");
            showDetails(rog_description);
        }

    }
    void showDetails(String rog_description){

        if(rog_description.equals("jamer_patar_uilive")){

            imageView.setImageResource(R.drawable.jamer_patar_uilive);
            textView.setText(R.string.jamer_patar_uilive_description);

        }
        if(rog_description.equals("jamer_pathar_dag_rog")){

            imageView.setImageResource(R.drawable.jamer_pathar_dag_rog);
            textView.setText(R.string.jamer_pathar_dag_rog_description);

        }
        if(rog_description.equals("jamer_lal_moricha_rog")){

            imageView.setImageResource(R.drawable.jamer_lal_moricha_rog);
            textView.setText(R.string.jamer_lal_moricha_rog_description);

        }
        if(rog_description.equals("jamer_pata_morano_rog")){

            imageView.setImageResource(R.drawable.jamer_pata_morano_rog);
            textView.setText(R.string.jamer_pata_morano_rog_description);

        }


    }
}