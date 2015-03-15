package com.example.felixidan.loadersdemo;

import android.content.Context;
import android.database.Cursor;
import android.provider.UserDictionary;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by idan on 13/03/15.
 */
public class WordsAdapter extends CursorAdapter {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    public WordsAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        View v = mLayoutInflater.inflate(android.R.layout.two_line_list_item, parent, false);
        return v;
    }
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        String word = cursor.getString(cursor.getColumnIndex(UserDictionary.Words.WORD));
        int frequency = cursor.getInt(cursor.getColumnIndex(UserDictionary.Words.FREQUENCY));

        TextView line1 = (TextView)view.findViewById(android.R.id.text1);
        line1.setText(word);

        TextView line2 = (TextView)view.findViewById(android.R.id.text2);
        line2.setText(frequency + "");
    }
}
