package com.example.android.app_celulares;

import java.util.ArrayList;

/**
 * Created by android on 16/04/2018.
 */

public class bd {
    private static ArrayList<celular> lista_celulares= new ArrayList<>();
    public void guardar(celular n){
        lista_celulares.add(n);
    }
    public ArrayList<celular> lista(){
        return lista_celulares;
    }
}
