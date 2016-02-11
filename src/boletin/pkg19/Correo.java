package boletin.pkg19;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Correo {
    private String mensaje;
    private boolean leido;

    public Correo() {
        mensaje = JOptionPane.showInputDialog("Introduce el contenido del correo");
        this.mensaje = mensaje; // = JOptionPane.showInputDialog("Introduce el mensaje del correo");
        this.leido = false;
    }

    public String getMensaje() {
        return mensaje;
    }
    public boolean isLeido() {
        return leido;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Correo{" + "mensaje=" + mensaje + ", leido=" + leido + '}';
    }
    
}
