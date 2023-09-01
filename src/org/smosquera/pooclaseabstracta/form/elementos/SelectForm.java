package org.smosquera.pooclaseabstracta.form.elementos;

import org.smosquera.pooclaseabstracta.form.select.Opcion;

import java.util.*;

public class SelectForm extends ElementoForm {

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    /*Se agrega opciones a la lista*/
    public SelectForm addOption(Opcion opcion) {
        this.opciones.add(opcion);
        return  this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<selected");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion :  this.opciones) {
            sb.append("\n<option value= '")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()) {
                sb.append( " selected");
                this.valor = opcion.getValor();
            }
            sb.append(">")
                    .append(opcion. getNombre())
                    .append("</option>");
        }
        sb.append("</selected>");
        return sb.toString();
    }

    private List<Opcion> opciones;
}
