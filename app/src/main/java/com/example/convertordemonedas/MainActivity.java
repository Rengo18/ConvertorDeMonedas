package com.example.convertordemonedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText dolar;
    private EditText euro;
    private Button convertir;
    private RadioButton dolarAeuro;
    private RadioButton euroAdolar;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dolar = findViewById(R.id.tvdolar);
        euro = findViewById(R.id.tveuro);
        dolarAeuro = findViewById(R.id.rbDolarAEuro);
        euroAdolar = findViewById(R.id.rbEuroADolar);
        convertir = findViewById(R.id.btnConvertir);
        resultado = findViewById(R.id.tvResultado);
        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!dolar.getText().toString().isEmpty()){
                    if(dolarAeuro.isChecked()){
                        int valorDolar = Integer.parseInt(dolar.getText().toString());
                        double result = valorDolar*0.91;
                        resultado.setText((int) result+" €");
                    }else{

                        resultado.setText("Error seleccione la opcion de 'dolar a euro' ");
                    }
                }else if(!euro.getText().toString().isEmpty()){
                    if(euroAdolar.isChecked()){
                        int valorEuro = Integer.parseInt(euro.getText().toString());
                        double result = valorEuro*1.09;
                        resultado.setText((int)result + " $");
                    }else{
                        resultado.setText("Error seleccione la opcion de 'Euro a dolar' ");
                    }
                }else{
                    resultado.setText("ingrese un valor en Dolar o Euro para convertir");
                }
            }
        });
    }




}
