package com.edu.senac.cestadeferramentas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtSenha,editEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i( "CicloVidaActivity", "Passando pelo método onCreate ...");
        setContentView(R.layout.activity_main);

        edtSenha=findViewById(R.id.edtSenha);
        editEmail=findViewById(R.id.editEmail);
    }

       public void irParaPrincipal(View v) {

           String email=editEmail.getText().toString();

           if (email.equals("Rafael")){
               Toast.makeText(this,"Logado",Toast.LENGTH_SHORT).show();
               Intent i = new Intent(this,Principal.class);
               startActivity(i);
           }else{
               Toast.makeText(this, "falha ao logar", Toast.LENGTH_SHORT).show();
           }
    }

    }
