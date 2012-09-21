package uk.co.thelesleys.simple_shopping_list_android;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
// import android.view.MenuItem;
// import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

        Log.i("MainActivity", "onCreate()");

        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
