package com.example.agendapersonalpersitnacia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jBotonInsertar = findViewById(R.id.btinsertar);
        Button jBotonListado = findViewById(R.id.btlistado);
        Spinner jspinner = (Spinner) findViewById(R.id.spinnercolor);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_color,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner.
        jspinner.setAdapter(adapter);

        Intent intento = new Intent(MainActivity.this, Insertar_Contacto.class);


    }
}