/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosignos;
import javax.swing.*;
/**
 *
 * @author froma
 */
public class EjercicioSignos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes;
        
        //Cuadro de muestra portada juego
        JOptionPane.showMessageDialog(null, "Ingresa tu dia y mes de nacimiento para determinar tu signo", "Ejercicio de signos", JOptionPane.PLAIN_MESSAGE, 
              new ImageIcon(EjercicioSignos.class.getResource("/img/zodiaco.png")));
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de nacimiento"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento"));
        
       //Condiciones para cada signo
        if ((dia>=21 && mes==1) || (dia<=18 && mes==2)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Acuario", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/acuario.png")));
        } else if ((dia>=19 && dia<=29 && mes==2) || (dia<=20 && mes==3)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Piscis", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/piscis.png")));  
        }else if ((dia>=21 && mes==3) || (dia<=20 && mes==4)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Aries", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/aries.png")));
        }else if ((dia>=21 && mes==4) || (dia<=21 && mes==5)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Tauro", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/tauro.png")));
        }else if ((dia>=22 && mes==5) || (dia<=21 && mes==6)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Géminis", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/geminis.png")));
        }else if ((dia>=22 && mes==6) || (dia<=22 && mes==7)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Cancer", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/cancer.png")));
        }else if ((dia>=23 && mes==7) || (dia<=23 && mes==8)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Leo", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/leo.png")));
        }else if ((dia>=24 && mes==8) || (dia<=23 && mes==9)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Virgo", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/virgo.png")));
        }else if ((dia>=24 && mes==9) || (dia<=23 && mes==10)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Libra", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/libra.png")));
        }else if ((dia>=24 && mes==10) || (dia<=22 && mes==11)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Escorpio", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/escorpio.png")));
        }else if ((dia>=23 && mes==11) || (dia<=21 && mes==12)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Sagitario", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/sagitario.png")));
        }else if ((dia>=22 && mes==12) || (dia<=20 && mes==1)) {
            JOptionPane.showMessageDialog(null, "Tu signo es Capricornio", "Juego de Signos", JOptionPane.PLAIN_MESSAGE, 
                    new ImageIcon(EjercicioSignos.class.getResource("/img/capricornio.png")));
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese una fecha de nacimiento válida");
        }
    }
        
}
    
