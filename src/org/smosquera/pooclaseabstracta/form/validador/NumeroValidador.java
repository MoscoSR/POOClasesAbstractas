package org.smosquera.pooclaseabstracta.form.validador;

public class NumeroValidador  extends Validador{
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
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    protected  String mensaje = "El campo $s dato no es un numero";
}
