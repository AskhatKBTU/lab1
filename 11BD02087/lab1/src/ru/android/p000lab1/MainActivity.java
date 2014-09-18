package ru.android.p000lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button btnActTwo;
	EditText et1;
	String s;
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	
	btnActTwo = (Button)findViewById(R.id.btnActTwo);
	et1 = (EditText)findViewById(R.id.editText1);
	
	
	OnClickListener oclBtnCancel = new OnClickListener(){
	public void onClick(View v) {
	    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
	    
	    intent.putExtra("str", et1.getText().toString());
	    startActivity(intent);
}
	 	
	};
	
	 btnActTwo.setOnClickListener(oclBtnCancel);
	}
}
