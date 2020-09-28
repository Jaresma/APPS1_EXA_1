package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno , contador ,cont = 0; // para controlar turnos y quien gana
    String letra;

    //Creo mi text view donde aparecera el ganador
    TextView txtViewResult;
    //Creo los botones
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        //Referencio los widgets
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        txtViewResult = findViewById(R.id.txtViewResult);



        //para que el onclick escuche al boton
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        //para controlar el dinamica del jugador
        contador++;
        turno = contador % 2;

        //jugador 1
        if(turno == 1){
            imprimirXO('X',v);
        }

        //Jugador 2
        else{
            imprimirXO('O',v);
        }


    }//Termian Onclick

    public void imprimirXO(char letra , View v){
        //indica que hara cuando demos click en reiniciar
        if(v.getId() == R.id.btn10){
            //se reinician los botones
            txtViewResult.setText("RESULT");

            btn1.setEnabled(true);
            btn1.setText("-");

            btn2.setEnabled(true);
            btn2.setText("-");

            btn3.setEnabled(true);
            btn3.setText("-");

            btn4.setEnabled(true);
            btn4.setText("-");

            btn5.setEnabled(true);
            btn5.setText("-");

            btn6.setEnabled(true);
            btn6.setText("-");

            btn7.setEnabled(true);
            btn7.setText("-");

            btn8.setEnabled(true);
            btn8.setText("-");

            btn9.setEnabled(true);
            btn9.setText("-");
            //reinicia contador de turno
            cont = 0;

        }
        //determina en que voton ira que la letra
        if(v.getId()==R.id.btn1){
            btn1.setText(letra+"");
            btn1.setEnabled(false);
        }
        else if(v.getId()==R.id.btn2){
            btn2.setText(letra+"");
            btn2.setEnabled(false);
        }
        else if(v.getId()==R.id.btn3){
            btn3.setText(letra+"");
            btn3.setEnabled(false);
        }
        else if(v.getId()==R.id.btn4){
            btn4.setText(letra+"");
            btn4.setEnabled(false);
        }
        else if(v.getId()==R.id.btn5){
            btn5.setText(letra+"");
            btn5.setEnabled(false);
        }
        else if(v.getId()==R.id.btn6){
            btn6.setText(letra+"");
            btn6.setEnabled(false);
        }
        else if(v.getId()==R.id.btn7){
            btn7.setText(letra+"");
            btn7.setEnabled(false);
        }
        else if(v.getId()==R.id.btn8){
            btn8.setText(letra+"");
            btn8.setEnabled(false);
        }
        else if(v.getId()==R.id.btn9){
            btn9.setText(letra+"");
            btn9.setEnabled(false);
        }

        ganador(letra);

    }//fin de la funcion IMPRIMIRxO
    public void ganador (char letra ){
        if(btn1.getText().toString().equals(letra+"") && (btn2.getText().toString().equals(letra+"") ) && (btn3.getText().toString().equals(letra+""))){
            txtViewResult.setText("Ganador: " + letra);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);


        }
        else if(btn4.getText().toString().equals(letra+"") && (btn5.getText().toString().equals(letra+"") ) && (btn6.getText().toString().equals(letra+""))){
            txtViewResult.setText("Ganador: " + letra);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        }
        else if(btn7.getText().toString().equals(letra+"") && (btn8.getText().toString().equals(letra+"") ) && (btn9.getText().toString().equals(letra+""))){
            txtViewResult.setText("Ganador: " + letra);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
        }
        else if(btn1.getText().toString().equals(letra+"") && (btn4.getText().toString().equals(letra+"") ) && (btn7.getText().toString().equals(letra+""))){
            txtViewResult.setText("Ganador: " + letra);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(btn2.getText().toString().equals(letra+"") && (btn5.getText().toString().equals(letra+"") ) && (btn8.getText().toString().equals(letra+""))){
            txtViewResult.setText("Ganador: " + letra);
            btn1.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(btn3.getText().toString().equals(letra+"") && (btn6.getText().toString().equals(letra+"") ) && (btn9.getText().toString().equals(letra+""))){
            txtViewResult.setText("Ganador: " + letra);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
        }
        else if(btn1.getText().toString().equals(letra+"") && (btn5.getText().toString().equals(letra+"") ) && (btn9.getText().toString().equals(letra+""))){
            txtViewResult.setText("Ganador: " + letra);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
        }
        else if(btn3.getText().toString().equals(letra+"") && (btn5.getText().toString().equals(letra+"") ) && (btn7.getText().toString().equals(letra+""))){
            txtViewResult.setText("Ganador: " + letra);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(cont<9){
            cont++;

        }else{
            new AlertDialog.Builder(this)
                    .setTitle("RESULT")
                    .setMessage("SIN GANADOR")
                    .setCancelable(false)
                    .setPositiveButton("ok", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog , int witch) {

                        }
                    }).show();

        }


    }//fin ganador
}
