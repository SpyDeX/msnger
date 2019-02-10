package com.hfad.msnger;

import android.app.Activity;
import android.content.Intent;
import android.drm.DrmStore;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Вызвать onSendMessage() при щелчке на кнопке
    public void onSendMessage(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");

        //Intent intent = new Intent(this, ReceiveMessageActivity.class);

        EditText edText = findViewById(R.id.message);
        EditText edSubj = findViewById(R.id.subject);

        intent.putExtra(Intent.EXTRA_SUBJECT, edSubj.getText().toString() );
        intent.putExtra(Intent.EXTRA_TEXT, edText.getText().toString() );

        //receiver = intent.resolveActivity(getPackageManager());
        intent = Intent.createChooser( intent, getString(R.string.intent_send_title) );
        startActivity(intent);
    }
}
