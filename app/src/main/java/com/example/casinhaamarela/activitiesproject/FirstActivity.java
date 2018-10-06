package com.example.casinhaamarela.activitiesproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    String status = "";
    int order = 0;

    private Button mButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mButton = findViewById(R.id.goSecondActivity);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SecondActivity.class);
                startActivity(i);
            }
        });

        status = "Activity Created";
//        displayStatus();
    }

//    @Override
//    protected void onStart(){
//        super.onStart();
//        status = "Activity Started";
//        displayStatus();
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState){
//        super.onRestoreInstanceState(savedInstanceState);
//        status = "Restoring Instance";
//        displayStatus();
//    }
//
//    @Override
//    protected void onResume(){
//        super.onResume();
//        status = "Activity Resumed";
//        displayStatus();
//    }
//
//    @Override
//    protected void onPause(){
//        super.onPause();
//        status = "Activity Paused";
//        displayStatus();
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState){
//        super.onSaveInstanceState(outState);
//        status = "Saving Instance";
//        displayStatus();
//    }
//
//    @Override
//    protected void onStop(){
//        super.onStop();
//        status = "Activity Paused";
//        displayStatus();
//    }
//
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        status = "Activity Destroyed";
//        displayStatus();
//    }
//
//    @Override
//    protected void onRestart(){
//        super.onRestart();
//        status = "Activity Restarted";
//        displayStatus();
//    }

    private void displayStatus() {
        order++;
        String message = String.valueOf(order) + ": " + status;
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
