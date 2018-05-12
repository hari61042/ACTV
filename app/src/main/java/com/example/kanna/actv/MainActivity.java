package com.example.kanna.actv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = findViewById(R.id.actv1);
        ArrayList<String> values = new ArrayList<>();
        values.add("India");
        values.add("Indonasia");
       // String[] values = getResources().getStringArray(R.array.countries);
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,values);
        actv.setAdapter(adapter);
        actv.setThreshold(1);

        AutoCompleteTextView act = findViewById(R.id.actv2);
        String[] value2 = getResources().getStringArray(R.array.states);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,value2);
        act.setAdapter(adapter1);
        act.setThreshold(1);
    }
}
