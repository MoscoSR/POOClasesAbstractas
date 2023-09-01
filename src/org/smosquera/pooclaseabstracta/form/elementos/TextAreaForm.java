package org.smosquera.pooclaseabstracta.form.elementos;

public class TextAreaForm extends ElementoForm {

    /*Constructor*/
    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    /*Getters y setters*/
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    /*Metodo abstracto heredado de la clase Abstracta*/
    @Override
    public String dibujarHtml() {
        return "<textarea name = '" + this.nombre + "' " +
                "cols = '"+ this.columnas+"' " +
                "rows = '"+this.filas+"' >"
                +this.valor+"</textarea>";
    }
    private int filas;
    private int  columnas;
}
