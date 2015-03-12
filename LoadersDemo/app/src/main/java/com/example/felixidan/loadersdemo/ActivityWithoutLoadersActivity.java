package com.example.felixidan.loadersdemo;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ActivityWithoutLoadersActivity extends ActionBarActivity {

    private long createTime;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_without_loaders);

        resultView = (TextView)findViewById(R.id.without_loaderResult);

        createTime = SystemClock.uptimeMillis();
        resultView.setText("0");

        LoadSomeData task = new LoadSomeData();
        task.execute();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_without_loaders, menu);
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

    private class LoadSomeData extends AsyncTask<Void, Void, Long>{

        @Override
        protected Long doInBackground(Void... params) {
            return TheBrain.upTimeInFiveSeconds();
        }

        @Override
        protected void onPostExecute(Long results) {
            publishResults(results);
        }
    }

    private void publishResults(Long results) {
        long delta = results.longValue() - createTime;
        resultView.setText(delta + "");
    }
}
