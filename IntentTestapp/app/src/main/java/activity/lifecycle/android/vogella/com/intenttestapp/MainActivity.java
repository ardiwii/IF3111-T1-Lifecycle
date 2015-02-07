package activity.lifecycle.android.vogella.com.intenttestapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    // constant to determine which sub-activity returns
    private static final int REQUEST_CODE = 10;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText text = (EditText) findViewById(R.id.inputforintent);
        // used later

        // TODO 1 create new Intent(context, class)
        // use the activity as context parameter
        // and "ResultActivity.class" for the class parameter
        String value = text.getText().toString();
        Intent i = new Intent(this,ResultActivity.class);
        i.putExtra("input1", value);

        // TODO 2 start second activity with
        // startActivity(intent);
        // startActivity(i);

        // TODO 2.. now use
        // startActivityForResult(i, REQUEST_CODE);
        startActivityForResult(i, REQUEST_CODE);
    }

    // TODO 3 Implement this method
    // assumes that "returnkey" is used as key to return the result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            if (data.hasExtra("returnkey")) {
                String result = data.getExtras().getString("returnkey");
                if (result != null && result.length() > 0) {
                    Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

}
