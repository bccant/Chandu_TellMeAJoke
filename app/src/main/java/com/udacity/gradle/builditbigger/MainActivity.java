package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.chandu.jokedisplay.JavaActivity;


public class MainActivity extends AppCompatActivity implements EndpointsAsyncTask.gcmHook {
    ProgressBar progressBar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

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



    public void tellJoke(View view) {
        new EndpointsAsyncTask(this).execute();
        progressBar.setVisibility(View.VISIBLE);
    }


    @Override
    public void onRetrieval(String joke) {
        progressBar.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(this, JavaActivity.class);
        intent.putExtra(JavaActivity.JOKE_KEY, joke);
        startActivity(intent);
    }
}
