package uk.co.thelesleys.simple_shopping_list_android;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
// import android.view.MenuItem;
// import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

			{
				// TODO: for RAD only - dummy implementation!
		        ListView listView = (ListView)findViewById(R.id.main_list);
		        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
		          "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		          "Linux", "OS/2" };
		        // First parameter - Context
		        // Second parameter - Layout for the row
		        // Third parameter - ID of the TextView to which the data is written
		        // Forth - the Array of data
		        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				          R.layout.list_view, R.id.list_view_item, values);
		        // Assign adapter to ListView
		        listView.setAdapter(adapter);

		        ((TextView)findViewById(R.id.empty_text)).setVisibility(adapter.getCount() == 0 ? TextView.VISIBLE : TextView.GONE); // show if 0; don't if >0
			}

			return true;  // handled
		case R.id.menu_about:
			Log.i("MainActivity", "Menu item: About");

			{
		        // TODO: for RAD only - dummy implementation!
		        ListView listView = (ListView)findViewById(R.id.main_list);
		        listView.setAdapter(null);

		        ((TextView)findViewById(R.id.empty_text)).setVisibility(TextView.VISIBLE); // show if 0; don't if >0
			}

			return true;  // handled
		}
		return super.onOptionsItemSelected(item);
	}
    
}
