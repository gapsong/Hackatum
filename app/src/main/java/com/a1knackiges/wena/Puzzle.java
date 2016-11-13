package com.a1knackiges.wena;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by gap on 13.11.16.
 */

public class Puzzle extends Activity {
    Button scanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puzzle);
        scanButton = (Button) findViewById(R.id.button);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SimpleScannerActivity.class);
                startActivityForResult(intent, 1);
            }
        });

    }
}
