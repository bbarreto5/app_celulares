package com.example.android.app_celulares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class inicio extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        lv = findViewById(R.id.lista);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent n = new Intent(inicio.this,agregar.class);
                        startActivity(n);
                        break;
                    case 1:
                        Intent nn = new Intent(inicio.this,ver_lista.class);
                        startActivity(nn);
                        break;
                    case 2:
                        Intent nnn = new Intent(inicio.this,reporte.class);
                        startActivity(nnn);
                        break;
                }
            }
        });
    }
}
