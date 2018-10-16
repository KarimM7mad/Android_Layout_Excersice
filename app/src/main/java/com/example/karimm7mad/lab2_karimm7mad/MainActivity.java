package com.example.karimm7mad.lab2_karimm7mad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button cairoBtn,alexBtn,aswanBtn;
    public TextView txtarea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cairoBtn = findViewById(R.id.cairoBtn);
        aswanBtn = findViewById(R.id.aswanBtn);
        alexBtn = findViewById(R.id.alexBtn);
        txtarea = findViewById(R.id.midText);


        cairoBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtarea.setText("Cairo is the capital and largest city of Egypt. The city's metropolitan area is the largest in the Middle East and the Arab world, and the 15th-largest in the world, and is associated with ancient Egypt, as the famous Giza pyramid complex and the ancient city of Memphis are located in its geographical area.");
            }
        });

        aswanBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtarea.setText("Aswan is a city in the south of Egypt, the capital of the Aswan Governorate. Aswan is a busy market and tourist centre located just north of the Aswan Dams on the east bank of the Nile at the first cataract.");
            }
        });

        alexBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtarea.setText( "Alexandria is the second largest city and a major economic centre in Egypt, extending about 32 km (20 mi) along the coast of the Mediterranean Sea in the north central part of the country.");
            }
        });


    }


    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("txt",txtarea.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        txtarea.setText(savedInstanceState.getString("txt"));
    }
}
