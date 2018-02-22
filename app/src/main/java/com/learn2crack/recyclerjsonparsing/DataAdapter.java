package com.learn2crack.recyclerjsonparsing;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<MovieList> movie;

    public DataAdapter(ArrayList<MovieList> movie) {
        this.movie= movie;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.movie_name.setText(movie.get(i).getName());
        viewHolder.movie_real.setText(movie.get(i).getRealname());
        viewHolder.movie_team.setText(movie.get(i).getTeam());
    }

    @Override
    public int getItemCount() {
        return movie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView movie_name,movie_real,movie_team;
        public ViewHolder(View view) {
            super(view);

            movie_name = (TextView)view.findViewById(R.id.name);
            movie_real = (TextView)view.findViewById(R.id.realname);
            movie_team = (TextView)view.findViewById(R.id.team);

        }
    }

}