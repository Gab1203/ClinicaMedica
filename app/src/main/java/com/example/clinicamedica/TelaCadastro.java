package com.example.clinicamedica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;

import androidx.activity.EdgeToEdge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import java.util.ArrayList;
import java.util.Objects;



public class TelaCadastro extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }


public void cadastrarUser(View view){


    EditText  nomeCad = findViewById(R.id.txtInNomeCad);
    EditText  dataCad =  findViewById(R.id.txtInDataCad);
    EditText loginCad = findViewById(R.id.txtInLoginCad);
    EditText senhaCad =  findViewById(R.id.txtInSenhaCad);
    EditText  senhaConfCad =  findViewById(R.id.txtInSenhaConfCad);


int i;
    String nome = nomeCad.getText().toString();
    String data = dataCad.getText().toString();
    String login = loginCad.getText().toString();
    String senha = senhaCad.getText().toString();
    String senhaConf = senhaConfCad.getText().toString();

    if(senhaConf.equals(senha)) {
User user =   new User(nome, data, login, senha);
        for (i = 0; i < user.users.size(); i++) {
            if (!Objects.equals(login, user.users.get(i).getLogin_user())) {

           user.addArray();


            }

        }

        Intent in = new Intent(TelaCadastro.this, TelaLogin.class);
        startActivity(in);



    }
}



}