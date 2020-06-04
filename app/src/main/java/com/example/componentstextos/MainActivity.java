package com.example.componentstextos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView eti;
    EditText campo1,campo2,campo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eti=findViewById(R.id.etiqueta);
        campo1=findViewById(R.id.txt1);
        campo2=findViewById(R.id.txt2);
        campo3=findViewById(R.id.txt3);
    }

    public void Evento(View view) {
        switch (view.getId()){
            case R.id.btn:
                Ingresar();
                break;
        }
    }

    private void Ingresar() {
        String pass=campo1.getText().toString();
        int numerico=Integer.parseInt(campo2.getText().toString());
        String multi=campo3.getText().toString();

        eti.setText("NUEVO TITULO!!!");

        Toast.makeText(this, "Password : "+pass, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Dato numérico : "+numerico, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Multilinea : "+multi, Toast.LENGTH_SHORT).show();
    }
}
