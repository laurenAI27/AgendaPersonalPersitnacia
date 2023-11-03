package com.example.agendapersonalpersitnacia;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

//Se crea la clase para llamar a la base de datos
//Esta extiende de la clase SQLiteOpenHelper para acceder a la base de datos de SQLite
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper{
    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


//Al dar error por heredar de la clase SQLiteOpenHelper se tiene que implementar dos métodos.
    //Este método para tener el OnCreate de la base de datos de SQLite
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table contactos(id int primary key, nombre text, movil text, email text)");
    }

    //Este para ver la versión de la base de datos con la que se va a trabajar
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
