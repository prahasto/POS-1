package com.shafco.pos.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.zxing.Result;

import androidx.appcompat.app.AppCompatActivity;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mScannerView = new ZXingScannerView(this);
        setContentView(mScannerView);
    }
    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }
    @Override
    public void handleResult(Result rawResult) {
        Log.d("TAG", rawResult.getText()); // Prints scan results
        Log.d("TAG", rawResult.getBarcodeFormat().toString());
        onBackPressed();


    }

}
