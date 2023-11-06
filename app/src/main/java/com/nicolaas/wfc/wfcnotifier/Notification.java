package com.nicolaas.wfc.wfcnotifier;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class Notification extends Service {

    private long rfr = 30 * 1000;
    public Notification() {
    }

    public int onStartCommand(Context context, int flags, int startID){

        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void scheduleNext(){
        AlarmManager manager = getSystemService("")
    }
}