package com.example.broadreceivercustom;
import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    ExampleBroadcastReceiver receiver = new ExampleBroadcastReceiver();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        textView = findViewById( R.id.text );

        IntentFilter filter = new IntentFilter( "com.example.EXAMPLE_ACTION" );
        registerReceiver( receiver, filter );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver( receiver );
    }
}
