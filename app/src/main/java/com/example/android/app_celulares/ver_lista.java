package com.example.android.app_celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ver_lista extends AppCompatActivity {
    TableLayout tabla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_lista);
        tabla = findViewById(R.id.tabla);
        recorrer();
    }
    private void recorrer(){
        ArrayList<celular> lista = new bd().lista();
        int t = lista.size();
        for (int i =0; i<t;i++){
            TableRow fila = new TableRow(this);
            TextView n1 = new TextView(this);
            TextView n2 = new TextView(this);
            TextView n3 = new TextView(this);
            TextView n4 = new TextView(this);

            n1.setText(""+(i+1));
            n2.setText(lista.get(i).getMarca());
            n3.setText(lista.get(i).getColor());
            n4.setText(""+lista.get(i).getPrecio());
            fila.addView(n1);
            fila.addView(n2);
            fila.addView(n3);
            fila.addView(n4);
            tabla.addView(fila);
        }
    }
}
