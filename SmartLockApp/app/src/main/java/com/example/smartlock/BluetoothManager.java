package com.example.smartlock;

import android.bluetooth.BluetoothAdapter;

public class BluetoothManager {
    public static boolean isBluetoothAvailable() {
        BluetoothAdapter bt=BluetoothAdapter.getDefaultAdapter();
        return bt!=null && bt.isEnabled();
    }
}