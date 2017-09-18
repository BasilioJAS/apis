package ar.com.basilium.apis.fabric;

/**
 * Created by sader on 16/9/2017.
 */

import android.content.Context;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;


public class fabricInterface {

    private fabricInterface() {}
    private static fabricInterface  instance = null;
    public static fabricInterface getInstance(){
        if (instance == null) instance = new fabricInterface();
        return instance;
    }

    public void init(Context context, boolean debuggable){
        final Fabric fabric =
                new Fabric.Builder(context)
                        .kits(new Crashlytics())
                        .debuggable(debuggable)
                        .build();

        Fabric.with(fabric);
    }


    public void testCrash()
    {
        throw new RuntimeException("This is a crash");
    }
    public void logUser() {
        // TODO: Use the current user's information
        // You can call any combination of these three methods
        Crashlytics.setUserIdentifier("12345");
        Crashlytics.setUserEmail("user@fabric.io");
        Crashlytics.setUserName("Test User");

    }


}
