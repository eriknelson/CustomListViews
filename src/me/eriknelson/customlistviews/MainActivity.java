/*
Copyright (C) 2014 Erik Nelson

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package me.eriknelson.customlistviews;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView mListView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mListView = (ListView)findViewById(R.id.my_list_view);
		
		List<CustomListViewItem> backingItems = new ArrayList<CustomListViewItem>();
		for(int i = 0; i < 2000; i++){
			backingItems.add(new SectionHeaderListItem(
					String.format("Row %d", i)
					));
		}
		
		CustomListAdapter adapter = new CustomListAdapter(this, backingItems);
		
		mListView.setAdapter(adapter);
		
	}

}
