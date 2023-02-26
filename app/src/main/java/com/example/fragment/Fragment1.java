package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }
    public static Fragment1 newInstance(){
        return new Fragment1();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_1, container, false);

//        return inflater.inflate(R.layout.fragment_1, container, false);

            return rootView;
    }
}