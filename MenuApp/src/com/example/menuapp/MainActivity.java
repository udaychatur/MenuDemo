package com.example.menuapp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

@SuppressLint("ShowToast")



public class MainActivity extends Activity {
	RelativeLayout obj;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		obj=(RelativeLayout)findViewById(R.id.rel);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
	
		
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId())
		{
		case R.id.action_settings : 
			Toast.makeText(MainActivity.this, "Setting",Toast.LENGTH_SHORT ).show();
			
			return true;
		case R.id.action_home: 
			Toast.makeText(MainActivity.this, "Home",Toast.LENGTH_LONG).show();
			return true;
		case R.id.action_red : 
			Toast.makeText(MainActivity.this, "Red",Toast.LENGTH_LONG ).show();
			obj.setBackgroundColor(Color.parseColor("#CC0000"));
			return true;
		case R.id.action_green : 
			Toast.makeText(MainActivity.this, "Green",Toast.LENGTH_LONG ).show();
			obj.setBackgroundColor(Color.parseColor("#99CC00"));
			return true;
		case R.id.action_blue : 
			Toast.makeText(MainActivity.this, "Blue",Toast.LENGTH_LONG ).show();
			obj.setBackgroundColor(Color.parseColor("#0099CC"));
			return true;
		default:
			Toast.makeText(MainActivity.this, "Caution",Toast.LENGTH_LONG ).show();
			return true;
		}
		
		
	}
}
