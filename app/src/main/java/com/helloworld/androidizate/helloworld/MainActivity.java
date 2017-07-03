package com.helloworld.androidizate.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnTest);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView txt = (TextView) findViewById(R.id.txtLabel);
                txt.setText("HOLA");
            }
        });
    }
}
