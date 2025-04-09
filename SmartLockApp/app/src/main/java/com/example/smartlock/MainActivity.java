package com.example.smartlock;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView status;
    Button lockBtn, unlockBtn;
    BluetoothAdapter bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        status=findViewById(R.id.status);
        lockBtn=findViewById(R.id.lockBtn);
        unlockBtn=findViewById(R.id.unlockBtn);
        bt=BluetoothAdapter.getDefaultAdapter();

        lockBtn.setOnClickListener(v -> status.setText("Locked"));
        unlockBtn.setOnClickListener(v -> {
            if(bt!=null && bt.isEnabled()) status.setText("Unlocked via Bluetooth");
            else status.setText("Bluetooth not available");
        });
    }
}