package com.shafco.pos.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.shafco.pos.R;

public class OrderActivity extends AppCompatActivity {

    private Button btn_add_product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        btn_add_product = (Button)findViewById(R.id.btn_add_product);
        btn_add_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });
    }
}
