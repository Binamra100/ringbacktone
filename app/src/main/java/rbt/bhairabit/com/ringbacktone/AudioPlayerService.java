package rbt.bhairabit.com.ringbacktone;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Binamra on 1/4/2017.
 */
public class AudioPlayerService extends Service {

        MediaPlayer mp;
        @Override
        public IBinder onBind(Intent intent) {
            // TODO Auto-generated method stub
            return null;
        }
        public void onCreate()
        {
            mp = MediaPlayer.create(this, R.raw.bell);
            mp.setLooping(false);
        }
        public void onDestroy()
        {
            mp.stop();
        }
        public void onStart(Intent intent,int startid){

            Log.w("RBT", "On start");
            mp.start();
        }
}
