/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Fichero: ExcepcionUsuario.java
 * Autor: Arek Klauza
 * Fecha: Enero 2011
 * Revisión: -
 * Versión: 1.0
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package es.sidelab.scstack.lib.exceptions.dataModel;

import es.sidelab.scstack.lib.exceptions.SCStackException;

/**
 * <p>Este tipo de excepción nos indica que hemos ha sucedido algún error durante
 * el manejo de un objeto Usuario como modelo de datos.</p>
 * <p>Consiste básicamente en un wrapper sobre la clase <i>Exception</i> nativa
 * de Java para tener mejor clasificado el origen de la Excepción.</p>
 * @author Arek Klauza
 */
public class ExcepcionUsuario extends SCStackException {
    public ExcepcionUsuario(Exception e) {
        super(e);
    }

    public ExcepcionUsuario(String msg) {
        super(msg);
    }
}
