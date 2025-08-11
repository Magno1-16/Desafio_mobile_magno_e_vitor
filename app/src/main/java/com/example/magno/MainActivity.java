package com.example.magno;


import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.desafio.R;


public class MainActivity extends AppCompatActivity {


    EditText editValor;
    Button btnMetrosKm, btnKmMetros;
    TextView txtResultado;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editValor = findViewById(R.id.editValor);
        btnMetrosKm = findViewById(R.id.btnMetrosKm);
        btnKmMetros = findViewById(R.id.btnKmMetros);
        txtResultado = findViewById(R.id.txtResultado);


        // Metros para Km
        btnMetrosKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editValor.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Digite um valor", Toast.LENGTH_SHORT).show();
                    return;
                }
                double metros = Double.parseDouble(editValor.getText().toString());
                double km = metros / 1000;
                txtResultado.setText("Resultado: " + km + " km");
            }
        });



        btnKmMetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editValor.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Digite um valor", Toast.LENGTH_SHORT).show();
                    return;
                }
                double km = Double.parseDouble(editValor.getText().toString());
                double metros = km * 1000;
                txtResultado.setText("Resultado: " + metros + " m");
            }
        });
    }
}
