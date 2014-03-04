package com.greenman_journey.basiccontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This class will demonstrate the three basic controls of android (TextView, EditText,Button) and also
 * gives a example of taking input from user and displays to user.Also gives an
 * example of using Toast messages.
 * 
 */
public class BasicControlsActivity extends Activity {

	/* Local paramas */

	private TextView textView = null;
	private EditText editText = null;
	private Button button = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_controls);

		/* initialize the local variables. */
		textView = (TextView) findViewById(R.id.textView);
		editText = (EditText) findViewById(R.id.editText);
		button = (Button) findViewById(R.id.button);

		/* Set a click listenter to button to listen the user clicks */
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				/* get the text from edit text. */
				String userInput = editText.getText().toString().trim();
				/* check if user has given input or not. */
				if (userInput != null && userInput.length() > 0) {
					/* Input is available display to user. */

					textView.setText("You entered : " + userInput);
					editText.setText("");

				} else {
					/*
					 * Display an alert to user for giving inputs. We will use
					 * toast to give alerts to user
					 */

					Toast.makeText(BasicControlsActivity.this,"Please give some inputs", Toast.LENGTH_LONG).show();

				}

			}
		});

	}

}
