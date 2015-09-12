package org.xo.staticclient;

import android.app.Activity;
import android.os.Bundle;
import org.xo.androidlibrary.SharedClass;

import org.xo.staticclient.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        useLibrary();
    }

    private void useLibrary() {
        SharedClass sc = new SharedClass();
        sc.foo();
    }
}
