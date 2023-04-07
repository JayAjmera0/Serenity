package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfilePage extends Fragment {

    Button btnLogout;
    FirebaseAuth mAuth;


    public ProfilePage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Profileview = inflater.inflate(R.layout.fragment_profile_page, container, false);



        return(Profileview);
    }
}

