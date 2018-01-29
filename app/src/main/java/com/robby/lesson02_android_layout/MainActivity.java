package com.robby.lesson02_android_layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
    }

    public void btnClickAction(View view) {
        if (TextUtils.isEmpty(txtName.getText().toString())) {
            Log.d("OUTPUT MESSAGE", "Empty name");
        } else {
            Log.d("OUTPUT MESSAGE", "Hello " + txtName.getText().toString());
        }
    }
}
