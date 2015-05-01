package com.powermoves.aleckson.understatement.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.powermoves.aleckson.understatement.MainActivity;
import com.powermoves.aleckson.understatement.R;
import com.powermoves.aleckson.understatement.Util.TvShows;

import java.util.Collections;
import java.util.List;

/**
 * Created by aleckson on 4/28/2015.
 */
public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.MyViewholder> {

    List<TvShows> mtvShows = Collections.emptyList();
    public final LayoutInflater mLayoutInflater;
    public final MainActivity context;


    public ShowAdapter(MainActivity context, List<TvShows> mtvShows){
        mLayoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.mtvShows = mtvShows;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.list_popular,viewGroup,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(ShowAdapter.MyViewholder holder, int i) {

        TvShows tvs = mtvShows.get(i);
        holder.Voriginal_name.setText(tvs.original_name);
        holder.Vvote_average.setText(tvs.vote_average);
        holder.Vfirst_air_date.setText(tvs.first_air_date);


    }

    @Override
    public int getItemCount() {
        return mtvShows.size();
    }

    protected class MyViewholder extends RecyclerView.ViewHolder{
        public TextView Voriginal_name;
        public TextView Vfirst_air_date;
        public TextView Vvote_average;


        public MyViewholder(View itemView) {
            super(itemView);
            Voriginal_name = (TextView) itemView.findViewById(R.id.original_name);
            Vfirst_air_date = (TextView) itemView.findViewById(R.id.first_air_date);
            Vvote_average = (TextView) itemView.findViewById(R.id.vote_average);

        }
    }
}
