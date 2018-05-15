package com.example.utso.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView text1,text2;
    Spinner spinner,nextSpinner;
    String[] str = {"Bangladesh","India","Pakistan","Nepal"};
    int flags[] = {R.drawable.bangladesh,R.drawable.india,R.drawable.pakistan,R.drawable.nepal};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);

        text1.setText(getIntent().getStringExtra("Name"));
        text2.setText(getIntent().getStringExtra("Address"));

        spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,str);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);

        nextSpinner = (Spinner) findViewById(R.id.spinner2);

        customAdapter customadapter = new customAdapter(getApplicationContext(),flags,str);
        nextSpinner.setAdapter(customadapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),str[position],Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
