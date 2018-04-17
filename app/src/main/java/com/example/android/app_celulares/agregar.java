package com.example.android.app_celulares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class agregar extends AppCompatActivity {
    Spinner marca,color;
    private String marca1[],color1[];
    EditText precio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        marca = findViewById(R.id.spinner1);
        color = findViewById(R.id.spinner2);
        precio = findViewById(R.id.editText);

        marca1= getResources().getStringArray(R.array.marcas);
        color1=getResources().getStringArray(R.array.colores);
    }
    public void guardar(View v){
           if(validar()){
               int p = marca.getSelectedItemPosition();
               int p2 = color.getSelectedItemPosition();
               int p3 = Integer.parseInt(precio.getText().toString());
               celular n = new celular(marca1[p],color1[p2],p3);
               n.guardar();
               precio.setText("");
           }
    }
    public boolean validar(){
        if(precio.getText().toString().equals("")){
            precio.setError(getString(R.string.m1));
            return false;
        }else{
            int p = Integer.parseInt(precio.getText().toString());
            if(p<=0){
                precio.setError(getString(R.string.m2));
                return false;
            }
        }
        return true;
    }
}
