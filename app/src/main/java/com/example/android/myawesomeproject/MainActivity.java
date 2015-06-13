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

    public void openSpotifyApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Launch Spotify Streamer app";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void openFootApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Launch Football scores app";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void openLibApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Launch Library app";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void openBuildApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Launch Build it bigger app";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void openXyzApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Launch XYZ Reader app";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void openCapstoneApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Launch Capstone app";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
