package org.smosquera.pooclaseabstracta.form.validador;

public class RequeridoValidador extends Validador {
    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValidado(String valor) {
        return (valor != null && valor.length() > 0) ;
    }

    protected String mensaje = "El campo %s  es requerido";
}
