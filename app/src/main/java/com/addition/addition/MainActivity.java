package com.addition.addition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button addition = (Button)findViewById(R.id.addButton);
        final EditText ed1 = (EditText)findViewById(R.id.edt1);
        final EditText ed2 = (EditText)findViewById(R.id.edt2);
        ed1.setText("0");
        ed2.setText("0");

		addition.setOnClickListener(new View.OnClickListener() {
        	@Override
			public void onClick(View v) {
			Locale locale  = new Locale("en", "UK");
			String pattern = "###.##";
			DecimalFormat decimalFormat = (DecimalFormat)
			NumberFormat.getNumberInstance(locale);
			decimalFormat.applyPattern(pattern);

			TextView tv = (TextView)findViewById(R.id.tv1);
			double n1 = Double.parseDouble(ed1.getText().toString());
			double n2 = Double.parseDouble(ed2.getText().toString());
			if ((ed1.length() > 0 ) | (ed2.length() > 0) ){
			tv.setText(String.valueOf(decimalFormat.format(n1+n2)));
			ed1.setText("0");
            ed2.setText("0");

			}
			}
		});
	}
}
