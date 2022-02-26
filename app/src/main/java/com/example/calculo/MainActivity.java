package com.example.calculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText etUno,etDos;
    private Button btnCalcular;
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUno=findViewById(R.id.etUno);
        etDos=findViewById(R.id.etDos);
        boton=(Button) findViewById(R.id.btnIntegrantes);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),Integrantes.class);
                startActivity(b);
            }
        });

        btnCalcular=findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int resultado=restar(Integer.valueOf(etUno.getText().toString()),
                        Integer.valueOf(etDos.getText().toString()));
                Toast.makeText(MainActivity.this, "Tu frecuencia cardiaca maxima es: "+resultado, Toast.LENGTH_SHORT).show();



            }

    });

    }

    public int restar(int num1,int num2){
        return num1-num2;

    }
}