package com.example.advantal.chatscreenui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by advantal on 2/16/2016.
 */
public class ContactUi extends Activity {
    Button btn;
    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactui);
        btn=(Button)findViewById(R.id.sendButton);
        et=(EditText)findViewById(R.id.message);
        tv=(TextView)findViewById(R.id.messageSet);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=et.getText().toString();
                if(str!=null)
                {
                    tv.setText(str);
                    et.setText("");
                }
                else
                {
                    Context context=getApplicationContext();
                    Toast.makeText(context,"Enter Some Text",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
