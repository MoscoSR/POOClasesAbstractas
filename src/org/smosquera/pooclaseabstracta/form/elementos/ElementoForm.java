package org.smosquera.pooclaseabstracta.form.elementos;

import org.smosquera.pooclaseabstracta.form.validador.LargoValidador;
import org.smosquera.pooclaseabstracta.form.validador.Validador;
import org.smosquera.pooclaseabstracta.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public boolean esValido() {
        for (Validador validador : validadores) {
            if (!validador.esValidado(this.valor)) {
                if (validador instanceof MensajeFormateable) {
                    this.errores.add(((LargoValidador) validador).getMensajeFormateable(nombre));
                } else {
                    this.errores.add(String.format(validador.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

    protected String valor;
    protected String nombre;
    private List<Validador> validadores;
    private List<String> errores;
}
