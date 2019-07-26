package com.edu.senac.cestadeferramentas;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
public void calculo(View v){
    Intent i=new Intent(this,Calculo.class);
    startActivity(i);
}
public void conversao(View v){
    Intent i=new Intent(this,conversao.class);
    startActivity(i);
}
    public void sobre(View v){
        Intent i=new Intent(this,sobre.class);
        startActivity(i);
    }
}
