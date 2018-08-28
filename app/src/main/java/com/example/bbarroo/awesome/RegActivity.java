package com.example.bbarroo.awesome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class RegActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        RelativeLayout btn1 = (RelativeLayout)findViewById(R.id.goMain);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
