/*
 * Copyright (C) 2012 Lucas Rocha
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vinit.horizantallistviewexample.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SimpleListAdapter extends BaseAdapter {
	private final Context mContext;

	public SimpleListAdapter(Context context) {
		mContext = context;
	}

	@Override
	public int getCount() {
	    return 100;
	}

	@Override
	public Integer getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	    ViewHolder holder = null;
        View view;
        TextView title;
		if (convertView == null) {
			view = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

//			holder = new ViewHolder();
//            holder.title = (TextView) convertView.findViewById(R.id.title);
//            holder.title1 = (TextView) convertView.findViewById(R.id.title1);
//
//			convertView.setTag(holder);
		} else {
//            convertView.get
//		    holder = (ViewHolder) convertView.getTag();
            view = convertView;
		}

//        holder.title.setText("Item: " + position);
//        holder.title1.setText("New Item: " + position);
//        title = (TextView) view;
//
//        title.setText("" + position);

		return view;
	}

	class ViewHolder {
        public TextView title;
        public TextView title1;
	}
}
