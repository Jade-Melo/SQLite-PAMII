package com.jade.jadeetimsqlite.datamodel;

public class ClienteDataModel {
    public static final String TABELA = "cliente";
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";
    public static String queryCriarTabela = "";

    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE IF NOT EXISTS " + TABELA + "(";
        queryCriarTabela += ID + "INTEGER PRIMARY KEY AUTOINCREMENT";
        queryCriarTabela += NOME + "TEXT";
        queryCriarTabela += EMAIL + "TEXT";
        queryCriarTabela += ")";

        return queryCriarTabela;
    }
}