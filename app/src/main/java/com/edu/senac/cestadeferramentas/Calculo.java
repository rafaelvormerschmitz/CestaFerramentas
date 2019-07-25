package com.edu.senac.cestadeferramentas;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculo extends AppCompatActivity {

    EditText editpeso, editaltura, IMC;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void calculo(View v) {
        editpeso = findViewById(R.id.editpeso);
        editaltura = findViewById(R.id.editaltura);

        String peso = editpeso.getText().toString();
        Float pesoo = Float.parseFloat(peso);

        String altura = editaltura.getText().toString();
        Float alturaa = Float.parseFloat(altura);

        double IMC = pesoo / (alturaa * alturaa);

        Resultado = (TextView) findViewById(R.id.Resultado);

        editpeso.getText().clear();
        editaltura.getText().clear();

        if (IMC < 18.5) {
            Resultado.setText("Resultado: Abaixo do Peso " + IMC);
        } else if (IMC > 24.9 && IMC < 30) {
            Resultado.setText("Resultado: Acima do Peso " + IMC);
        } else {
            Resultado.setText("Resultado: Peso OK ");
        }
    }


}
