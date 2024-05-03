package com.yogananta.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner Spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner1 = (Spinner)findViewById(R.id.Spinner1);

        List<String> negaraList = new ArrayList<>();
        negaraList.add("Albania");
        negaraList.add("Belgie");
        negaraList.add("Hungary");
        negaraList.add("Iran");
        negaraList.add("Slovenia");

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraList);
        Spinner1.setAdapter(na);
    }
}