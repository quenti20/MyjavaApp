package com.example.myjavaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

      EditText eTID ;
      Button btn1;
      TextView tV1;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTID = findViewById(R.id.ETid);
        btn1 = findViewById(R.id.btn1);
        tV1 = findViewById(R.id.tV1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idNumber = eTID.toString().trim();
                String dob = idNumber.substring(0,6);
                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));
                String myGender;
                if(gender<5){
                   myGender = "Female";
                }
                else
                    myGender = "Male";

                int Nationality = Integer.parseInt(Character.toString(idNumber.charAt(6)));
                String myNationality;
                if(Nationality == 0)
                    myNationality = "South African";
                else
                    myNationality = "Non-SouthAfrican";
                String Text = "date of Birth is "+dob+"\n"+"Gender is "+myGender+"\n"+"Nationality: "+myNationality+"\n";

                tV1.setText(Text);

            }

        });
    }
}