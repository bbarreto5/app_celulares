package com.example.android.app_celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class reporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);
    }
    public void reporte4(View v){
        ArrayList<celular> lista = new bd().lista();
        int t = lista.size();
        int n=0;
        for (int i =0; i<t;i++){
            String color =  getString(R.string.negro);
            String marca =  getString(R.string.apple);
            if(lista.get(i).getMarca().equals(marca) && lista.get(i).getColor().equals(color)){
                n++;
            }
        }
        Toast.makeText(getApplicationContext(), getString(R.string.resultado)+": "+n,
                Toast.LENGTH_SHORT).show();
    }
    public void reporte5(View v){
        ArrayList<celular> lista = new bd().lista();
        int t = lista.size();
        int n=0;
        int psuma = 0;
        for (int i =0; i<t;i++){
            String marca =  getString(R.string.nokia);
            if(lista.get(i).getMarca().toString().equals(marca)){
                n++;
                psuma+=lista.get(i).getPrecio();
            }
        }
        Toast.makeText(getApplicationContext(), getString(R.string.resultado)+": "+(psuma/n),
                Toast.LENGTH_SHORT).show();
    }
}
