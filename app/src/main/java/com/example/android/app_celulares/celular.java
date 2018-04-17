package com.example.android.app_celulares;

/**
 * Created by android on 16/04/2018.
 */

public class celular {
    private String marca;
    private String color;
    private int precio;

    public celular(String marca, String color, int precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "celular{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
    public void guardar(){
        new bd().guardar(this);
    }
}
