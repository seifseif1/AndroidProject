package com.example.medraouf.francais;

import android.app.Activity;

/**
 * Created by Med Raouf on 14/12/2016.
 */

    import android.app.Activity;
    import android.os.Bundle;
    import android.speech.tts.TextToSpeech;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import java.util.Locale;
    import android.widget.Toast;

public class maison extends Activity {
        TextToSpeech t1;
        EditText ed1;
        Button b1,b2,b3,b4,b5;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.maison);
            b1=(Button)findViewById(R.id.Button1);
            b2=(Button)findViewById(R.id.Button2);
            b3=(Button)findViewById(R.id.Button3);
            b4=(Button)findViewById(R.id.Button4);
            b5=(Button)findViewById(R.id.Button5);

            t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t1.setLanguage(Locale.FRENCH);
                    }
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = b1.getText().toString();
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = b2.getText().toString();
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = b3.getText().toString();
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = b4.getText().toString();
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toSpeak = b5.getText().toString();
                    Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            });
        }

        public void onPause(){
            if(t1 !=null){
                t1.stop();
                t1.shutdown();
            }
            super.onPause();
        }
    }

