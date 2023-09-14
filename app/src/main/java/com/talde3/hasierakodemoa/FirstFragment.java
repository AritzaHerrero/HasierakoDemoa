package com.talde3.hasierakodemoa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.firebase.firestore.FirebaseFirestore;


public class FirstFragment extends Fragment {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    public Button idatzi;
    public Button ezabatu;
    public TextView testua;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        idatzi = view.findViewById(R.id.idatzi);
        ezabatu =view.findViewById(R.id.ezabatu);
        testua =view.findViewById(R.id.testua);

        idatzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testua.setVisibility(View.VISIBLE);
            }
        });

        ezabatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testua.setVisibility(View.GONE);
            }
        });
        return view;
    }
}