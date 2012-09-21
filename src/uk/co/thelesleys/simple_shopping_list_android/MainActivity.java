package uk.co.thelesleys.simple_shopping_list_android;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
// import android.view.MenuItem;
// import android.support.v4.app.NavUtils;
import android.view.MenuItem;

// TODO: work through http://www.vogella.com/articles/AndroidListView/article.html
//       (or similar)
//       as the basis of the shopping list App

/**
 * @author lesleyr
 * @version 1
 *
 */

/**
 * Main Activity
 *
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

        Log.i("MainActivity", "onCreate()");

        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
		Log.i("MainActivity", "onCreateOptionsMenu()");

		getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Log.i("MainActivity", "onOptionsItemSelected(" + item.getTitle() + ")");

		switch (item.getItemId()) {
		case R.id.menu_settings:
			Log.i("MainActivity", "Menu item: Settings");
			return true;  // handled
		case R.id.menu_about:
			Log.i("MainActivity", "Menu item: About");
			return true;  // handled
		}
		return super.onOptionsItemSelected(item);
	}
    
}
