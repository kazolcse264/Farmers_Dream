package com.example.farmers_dream;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LicuAdapter extends RecyclerView.Adapter<LicuAdapter.MyViewHolder> {

    private Intent intent;
    Context context;
    private int[] images;
    private String[] title,description;

    public LicuAdapter(Context context, int[] images, String[] title, String[] description) {
        this.context = context;
        this.images = images;
        this.title = title;
        this.description = description;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.dhan_sample_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.t1.setText(title[position]);
        holder.t2.setText(description[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(),DhanerRogBalaiDescription.class);

                // view.getContext().startActivity(intent);
                if(position == 0){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_patar_uilive");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 1){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_pata_murano_poka");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 2){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_pata_pora_rog");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 3){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_sceal_poka");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 4){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_fol_jore_jawa_somossa");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 5){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_pata_surongokari_poka");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 6){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_dauli_mildiu_rog");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 7){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_fol_sukeya_jawa_samossa");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 8){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_kander_marja_poka");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }
                if(position == 9){

                    Intent intent = new Intent(view.getContext(), LicurRogBalaiDescriptionActivity.class);
                    intent.putExtra("key","licur_patar_dag_rog");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);

                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView t1,t2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.myImageViewId);
            t1 = itemView.findViewById(R.id.titleTextViewId);
            t2 = itemView.findViewById(R.id.descriptionTextViewId);
        }
    }
}
