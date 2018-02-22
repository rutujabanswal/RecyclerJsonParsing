package com.learn2crack.recyclerjsonparsing;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> android;

    public DataAdapter(ArrayList<AndroidVersion> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.movie_name.setText(android.get(i).getName());
        viewHolder.movie_real.setText(android.get(i).getRealname());
        viewHolder.movie_team.setText(android.get(i).getTeam());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView movie_name,movie_real,movie_team;
        public ViewHolder(View view) {
            super(view);

            movie_name = (TextView)view.findViewById(R.id.tv_name);
            movie_real = (TextView)view.findViewById(R.id.tv_version);
            movie_team = (TextView)view.findViewById(R.id.tv_api_level);

        }
    }

}