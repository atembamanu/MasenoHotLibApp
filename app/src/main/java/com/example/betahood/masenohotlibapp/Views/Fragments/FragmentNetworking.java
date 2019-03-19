package com.example.betahood.masenohotlibapp.Views.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.betahood.masenohotlibapp.R;

public class FragmentNetworking extends Fragment {
    View view;

    public FragmentNetworking() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.networking_fragment, container, false);
        return view;
    }
}
