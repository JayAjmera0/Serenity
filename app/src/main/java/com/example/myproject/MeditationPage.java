
package com.example.myproject;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class MeditationPage extends Fragment {

    Button play, pause;
    Button play2, pause2;
    Button play3, pause3;
    Button play4, pause4;
    Button play5, pause5;
    Button play6, pause6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_meditation_page, container, false);

        play = (Button) rootView.findViewById(R.id.play);
        pause = (Button) rootView.findViewById(R.id.pause);

        play2 = (Button) rootView.findViewById(R.id.play2);
        pause2 = (Button) rootView.findViewById(R.id.pause2);

        play3 = (Button) rootView.findViewById(R.id.play3);
        pause3 = (Button) rootView.findViewById(R.id.pause3);

        play4 = (Button) rootView.findViewById(R.id.play4);
        pause4 = (Button) rootView.findViewById(R.id.pause4);

        play5 = (Button) rootView.findViewById(R.id.play5);
        pause5 = (Button) rootView.findViewById(R.id.pause5);

        play6 = (Button) rootView.findViewById(R.id.play6);
        pause6 = (Button) rootView.findViewById(R.id.pause6);

        final MediaPlayer music = MediaPlayer.create(getActivity(), R.raw.meditation1);
        final MediaPlayer music2 = MediaPlayer.create(getActivity(), R.raw.meditation2);
        final MediaPlayer music3 = MediaPlayer.create(getActivity(), R.raw.meditation3);
        final MediaPlayer music4 = MediaPlayer.create(getActivity(), R.raw.meditation4);
        final MediaPlayer music5 = MediaPlayer.create(getActivity(), R.raw.meditation5);
        final MediaPlayer music6 = MediaPlayer.create(getActivity(), R.raw.meditation6);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.setLooping(true);
                music.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (music.isPlaying()) {
                    music.pause();
                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music2.setLooping(true);
                music2.start();
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (music2.isPlaying()) {
                    music2.pause();
                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music3.setLooping(true);
                music3.start();
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (music3.isPlaying()) {
                    music3.pause();
                }
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music4.setLooping(true);
                music4.start();
            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (music4.isPlaying()) {
                    music4.pause();
                }
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music5.setLooping(true);
                music5.start();
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (music5.isPlaying()) {
                    music5.pause();
                }
            }
        });

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music6.setLooping(true);
                music6.start();
            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (music6.isPlaying()) {
                    music6.pause();
                }
            }
        });

        return rootView;
    }
}