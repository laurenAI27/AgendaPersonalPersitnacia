package com.example.agendapersonalpersitnacia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences lastColour;
    private SharedPreferences.Editor controlador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastColour = getSharedPreferences("MySharedPreferences", MODE_PRIVATE);
        controlador = lastColour.edit();
        final  int escogido = lastColour.getInt("Selecionado", 0);
        Button jBotonInsertar = findViewById(R.id.btinsertar);
        Button jBotonListado = findViewById(R.id.btlistado);
        Spinner jspinner = (Spinner) findViewById(R.id.spinnercolor);
        LinearLayout linear = findViewById(R.id.llout_background);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_color,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner.
        jspinner.setAdapter(adapter);
        jspinner.setSelection(escogido);

        jspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                controlador.putInt("Selecionado", position).commit();
                if(position== 0){
                    linear.setBackgroundColor(Color.WHITE);
                } else if (position== 1) {
                    linear.setBackgroundColor(Color.parseColor(" #33f0ff"));//Azul claro
                } else if (position== 2) {
                    linear.setBackgroundColor(Color.parseColor(" #33f0ff"));//Amarillo
                }
                else if(position == 3){
                    linear.setBackgroundColor(Color.parseColor(" #33f0ff"));//Verde claro
                } else if (position == 4) {
                    linear.setBackgroundColor(Color.parseColor(" #33f0ff"));//Violeta
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Intent intento = new Intent(MainActivity.this, Insertar_Contacto.class);

        //
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        int colorInicial = sharedPreferences.getInt("numero_guardado", 0);


    }
}