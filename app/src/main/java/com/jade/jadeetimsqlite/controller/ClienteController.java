package com.jade.jadeetimsqlite.controller;

import android.content.ContentValues;
import android.content.Context;

import com.jade.jadeetimsqlite.datamodel.ClienteDataModel;
import com.jade.jadeetimsqlite.datasource.AppDataBase;
import com.jade.jadeetimsqlite.model.Cliente;

public class ClienteController extends AppDataBase implements iCRUD<Cliente> {
    
    ContentValues dados;
    public ClienteController(Context context) {
        super(context);
    }
    
    public boolean inserir(Cliente obj){
        dados = new ContentValues();
        dados.put(ClienteDataModel.NOME,obj.getNome());
        dados.put(ClienteDataModel.EMAIL,obj.getEmail());
        
        String tabela = ClienteDataModel.TABELA;
        return inserir(tabela, dados);
    }

    private boolean inserir(String tabela, ContentValues dados) {
        return false;
    }

    @Override
    public boolean incluir(Cliente obj) {
        return false;
    }

    @Override
    public boolean alterar(Cliente obj) {
        return false;
    }

    @Override
    public boolean deletar(Cliente obj) {
        return false;
    }

    @Override
    public void listar(Cliente obj) {

    }
}
