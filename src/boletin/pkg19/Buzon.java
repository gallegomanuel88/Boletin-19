package boletin.pkg19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Buzon {
    ArrayList <Correo> arrayMensajes= new ArrayList();
    /**
     * retorna el numero de correos que hay en la bandeja
     * @return numero de correos en un int
     */
    public int numeroDeCorreos(){
        int numeroDeCorreosBuzon = 0;
        return numeroDeCorreosBuzon = arrayMensajes.size();
    }
    /**
     * Añade c al correo
     * @param c corresponde al objeto de la clase correo
     */
    public void engade (Correo c){
        arrayMensajes.add(c);
    }
    /**
     * Confirma si hay algun correo sin leer o si estan todos leido.
     * @return true es alguno no leido y false es todos leidos
     */
    public boolean porLer(){
        boolean confirmacionPorLer=false;
        
        for (int i=0; i < arrayMensajes.size(); i++){
            if (arrayMensajes.get(i).isLeido()==false){
                 confirmacionPorLer = true;
                 break;
            }
        }
        return confirmacionPorLer;
    }
    /**
     * Retorna el primer correo no leido
     * @return retorna el Strin de la Clase correo o el texto "No hay correos no leidos"
     */
    public String amosaPrimerNoLeido(){
        String amosar="";
        for (int i =0; i<arrayMensajes.size(); i++){
            if (arrayMensajes.get(i).isLeido()==false){
                arrayMensajes.get(i).setLeido(true);
                return arrayMensajes.get(i).getMensaje();
            }
        }
        return amosar = "No hay correos no leidos";
    }
    /**
     * Muestra si el correo elegido esta leido o no
     * @param k equivale al numero de correo que quieres comprobar si esta leido
     * @return retorna un String indicando si el correo esta leido o no
     */
    public String amosaLeidoOuNon(int k){
        if (arrayMensajes.get(k).isLeido()==false){
                 return "El correo numero"+k+" no esta leido";
        }
        return "El correo numero"+k+" esta leido";
    }
    /**
     * Elimina el correo que elijas
     * @param k corresponde al numero de correo que quieres eliminar
     */
    public void elimina(int k){
        arrayMensajes.remove(k);
    }
    public String amosa (int k){
        arrayMensajes.get(k-1).setLeido(true);
        return arrayMensajes.get(k-1).getMensaje();
    }
    public String introducir(String i){
        return JOptionPane.showInputDialog("Introduce "+i);
    }
}
