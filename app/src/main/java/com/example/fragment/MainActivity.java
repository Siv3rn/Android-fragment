package com.example.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Boolean isDisplay = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_lihat);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isDisplay){
                    displayFragment();
                }
                else {
                    closeFragment();
                }
            }
        });

    }
    public void displayFragment(){
        Fragment1 fragment1 = Fragment1.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frag1, fragment1).addToBackStack(null).commit();
        button.setText("Tutup Kelebihan");
        isDisplay = true;

    }
    public void closeFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment1 fragment1 = (Fragment1) fragmentManager.findFragmentById(R.id.frag1);
        if (fragment1 != null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.remove(fragment1).commit();
        }
        button.setText("Lihat Kelebihan");
        isDisplay = false;
    }
}