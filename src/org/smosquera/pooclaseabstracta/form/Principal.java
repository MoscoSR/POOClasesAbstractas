package org.smosquera.pooclaseabstracta.form;

import org.smosquera.pooclaseabstracta.form.elementos.ElementoForm;
import org.smosquera.pooclaseabstracta.form.elementos.InputForm;
import org.smosquera.pooclaseabstracta.form.elementos.SelectForm;
import org.smosquera.pooclaseabstracta.form.elementos.TextAreaForm;
import org.smosquera.pooclaseabstracta.form.select.Opcion;
import org.smosquera.pooclaseabstracta.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5,9);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOption(java)
        .addOption(new Opcion("2", "Python"))
        .addOption(new Opcion("3", "JavaScript"))
        .addOption(new Opcion("4", "TypeScript"))
        .addOption(new Opcion("5","PHP"));

        ElementoForm elementoForm = new ElementoForm("Saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name= '" + this.nombre+ "' values = \"" + this.valor + "\">";
            }
        };

        elementoForm.setValor("Este campo esta desabilitado");
        username.setValor("jhondoe");
        password.setValor("a1b2c3");
        email.setValor("correo@correo.com");
        edad.setValor("28");
        experiencia.setValor("Mas de 10 años de experiencia");
        java.setSelected(true);

        List<ElementoForm> elementoFormList = Arrays.asList(username, password, email, experiencia, lenguaje, elementoForm);
        for (ElementoForm e : elementoFormList) {
            System.out.println(e.dibujarHtml());
        }
        elementoFormList.forEach(e ->{
            if (!e.esValido()) {
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}
