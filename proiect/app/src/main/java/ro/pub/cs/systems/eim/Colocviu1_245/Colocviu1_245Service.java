package ro.pub.cs.systems.eim.Colocviu1_245;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.util.Random;

public class Colocviu1_245Service extends Service {

    final private IBinder boundedServiceBinder = (IBinder) new BoundedServiceBinder();
    final private Random random = new Random();

    public class BoundedServiceBinder extends Binder {
        public Colocviu1_245Service getService() {
            return Colocviu1_245Service.this;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("[Bounded Service]", "onCreate() method was invoked");
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("[Bounded Service]", "onBind() method was invoked");
        return boundedServiceBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d("[Bounded Service]", "onUnbind() method was invoked");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.d("[Bounded Service]", "onDestroy() method was invoked");
        super.onDestroy();
    }
}
