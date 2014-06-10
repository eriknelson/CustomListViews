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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomListAdapter extends BaseAdapter {

	private Context mContext;
	private List<CustomListViewItem> mBackingItems;
	
	public CustomListAdapter(Context context, List<CustomListViewItem> backingItems){
		mContext = context;
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
		return mBackingItems.get(position).getView(
				convertView,
				(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
        );
	}
	
	@Override
	public int getViewTypeCount(){
		return CustomListViewItem.getViewTypeCount();
	}
	
	@Override
	public int getItemViewType(int position){
		return mBackingItems.get(position).getViewTypeId();
	}

}
