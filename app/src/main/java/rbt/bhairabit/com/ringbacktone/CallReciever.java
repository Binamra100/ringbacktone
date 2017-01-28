package rbt.bhairabit.com.ringbacktone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by Binamra on 1/18/2017.
 */
public class CallReciever extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
       Log.i("BINAMRA",this.getResultData());
       Toast.makeText(context, "hello",Toast.LENGTH_SHORT).show();
    }
}