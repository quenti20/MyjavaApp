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
          tV1.setVisibility(View.GONE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idNumber = eTID.toString();
                String d = idNumber.substring(0,6);
                int dob = Integer.parseInt(d);
                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));
                String myGender;
                if(gender<5){
                   myGender = "Female";
                }
                else
                    myGender = "Male";

                int Nationality = Integer.parseInt(Character.toString(idNumber.charAt(10)));
                String myNationality;
                if(Nationality == 0)
                    myNationality = getString(R.string.SA_Citizen);
                else
                    myNationality = getString(R.string.non_S_A_Citizen);
                String Text = getString(R.string.Dob)+dob+getString(R.string.Newlilne)+getString(R.string.MyGender)+myGender+getString(R.string.Newlilne)+getString(R.string.MyNationale)+myNationality+getString(R.string.Newlilne);

                tV1.setText(Text);
                tV1.setVisibility(View.VISIBLE);

            }

        });
    }
}