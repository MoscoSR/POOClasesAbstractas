package org.smosquera.pooclaseabstracta.form.validador;

import org.smosquera.pooclaseabstracta.form.validador.mensaje.MensajeFormateable;

public class LargoValidador  extends Validador implements MensajeFormateable {


    public LargoValidador() {

    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {

    }

    @Override
    public boolean esValidado(String valor) {
        this.mensaje = String.format(this.mensaje, this.min, this.max);
        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <=max);
    }

    protected String mensaje = "El campo debe tener minimos %d caracteres y maximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    @Override
    public String getMensajeFormateable(String campo) {
        return String.format(this.mensaje, campo, this.min, this.max);
    }
}
