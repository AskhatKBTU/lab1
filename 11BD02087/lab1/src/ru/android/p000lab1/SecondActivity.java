package ru.android.p000lab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {
	
	TextView textV;
	
	
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.second);
	    textV = (TextView)findViewById(R.id.textView1);
	    String x =getIntent().getStringExtra("str");
	    textV.setText(x);
     }
}