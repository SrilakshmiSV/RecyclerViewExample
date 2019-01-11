package com.srilakshmi.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<User> users;

    RecyclerAdapter(ArrayList<User> users)
    {
        this.users=users;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        User user=users.get(position);

        holder.userName.setText(user.getUserName());
        holder.age.setText(String.valueOf(user.getAge()));
    }

    @Override
    public int getItemCount() {
        if (users !=null)
        {
            System.out.println("Number of users: "+ users.size());
            return users.size();
        }
        else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        TextView userName;
        TextView age;

        ViewHolder(View view)
        {
            super(view);
            this.view=view;
            this.userName=view.findViewById(R.id.username);
            this.age=view.findViewById(R.id.age);
        }
    }
}