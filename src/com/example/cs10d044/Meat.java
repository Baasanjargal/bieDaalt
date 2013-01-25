package com.example.cs10d044;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Meat extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Meat");
        ListAdapter adapter = createAdapter();
        setListAdapter(adapter);
    }

	private ListAdapter createAdapter() {
		String[] layoutList = new String[] {
				"Steak","Szechuan","Kimchijige"
		};
		
		ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, layoutList);
		
		return adapter;
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch(position) {
			case 0: startActivity(new Intent(this, Steak.class)); break;
			case 1: startActivity(new Intent(this, Szechuan.class)); break;
			case 2: startActivity(new Intent(this, Kimchijige.class)); break;
		}
	}
}