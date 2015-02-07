package activity.lifecycle.android.vogella.com.intenttestapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String input = extras.getString("input1");
        TextView result = (TextView) findViewById(R.id.displayintentextra);
        result.setText(input);
    }

    @Override
    public void finish() {

        // TODO 1 create new Intent
        // Intent intent = new Intent();
        Intent i = new Intent();

        // TODO 2 read the data of the EditText field
        // with the id returnValue
        EditText et = (EditText) findViewById(R.id.returnValue);

        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();
        String extra = et.getText().toString();
        i.putExtra("returnkey",extra);

        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application
        setResult(RESULT_OK, i);

        super.finish();
    }
}