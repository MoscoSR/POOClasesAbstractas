package org.smosquera.pooclaseabstracta.form.validador;

public class EmailValidador  extends Validador{
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
        return valor.matches(EMAIL_REGEX);
    }

    protected String mensaje = " El campo %s tiene  formato de email invalido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
}
