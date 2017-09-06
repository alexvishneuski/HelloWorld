package com.hotmail.alex_vishneuski.helloworld;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find btn
        btnShowToast = (Button) findViewById(R.id.btnShowToast);

        // creating listener
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set action
                showToast(btnShowToast);
            }
        };

        // wiring listener to the button
        btnShowToast.setOnClickListener(oclBtn);
    }


    //create and show the text message
    public void showToast(View view){

        Toast toast = Toast.makeText(getApplicationContext(),
                "Hello EPAM!",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
}
