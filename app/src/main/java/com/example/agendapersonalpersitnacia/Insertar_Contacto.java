package com.example.agendapersonalpersitnacia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Insertar_Contacto extends AppCompatActivity {

    private EditText et_nombre, et_movil, et_mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar_contacto);

        getSupportActionBar().setTitle("Vuelta al Inicio de Pantalla");

        et_nombre = (EditText) findViewById(R.id.etnom);
        et_movil = (EditText) findViewById(R.id.etmovil);
        et_mail = (EditText) findViewById(R.id.etemail);
    }

    //Método para insertar el Contacto por medio del boton
    public void Insertar(View view){
        //Se instancia el objeto de la clase de la base de datos
        AdminSQLiteOpenHelper administra = new AdminSQLiteOpenHelper(this, "administradorbasedatos", null, 1);
        //Sirve para dar funcionalidad a la base de datos para que pueda leer y escribir
        SQLiteDatabase DataBase = administra.getWritableDatabase();

        //Se recoje el valor que va a meter el usuario, que se guarda en la base de datos
        String nombre = et_nombre.getText().toString();
        String movil = et_movil.getText().toString();
        String mail = et_mail.getText().toString();

        //Se recoje las condiciones para saber que datos queremos que esten vacíos y cuales no
        if (!nombre.isEmpty() && !movil.isEmpty() && !mail.isEmpty() ){
            ContentValues insertContact = new ContentValues();
            insertContact.put("nombre", nombre);
            insertContact.put("movil", movil);
            insertContact.put("mail", mail);

            DataBase.insert("contactos", null, insertContact);

            DataBase.close();
            et_nombre.setText("");
            et_movil.setText("");
            et_mail.setText("");
            Toast.makeText(this, "Contacto insertado correctamente", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Se ha producido un error al insertar el contacto", Toast.LENGTH_SHORT).show();
        }
    }
}