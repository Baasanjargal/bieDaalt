package com.example.cs10d044;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Soup extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Soup");
        ListAdapter adapter = createAdapter();
        setListAdapter(adapter);
    }

	private ListAdapter createAdapter() {
		String[] layoutList = new String[] {
				"Horcha","Tacturitan","Shurpa"
		};
		
		ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, layoutList);
		
		return adapter;
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch(position) {
			case 0: startActivity(new Intent(this, Horcha.class)); break;
			case 1: startActivity(new Intent(this, Tacturitan.class)); break;
			case 2: startActivity(new Intent(this, Shurpa.class)); break;
		}
	}
}