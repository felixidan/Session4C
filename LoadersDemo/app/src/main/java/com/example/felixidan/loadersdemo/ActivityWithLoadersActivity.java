package com.example.felixidan.loadersdemo;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ActivityWithLoadersActivity extends ActionBarActivity 
                                         implements LoaderManager.LoaderCallbacks<Long>{

    private static final int LOADER_ID = 31415;

    private long createTime;

    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_with_loaders);

        resultView = (TextView)findViewById(R.id.with_loaderResult);

        getLoaderManager().initLoader(LOADER_ID, null, this);DL

        createTime = SystemClock.uptimeMillis();
        resultView.setText("0");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_with_loaders, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public Loader<Long> onCreateLoader(int id, Bundle args) {
        return new DemoLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<Long> loader, Long data) {
        long responseTime = data.longValue();
        long delta = responseTime - createTime;
        resultView.setText(delta + "");
    }

    @Override
    public void onLoaderReset(Loader<Long> loader) {
        // Nothing to do
    }
}
