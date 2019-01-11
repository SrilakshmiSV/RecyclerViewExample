package com.srilakshmi.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> usersList=initUsers();

        // Create RecyclerView List
        mRecyclerView=findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter=new RecyclerAdapter(usersList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<User> initUsers()
    {
        // Adding user objects to the list

        ArrayList<User> usersList=new ArrayList<>();

        User user1=new User("Amy", 20);

        User user2=new User("Annie", 24);

        User user3=new User("Benjamin", 25);

        User user4=new User("Brett", 19);

        User user5=new User("Bill", 29);

        User user6=new User("Calvin", 27);

        User user7=new User("Desmond", 25);

        User user8=new User("Paul", 20);

        User user9=new User("Steven", 30);

        User user10=new User("Leslie", 22);

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);
        usersList.add(user6);
        usersList.add(user7);
        usersList.add(user8);
        usersList.add(user9);
        usersList.add(user10);

        return usersList;
    }
}
