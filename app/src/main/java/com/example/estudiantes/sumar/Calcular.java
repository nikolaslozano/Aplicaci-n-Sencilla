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
    int pr(){
        EditText primero=(EditText) findViewById(R.id.primerNumero);
        int pr=Integer.parseInt(primero.getText().toString());
        return pr;
    }
    int se(){
        EditText segundo=(EditText) findViewById(R.id.segundoNumero);
        int se=Integer.parseInt(segundo.getText().toString());
        return se;
    }
    TextView r(){
        TextView resultado=(TextView) findViewById(R.id.resultado);
        return resultado;
    }


    public void sumar(View vista){
        r().setText(Integer.toString(pr() + se()));

    }

    public void restar(View vista){
        r().setText(Integer.toString(pr() - se()));
    }

    public void convertir(View vista){
        r().setText(Double.toString((pr()*1.8)+32)+"°F");
    }
}
