package com.hfad.msnger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceiveMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        this.setTitle("my title");

        Intent intent = getIntent();
        String subj = intent.getStringExtra(Intent.EXTRA_SUBJECT);
        String body = intent.getStringExtra(Intent.EXTRA_TEXT);



        TextView msgField = findViewById(R.id.ShowMessage);
        msgField.setText(subj + ": \n" + body );

    }
}
