package com.example.myproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;


public class YogaPage extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Profileview = inflater.inflate(R.layout.fragment_yoga_page, container, false);

        ImageView imageView1=(ImageView) Profileview.findViewById(R.id.yoga2);
        ImageView imageView2=(ImageView) Profileview.findViewById(R.id.yoga3);
        ImageView imageView3=(ImageView) Profileview.findViewById(R.id.yoga4);
        ImageView imageView4=(ImageView) Profileview.findViewById(R.id.yoga5);
        // Inflate the layout for this fragment
        //imageView.setImageResource(R.drawable.abc);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to launch the new activity
                Intent intent = new Intent(getContext(), Yoga2.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to launch the new activity
                Intent intent = new Intent(getContext(), Yoga3.class);
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to launch the new activity
                Intent intent = new Intent(getContext(), Yoga4.class);
                startActivity(intent);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to launch the new activity
                Intent intent = new Intent(getContext(), Yoga5.class);
                startActivity(intent);
            }
        });
        return Profileview;
    }
}
