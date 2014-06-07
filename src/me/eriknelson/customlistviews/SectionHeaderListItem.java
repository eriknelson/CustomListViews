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

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class SectionHeaderListItem extends CustomListViewItem {
	
	String mHeaderText = "";
	
	SectionHeaderListItem(String headerText){
		mHeaderText = headerText;
	}
	
	@Override
	protected int getLayout(){
		return R.layout.section_header;
	}

	@Override
	public View getView(View convertView, LayoutInflater inflater){
		View returnView = super.getView(convertView, inflater);
		
		TextView sectionHeaderView = (TextView)returnView.findViewById(R.id.section_header_text);
		sectionHeaderView.setText(mHeaderText);
		
		return returnView;
	}
}
