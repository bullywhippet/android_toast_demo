package com.kellydwalters.demoapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make button
        Button btnTest = findViewById(R.id.btnTest);
        
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the layout for the toast
                LayoutInflater inflater = getLayoutInflater();

                //set the view to the layout in the toast xml
                View viewLayout = inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.toast_layout_root));


                // bring in image of toast
                ImageView image = (ImageView) viewLayout.findViewById(R.id.image);
                image.setImageResource(R.drawable.toast);


                // set a message
                TextView text = (TextView) viewLayout.findViewById(R.id.text);
                text.setText("Button is clicked! GOOD JOB!");
                text.setTextSize(24);
                text.setTextColor(Color.YELLOW);
                text.setBackgroundColor(Color.BLUE);



                // Make the toast and customize it
                Toast toast = new Toast(getApplicationContext());
                // put it in the middle of the screen
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                // make it stay for awhile
                toast.setDuration(Toast.LENGTH_LONG);
                // set its bg color to blue
                viewLayout.setBackgroundColor(Color.BLUE);
                //set the view to the one we made above
                toast.setView(viewLayout);
                // show the toast
                toast.show();
            }
        });
    }


}
