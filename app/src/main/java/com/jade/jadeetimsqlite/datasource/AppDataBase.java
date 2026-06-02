package com.jade.jadeetimsqlite.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.jade.jadeetimsqlite.api.AppUtil;
import com.jade.jadeetimsqlite.datamodel.ClienteDataModel;
import com.jade.jadeetimsqlite.datamodel.UsuarioDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String NAME = "etim.sqlite";
    public static int version = 1;

    SQLiteDatabase db;
    public AppDataBase(Context context) {
        super(context, NAME, null, version);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(AppUtil.TAG, "Criando a tabela " + ClienteDataModel.TABELA);
        db.execSQL(ClienteDataModel.criarTabela());
        Log.i(AppUtil.TAG, "Criando a tabela " + UsuarioDataModel.TABELA);
        db.execSQL(UsuarioDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}