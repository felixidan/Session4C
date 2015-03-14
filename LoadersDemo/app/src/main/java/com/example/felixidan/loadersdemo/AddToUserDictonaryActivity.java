package com.example.felixidan.loadersdemo;

import android.annotation.TargetApi;
import android.os.Build;
import android.provider.UserDictionary;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class AddToUserDictonaryActivity extends ActionBarActivity {

    private TextView newWordTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_user_dictonary);

        newWordTV = (TextView)findViewById(R.id.addToUD_newWord);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_to_user_dictonary, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addWord(View view) {
        String newWord = newWordTV.getText().toString();
        UserDictionary.Words.addWord(this, newWord, 1, null, null);
        Toast.makeText(this, "", Toast.LENGTH_LONG).show();
    }
}
