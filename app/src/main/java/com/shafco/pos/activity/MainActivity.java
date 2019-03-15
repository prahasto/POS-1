package com.shafco.pos.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shafco.pos.R;

public class MainActivity extends AppCompatActivity {
    private Button btnOrder, btnReport, btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOrder    = (Button)findViewById(R.id.btn_order);
        btnReport   = (Button)findViewById(R.id.btn_report);
        btnSetting  = (Button)findViewById(R.id.btn_setting);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });

        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReportActivity.class);
                startActivity(intent);
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
            }
        });
    }
}
