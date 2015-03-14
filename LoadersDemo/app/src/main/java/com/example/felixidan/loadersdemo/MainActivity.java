package com.example.felixidan.loadersdemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void goToActivityWithoutLoaders(View view) {
        goToActivity(ActivityWithoutLoadersActivity.class);
    }

    private void goToActivity(Class<?> target) {
        Intent i = new Intent(this, target);
        startActivity(i);
    }

    public void goToActivityWithLoaders(View view) {
        goToActivity(ActivityWithLoadersActivity.class);
    }

    public void goToActivityWithMultipleLoaders(View view) {

    }

    public void goToActivityWithFragmentsAndLoaders(View view) {

    }

    public void goToCursorLoader(View view) {
        goToActivity(SimpleCursorLoaderActivity.class);
    }

    public void goToCursorLoaderWithRestart(View view) {
    }

    public void goToAsyncTaskLoaderLifecycle(View view) {
        goToActivity(AsyncTaskLoaderLifecycleActivity.class);
    }
}
