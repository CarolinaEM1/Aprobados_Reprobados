/*
Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos
 */
package ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota;
        int aprobados=0,condicionados=0,suspensos=0;
        
        JOptionPane.showMessageDialog(null,"Digite 6 notas entre 0-10");
        for (int i=1; i<=6; i++){
            do {
                
                nota=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota "+i));
            }
            while (nota>10 && nota<0);
            
            if (nota == 4){
                condicionados++;
            }
            else
                if (nota>=5){
                    aprobados++;
                }
                else {
                    suspensos++;
                }
        }
        JOptionPane.showMessageDialog(null,"Cantidad de aprobados: "+aprobados+"\nCantidad de condicionados: "+condicionados+"\nCantidad de suspensos: "+suspensos);
        
    }
    
}
