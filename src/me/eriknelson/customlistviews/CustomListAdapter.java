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

import java.util.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomListAdapter extends BaseAdapter {

	private List<CustomListViewItem> mBackingItems;
	
	public CustomListAdapter(List<CustomListViewItem> backingItems){
		mBackingItems = backingItems;
	}

	@Override
	public int getCount() {
		return mBackingItems.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parentView) {
		return null;
	}

}
