package com.darksurvival.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("DARK Survival Running...");
        text.setTextSize(24);
        text.setGravity(android.view.Gravity.CENTER);

        setContentView(text);
    }
}
