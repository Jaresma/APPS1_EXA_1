package com.example.acredita_noacredita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtViewA,txtViewC,txtViewR;
    SeekBar sB1,sB2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciamos nuestros widgets
        sB1 = findViewById(R.id.sB1);
        sB2 = findViewById(R.id.sB2);
        txtViewA = findViewById(R.id.txtViewA);
        txtViewR = findViewById(R.id.txtViewR);
        txtViewC = findViewById(R.id.txtViewC);

        sB1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtViewA.setText(progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(sB1.getProgress() <= sB2.getProgress()){
                    txtViewR.setText("ACREDITADO");
                }else{
                    txtViewR.setText("NO ACREDITADO");
                }

            }
        });

        sB2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtViewC.setText(progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(sB1.getProgress() <= sB2.getProgress()){
                    txtViewR.setText("ACREDITADO!!");
                }else{
                    txtViewR.setText("NO ACREDITADO!!");
                }

            }
        });





    }




}
