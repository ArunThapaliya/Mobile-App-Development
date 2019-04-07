package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mShowCount;
    int Count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);


    }



    public void btn_count(View view) {
        Count++;
       mShowCount.setText(""+ Count);

    }

    public void btn_toast(View view) {
        Toast toast = Toast.makeText(this,"Hello Toast",
                Toast.LENGTH_LONG);
        toast.show();

    }


}
