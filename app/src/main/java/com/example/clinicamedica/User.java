package com.example.clinicamedica;
import java.util.ArrayList;
public class User {

    private String nome_user;
    private String data_nascimento_user;
    private String login_user;
    private String senha_user;

    public ArrayList<User> users;


    public User(String nome_user, String data_nascimento_user, String login_user, String senha_user) {
        this.nome_user = nome_user;
        this.data_nascimento_user = data_nascimento_user;
        this.login_user = login_user;
        this.senha_user = senha_user;
    }



    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getData_nascimento_user() {
        return data_nascimento_user;
    }

    public void setData_nascimento_user(String data_nascimento_user) {
        this.data_nascimento_user = data_nascimento_user;
    }

    public String getLogin_user() {
        return login_user;
    }

    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }

    public String getSenha_user() {

        return senha_user;
    }

    public void setSenha_user(String senha_user) {

        this.senha_user = senha_user;
    }
    public void addArray(){

        this.users.add(new User(this.nome_user,this.data_nascimento_user,this.login_user, this.senha_user));


    }

    public ArrayList<User> returnArray(){


        return this.users;
    }






}
