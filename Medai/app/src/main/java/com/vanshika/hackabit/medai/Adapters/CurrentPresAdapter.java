package com.vanshika.hackabit.medai.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vanshika.hackabit.medai.Models.CurrentMedicine;
import com.vanshika.hackabit.medai.Models.MedicineDb;
import com.vanshika.hackabit.medai.R;

import java.util.ArrayList;

public class CurrentPresAdapter extends RecyclerView.Adapter<CurrentPresAdapter.listViewHolder>{
    private Context context;
    private ArrayList<CurrentMedicine> list;

    public CurrentPresAdapter(Context context, ArrayList<CurrentMedicine> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        listViewHolder holder =
                new listViewHolder(LayoutInflater.from(context).inflate(R.layout.card_current_dose, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        CurrentMedicine object=list.get(position);
        holder.doseName.setText(object.getMedicineName());
        holder.doseDes.setText(object.getMedicineInfo());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class listViewHolder extends RecyclerView.ViewHolder {
        public TextView doseName,doseDes;

        public listViewHolder(View itemView) {
            super(itemView);

            doseName = (TextView) itemView.findViewById(R.id.doseName);
            doseDes = (TextView) itemView.findViewById(R.id.doseDes);

        }
    }
}
