package com.example.betahood.masenohotlibapp.Views.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.betahood.masenohotlibapp.R;

public class FragmentVideos extends Fragment {
    View view;

    public FragmentVideos() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.videos_fragment, container, false);
        return view;
    }
}
