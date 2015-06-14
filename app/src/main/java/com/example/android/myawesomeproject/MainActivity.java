package com.example.android.myawesomeproject;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void openApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        CharSequence appName = "";
        switch (view.getId()) {
            case(R.id.spotifyAppButton):
                appName = getResources().getText(R.string.spotifyAppName);
                break;
            case(R.id.footAppButton):
                appName = getResources().getText(R.string.footAppName);
                break;
            case(R.id.libAppButton):
                appName = getResources().getText(R.string.libAppName);
                break;
            case(R.id.buildAppButton):
                appName = getResources().getText(R.string.buildAppName);
                break;
            case(R.id.xyzAppButton):
                appName = getResources().getText(R.string.xyzAppName);
                break;
            case(R.id.capstoneAppButton):
                appName = getResources().getText(R.string.capstoneAppName);
                break;
        }
        String text = "Launch " + appName + " app";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
