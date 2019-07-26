package com.edu.senac.cestadeferramentas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class conversao extends AppCompatActivity {

    TextView edtNumero,edtKB,edtMB,edtGB,edtTB,error;
    Spinner converterDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao);
        
        edtKB = findViewById(R.id.edtKB);
        edtMB = findViewById(R.id.edtMB);
        edtGB = findViewById(R.id.edtGB);
        edtTB = findViewById(R.id.edtTB);

    }

    public void converterNum(View v){
        String cnvtDe=converterDe.getSelectedItem().toString();

        if(edtNumero.getText().toString().trim().length() > 0) {
            Double edtNum = Double.parseDouble(edtNumero.getText().toString());
            if (cnvtDe.equals("KB")){
                edtKB.setText(Double.toString(edtNum));
                edtMB.setText(Double.toString(edtNum/1024));
                edtGB.setText(Double.toString(edtNum/1048576));
                edtTB.setText(Double.toString(edtNum/1073741824));
            }else if(cnvtDe.equals("MB")){
                edtKB.setText(Double.toString(edtNum*1024));
                edtMB.setText(Double.toString(edtNum));
                edtGB.setText(Double.toString(edtNum/1024));
                edtTB.setText(Double.toString(edtNum/1048576));
            }else if(cnvtDe.equals("GB")){
                edtKB.setText(Double.toString((edtNum*1048576)));
                edtMB.setText(Double.toString(edtNum*1024));
                edtGB.setText(Double.toString(edtNum));
                edtTB.setText(Double.toString(edtNum/1024));
            }else{
                edtKB.setText(Double.toString(edtNum*1073741824));
                edtMB.setText(Double.toString(edtNum*1048576));
                edtGB.setText(Double.toString(edtNum*1024));
                edtTB.setText(Double.toString(edtNum));
            }
        }else{
            edtKB.setText("0");
            edtMB.setText("0");
            edtGB.setText("0");
            edtTB.setText("0");
            error.setText("Número informado inválido ou nulo");
        }
    }
}
