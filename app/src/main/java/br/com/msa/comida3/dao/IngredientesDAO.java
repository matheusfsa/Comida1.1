package br.com.msa.comida3.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Familia SA on 02/11/2016.
 */
public class IngredientesDAO extends SQLiteOpenHelper {
    public IngredientesDAO(Context context) {
        super(context,"Igredientes", null, 1);
    }

    @Override

    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Receita (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, itens ARRAY, receita TEXT);";
        db.execSQL(sql);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
