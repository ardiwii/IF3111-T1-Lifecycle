package activity.lifecycle.android.vogella.com.lifecycleapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }



}