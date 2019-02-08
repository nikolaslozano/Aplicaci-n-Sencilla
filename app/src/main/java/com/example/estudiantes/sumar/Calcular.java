package com.example.estudiantes.sumar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calcular extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

    }



    public void sumar(View vista){
        EditText primero=(EditText) findViewById(R.id.primerNumero);
        EditText segundo=(EditText) findViewById(R.id.segundoNumero);
        TextView resultado=(TextView) findViewById(R.id.resultado);
        int pr=Integer.parseInt(primero.getText().toString());
        int se=Integer.parseInt(segundo.getText().toString());
        resultado.setText(Integer.toString(pr + se));

    }

    public void restar(View vista){
        EditText primero=(EditText) findViewById(R.id.primerNumero);
        EditText segundo=(EditText) findViewById(R.id.segundoNumero);
        TextView resultado=(TextView) findViewById(R.id.resultado);
        int pr=Integer.parseInt(primero.getText().toString());
        int se=Integer.parseInt(segundo.getText().toString());
       resultado.setText(Integer.toString(pr-se));
    }

    public void convertir(View vista){
        EditText primero=(EditText) findViewById(R.id.primerNumero);
        TextView resultado=(TextView) findViewById(R.id.resultado);
        int pr=Integer.parseInt(primero.getText().toString());
        resultado.setText(Double.toString((pr*1.8)+32)+"°F");
    }
}
