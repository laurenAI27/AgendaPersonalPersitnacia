package com.example.agendapersonalpersitnacia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jBotonInsertar = findViewById(R.id.btinsertar);
        Button jBotonListado = findViewById(R.id.btlistado);
    }
}