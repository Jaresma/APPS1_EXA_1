package com.example.esfera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtVA;
    SeekBar sBA;
    Button btnCalcular;
    EditText editText;

    public float angulo ,result ,radio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Referenciar widgets
        txtVA = findViewById(R.id.txtVA);
        sBA = findViewById(R.id.sBA);
        btnCalcular = findViewById(R.id.btnCalcular);
        editText = findViewById(R.id.editText);


        //definimos rangos del seekbar
        sBA.setProgress(0);
        sBA.setMax(360);


        //creamos el lisener del seek bar

        sBA.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtVA.setText(progress+"");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //DARLE FUNCION AL BOTON POR CLASE ANONIMA

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                //recuperamos lo valores y hacemos la operaciones que nos mostrara el toust
                angulo = sBA.getProgress();
                radio = Float.parseFloat(editText.getText().toString());

                result = (angulo*radio*3)*(0.66666f);

                Toast.makeText(getApplicationContext(),"Resultado: "+result +"",Toast.LENGTH_LONG).show();

            }});




    }

}
