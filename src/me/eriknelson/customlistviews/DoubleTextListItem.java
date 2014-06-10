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

public class DoubleTextListItem extends CustomListViewItem {
	
	String mFirstText = "";
	String mSecondText = "";
	
	DoubleTextListItem(String firstText, String secondText){
		mFirstText = firstText;
		mSecondText = secondText;
	}
	
	@Override
	protected int getLayout(){
		return R.layout.double_text;
	}
	
	@Override
	protected Object getViewHolder(View v){
		ViewHolder vh =  new ViewHolder();
		vh.firstTextView = (TextView)v.findViewById(R.id.first_text);
		vh.secondTextView = (TextView)v.findViewById(R.id.second_text);
		return vh;
	}

	@Override
	public View getView(View convertView, LayoutInflater inflater){
		View returnView = super.getView(convertView, inflater);
		
		ViewHolder vh = (ViewHolder)returnView.getTag();
		TextView firstTextView = vh.firstTextView;
		TextView secondTextView = vh.secondTextView;

		firstTextView.setText(mFirstText);
		secondTextView.setText(mSecondText);
		
		return returnView;
	}
	
	@Override
	public int getViewTypeId(){
		return 1;
	}
	
	private static class ViewHolder{
		TextView firstTextView;
		TextView secondTextView;
	}
}
