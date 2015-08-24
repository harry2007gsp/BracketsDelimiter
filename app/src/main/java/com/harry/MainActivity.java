package com.harry;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView text;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        edit = (EditText) findViewById(R.id.edit);
    }

    public void click(View view) {
        String input = edit.getText().toString();
        BracketChecker bracketChecker = new BracketChecker(input);
        bracketChecker.check1();
    }


}
