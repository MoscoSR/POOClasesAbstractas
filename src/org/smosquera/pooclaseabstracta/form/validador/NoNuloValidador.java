package org.smosquera.pooclaseabstracta.form.validador;

public class NoNuloValidador extends Validador {


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
        return (valor != null);
    }

    protected  String mensaje = "El campo  $s no puede ser nulo";
}
