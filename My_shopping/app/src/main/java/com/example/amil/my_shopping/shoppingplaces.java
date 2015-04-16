package com.example.amil.my_shopping;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.amil.my_shopping.R.id.zone_listw;


public class shoppingplaces extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingplaces);

        ListView  lv = (ListView) findViewById(R.id.zone_listw);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
if(position==0){
    Intent i = new Intent(getApplicationContext(),shopping_brand.class);
    startActivity(i);
}
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shoppingplaces, menu);

        String[] foodcity_name = { "CARGILLS FOOD CITY","KELLS SUPER","LAK SHATHOSA" };

       ArrayAdapter arrayAdapter;

      ListView  listView = (ListView) findViewById(R.id.zone_listw);

        arrayAdapter = new ArrayAdapter(this,R.layout.set_foodcitylist, R.id.tvName, foodcity_name);

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
