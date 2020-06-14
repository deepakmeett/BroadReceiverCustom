package com.example.broadreceivercustom;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class ExampleBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.example.EXAMPLE_ACTION".equals( intent.getAction() )){
            String receivedText = intent.getStringExtra( "com.example.EXTRA_TEXT" );
            Toast.makeText( context, receivedText, Toast.LENGTH_SHORT ).show();
        }
    }
}
