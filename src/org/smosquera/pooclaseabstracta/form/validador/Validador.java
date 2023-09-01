package org.smosquera.pooclaseabstracta.form.validador;

 abstract public class Validador {

     /*Getters y setters*/
     abstract  public String getMensaje();

     abstract public void setMensaje(String mensaje);


     /*Metodo abstracto para validar*/
     abstract public boolean esValidado(String valor);


     /*Atributos*/
     protected String mensaje;
 }
