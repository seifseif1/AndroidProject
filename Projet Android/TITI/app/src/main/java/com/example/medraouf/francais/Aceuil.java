package com.example.medraouf.francais;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Aceuil extends Activity {
    ImageButton b1 , b2 ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceil);
        b1 =(ImageButton)findViewById(R.id.maison);
        b2=(ImageButton)findViewById(R.id.ferme);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent i = new Intent(Aceuil.this,maison.class);
                startActivity(i);

            }});
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent i = new Intent(Aceuil.this,ferme.class);
                startActivity(i);

            }});














            }
}
