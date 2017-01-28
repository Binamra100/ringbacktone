package rbt.bhairabit.com.ringbacktone;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Binamra on 1/4/2017.
 */
public class CallDetectService extends Service {
    private CallDetector callDetector;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.w("RBT", "CallDetectService.onStartCommand");

        callDetector = new CallDetector(this);
        int r = super.onStartCommand(intent, flags, startId);
        callDetector.start();
        return r;
    }

    @Override
    public void onDestroy() {
        Log.w("RBT", "CallDetectService.onDestroy");

        super.onDestroy();
        callDetector.start();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }}

