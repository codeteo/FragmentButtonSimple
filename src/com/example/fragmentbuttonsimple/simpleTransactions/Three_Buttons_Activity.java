package com.example.fragmentbuttonsimple.simpleTransactions;

import com.example.fragmentbuttonsimple.R;
import com.example.fragmentbuttonsimple.simpleTransactions.Fragment_A.CallbackInterface;
import com.example.fragmentbuttonsimple.simpleTransactions.Fragment_B.CallbackInterface2;
import com.example.fragmentbuttonsimple.simpleTransactions.Fragment_C.CallbackInterface3;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Three_Buttons_Activity extends FragmentActivity  implements CallbackInterface,CallbackInterface2, CallbackInterface3  {

	private static final String TAG = "passNumberTAG";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three_buttons);

		
		final Button button = (Button) findViewById(R.id.button_frag_1);
	     button.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	        	 
	        	 Fragment_A Frag_A = new Fragment_A();
	        	 
	        	 FragmentManager fm1 = getSupportFragmentManager();
	             FragmentTransaction transaction = fm1.beginTransaction();
	             
	             transaction.replace(R.id.fragment_container_1, Frag_A);
	             transaction.commit();
	             
	         }
	     });

		final Button button2 = (Button) findViewById(R.id.button_frag_2);
		button2.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		        	 
		       	 Fragment_B Frag_B = new Fragment_B();
		        	 
		       	 FragmentManager fm1 = getSupportFragmentManager();
		         FragmentTransaction transaction = fm1.beginTransaction();
		             
		         transaction.replace(R.id.fragment_container_2, Frag_B);
		         transaction.commit();
		             
		     }
		});	     
	     
		
		final Button button3 = (Button) findViewById(R.id.button_frag_3);
		button3.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		        	 
		       	 Fragment_C Frag_C = new Fragment_C();
		        	 
		       	 FragmentManager fm1 = getSupportFragmentManager();
		         FragmentTransaction transaction = fm1.beginTransaction();
		             
		         transaction.replace(R.id.fragment_container_3, Frag_C);
		         transaction.commit();
		             
		     }
		});	   		
	     
	
	}

	@Override
	public void onSomethingSelected(int position) {
		Log.d(TAG, "Give me the result  " + position  );
		position = position +1;
		Log.d(TAG, "Give me the result  " + position  );
		
	}

}
