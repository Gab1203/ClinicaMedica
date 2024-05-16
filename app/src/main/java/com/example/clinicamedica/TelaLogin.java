package com.example.clinicamedica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Objects;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }




    public void trocaTela(View view){


        Intent in = new Intent(TelaLogin.this, TelaCadastro.class);
        startActivity(in);



    }

    public void entrar(View view){
        EditText login_user = findViewById(R.id.inTxtLogin);
        EditText senha_user = findViewById(R.id.inTxtPassword);
        String login = login_user.getText().toString();
        String senha = senha_user.getText().toString();

        TelaCadastro cad = new TelaCadastro();
TelaLogin user = new TelaLogin(cad);

int i = 0;
Boolean isCorrect;


do {

    isCorrect = login.equals(users.get(i).getLogin_user()) && senha.equals(users.get(i).getSenha_user());
    i++;


}while(i < users.size());


if(isCorrect.booleanValue()) {
    Intent in = new Intent(TelaLogin.this, MainActivity.class);
    startActivity(in);
}
    }



}