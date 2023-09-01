package org.smosquera.pooclaseabstracta.form.elementos;

public class InputForm  extends ElementoForm {


    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }


    /*Getters y setters*/
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*Metodo de la clase padre abstracta-MetodoAbstracto*/
    @Override
    public String dibujarHtml() {
        return "<input type = \""+this.tipo +
                "\" name = \"" + this.nombre +
                "\" values =\""+ this.valor+"\">";
    }
    private String tipo = "text";
}
