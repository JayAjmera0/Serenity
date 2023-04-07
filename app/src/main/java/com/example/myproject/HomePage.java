package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomePage extends Fragment {

    public HomePage() {
// Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_page, container, false);

        Button btn1_card1 = view.findViewById(R.id.btn_homepage_card1);
        btn1_card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent iInfo1 = new Intent(getActivity(), btn_card1_homepage_popUp.class);
                startActivity(iInfo1);
            }
        });

        Button btn2_card2 = view.findViewById(R.id.btn_homepage_card2);
        btn2_card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent iInfo2 = new Intent(getActivity(), btn_card2_homepage_popUp.class);
                startActivity(iInfo2);
            }
        });

        Button btn3_card3 = view.findViewById(R.id.btn_homepage_card3);
        btn3_card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent iInfo3 = new Intent(getActivity(), btn_card3_homepage_popUp.class);
                startActivity(iInfo3);
            }
        });

        return view;
    }
}