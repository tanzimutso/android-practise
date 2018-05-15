package com.example.utso.test;

import java.lang.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

  EditText e_name, e_address;
  Button button;

  @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      e_name = (EditText) findViewById(R.id.editText1);
      e_address = (EditText) findViewById(R.id.editText2);



  }

  public void formbutton(View view){
    String str1 = e_name.getText().toString();
    String str2 = e_address.getText().toString();
     Intent intent = new Intent(MainActivity.this, Main2Activity.class);
     intent.putExtra("Name",str1);
    intent.putExtra("Address",str2);
    startActivity(intent);


  }



}
