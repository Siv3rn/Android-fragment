package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {



    public Fragment2() {
        // Required empty public constructor
    }

    public static Fragment2 newInstance(){
        return new Fragment2();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_2, container, false);

//        return inflater.inflate(R.layout.fragment_1, container, false);

        return rootView;    }
}