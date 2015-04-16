package com.example.amil.my_shopping;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class seach_brandplace extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seach_brandplace);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_seach_brandplace, menu);


        String[] foodcity_plces = { "Colombo 5","Colombo 4","Colombo 7" };

        ArrayAdapter arrayAdapter;

        ListView listView = (ListView) findViewById(R.id.zone_lisw);

        arrayAdapter = new ArrayAdapter(this,R.layout.set_foodcitylocationlist, R.id.tvName1, foodcity_plces);

        listView.setAdapter(arrayAdapter);

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
}
