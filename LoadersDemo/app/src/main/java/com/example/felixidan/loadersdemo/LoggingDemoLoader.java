package com.example.felixidan.loadersdemo;

import android.content.Context;
import android.util.Log;

/**
 * Created by idan on 14/03/15.
 */
public class LoggingDemoLoader extends DemoLoader {
    private static final String TAG = "LoggingDemoLoader";

    public LoggingDemoLoader(Context context) {
        super(context);
    }



    @Override
    public void onContentChanged() {
        Log.i(TAG, "Loader.onContentChanged()");
        super.onContentChanged();
    }

    @Override
    protected void onAbandon() {
        Log.i(TAG, "Loader.onAbandon()");
        super.onAbandon();
    }

    @Override
    protected Long onLoadInBackground() {
        Log.i(TAG, "AsyncTaskLoader.onLoadInBackground()");
        return super.onLoadInBackground();
    }

//    Note:Uncomment if minSDK >=16
//    @Override
//    protected boolean onCancelLoad() {
//        Log.i(TAG, "AsyncTaskLoader.onCancelLoad()");
//        return super.onCancelLoad();
//    }

    @Override
    protected void onForceLoad() {
        Log.i(TAG, "AsyncTaskLoader.onForceLoad()");
        super.onForceLoad();
    }

    @Override
    protected void onStopLoading() {
        Log.i(TAG, "?.onStopLoading()");
        super.onStopLoading();
    }

    @Override
    protected void onStartLoading() {
        Log.i(TAG, "?.onStartLoading()");
        super.onStartLoading();
    }

    @Override
    protected void onReset() {
        Log.i(TAG, "?.onReset()");
        super.onReset();
    }

    @Override
    public void onCanceled(Long data) {
        Log.i(TAG, "?.onCanceled()");
        super.onCanceled(data);
    }
}
