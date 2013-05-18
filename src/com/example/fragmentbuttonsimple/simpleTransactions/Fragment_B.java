package com.example.fragmentbuttonsimple.simpleTransactions;


import com.example.fragmentbuttonsimple.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_B extends Fragment {
	  
	protected static final String TAG = "FRAGMENT_B";
	private CallbackInterface2 listener;

	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //View detailsFrame = getActivity().findViewById(R.id. );
    	
        View view = inflater.inflate(R.layout.fragment_b_layout, container, false);

        return view;			//returns view
    }
    
    
    // ********** declare INTERFACE ***************** //
    
    public interface CallbackInterface2 {			
    		public void onSomethingSelected(int position);
      }        

    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        
        // This makes sure that the container activity has implemented the callback interface. If not, it throws an exception
        try {
            listener = (CallbackInterface2) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement CallbackInterface");
        }
    }
    
    
}