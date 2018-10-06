package com.example.casinhaamarela.activitiesproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    public static final int DETAIL_REQUEST = 1;

    private Button mButton = null;
    private Button mDetailButton = null;
    private TextView mSelectedView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mSelectedView = findViewById(R.id.userSelection);

        mButton = findViewById(R.id.goFirstActivity);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), FirstActivity.class);
                startActivity(i);
            }
        });

        mDetailButton = findViewById(R.id.goDetailActivity);
        mDetailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                i.putExtra("KeyForSending","Some data from SecondActivity");

                startActivityForResult(i, DETAIL_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == RESULT_OK && requestCode == DETAIL_REQUEST) {
            if (data.hasExtra("KeyForReturning")) {
                String myValue = (String) data.getExtras().get("KeyForReturning");
                mSelectedView.setText(myValue);
            }
        }
    }
}
