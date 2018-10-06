package com.example.casinhaamarela.activitiesproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private Button mReturnButton = null;
    private Spinner mSpinner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();

        if (extras != null){

            String detailValues = extras.getString("KeyForSending");

            if (detailValues != null) {

                Toast.makeText(this, detailValues, Toast.LENGTH_SHORT).show();
            }
        }

        mSpinner = findViewById(R.id.spinnerSelection);

        mReturnButton = findViewById(R.id.returnSelection);

        mReturnButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent returnIntent = new Intent();
                String mySelection = mSpinner.getSelectedItem().toString();
                returnIntent.putExtra("KeyForReturning", mySelection);
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
