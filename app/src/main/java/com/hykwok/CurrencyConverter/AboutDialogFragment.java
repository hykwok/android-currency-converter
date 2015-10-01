/*
	Copyright 2010 - 2015 Kwok Ho Yin

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

package com.hykwok.CurrencyConverter;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AboutDialogFragment extends DialogFragment implements OnClickListener {
	// about messages
	private static final String str_about[] = {
			"<b>Currency Converter</b>",
			"Copyright 2010 - 2015 Kwok Ho Yin",
			"Licensed under the Apache License, Version 2.0",
			"",
			"Credits:",
			"National flag image source:",
			"Sodipodi Flag collection. Available at sourceforge.net/projects/sodipodi/files/sodipodi-clipart/flags-1.6/",
			"Application icon source:",
			"IconEden Free Icons. Available at http://www.iconeden.com/",
			"",
			"History:",
			"0.5    Change min. required platform from 2.2 to 4.0.3, add a menu button",
			"0.4    Fix some bugs",
			"0.3	Fix preference display bug, Remove 'Estonian kroon' and add 'Israeli shekel'",
			"0.2	Fix editbox clears output value automatically if enter key is pressed",
			"0.1	Initial release"
	};	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		// do not need title
		this.setStyle(STYLE_NO_TITLE, 0);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// use about_dialog layout
		View v = inflater.inflate(R.layout.about_dialog, container, false);
		
		TextView about_text = (TextView) v.findViewById(R.id.About_Dialog_Text);
		
		// show about message
    	String html_about = "";
    	for(int i=0; i<str_about.length; i++) {
    		html_about = html_about + str_about[i] + "<br />";
    	}
    	
    	about_text.setText(android.text.Html.fromHtml(html_about));
    	
    	Button about_close_btn = (Button) v.findViewById(R.id.About_Dialog_CloseButton);
    	
    	// create OK button
    	about_close_btn.setOnClickListener(this);
    	
    	return v;
	}

	public void onClick(View v) {
		// close button
		this.dismiss();
	}

}
