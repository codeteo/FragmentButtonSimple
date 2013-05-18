package com.example.fragmentbuttonsimple;

import com.example.fragmentbuttonsimple.simpleTransactions.Three_Buttons_Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity   {

	private static final String TAG = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		final Button button = (Button) findViewById(R.id.button_id);
	     button.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	        	 Intent myIntent = new Intent(MainActivity.this, Three_Buttons_Activity.class);
	        	 //myIntent.putExtra("key", value); //Optional parameters
	        	 startActivity(myIntent);
	         }
	     });
	
	}



}
