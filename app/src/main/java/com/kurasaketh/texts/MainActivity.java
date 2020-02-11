package com.kurasaketh.texts;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText namebox;
    TextView nametext;
    TextView colorlist;
    int x = 0;
    String[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namebox = findViewById(R.id.entername);
        nametext  = findViewById(R.id.textnames);
        colorlist = findViewById(R.id.colorlist);
        colors = getResources().getStringArray(R.array.colors);
    }
    public void firstpressed(View v){
        nametext.setText(namebox.getText().toString());
    }
    public void secondpressed(View v) {
        colorlist.setText(colors[x]);
        if(colors[x].equals("Red")) {
            v.setBackgroundColor(Color.RED);
        }
        if(colors[x].equals("Yellow")){
            v.setBackgroundColor(Color.YELLOW);
        }
        if(colors[x].equals("Green")){
            v.setBackgroundColor(Color.GREEN);
        }
        if(colors[x].equals("Blue")){
            v.setBackgroundColor(Color.BLUE);
        }
        if(colors[x].equals("Magenta")){
            v.setBackgroundColor(Color.MAGENTA);
        }
        x = (x+1)%colors.length;
    }
}
