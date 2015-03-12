package com.example.felixidan.loadersdemo;

import android.os.SystemClock;

/**
 * Created by idan on 12/03/15.
 */
public class TheBrain {

    public static Long upTimeInFiveSeconds(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        return new Long(SystemClock.uptimeMillis());
    }


}
