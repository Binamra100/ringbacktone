package rbt.bhairabit.com.ringbacktone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Shweta on 1/4/2017.
 */
public class RingBack extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.w("RBT", "RingBack");

        String number = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);

        Toast.makeText(context,
                "Outgoing: "+number,
                Toast.LENGTH_LONG).show();



        Toast.makeText(context, "Boot Complete.", Toast.LENGTH_LONG).show();
        Log.w("RBT", "RingBack");

        Intent airplanemode = new Intent(context, AudioPlayerService.class);
        context.startService(airplanemode);
    }
}
