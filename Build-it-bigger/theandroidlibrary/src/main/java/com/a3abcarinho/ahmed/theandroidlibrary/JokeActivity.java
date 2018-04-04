package com.a3abcarinho.ahmed.theandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ahmed on 26/11/17.
 */

public class JokeActivity extends AppCompatActivity {
    @Override protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokeactivity);
        TextView joker = (TextView) findViewById(R.id.joke);

        joker.setText(getIntent().getStringExtra("joke"));
        

    }
}
