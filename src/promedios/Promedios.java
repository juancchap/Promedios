
package promedios;

import javax.swing.JOptionPane;



public class Promedios {

    
    public static void main(String[] args) {

    //Declaracion de variables    
    int numero, elementos = 0,suma=0;
    float media;
    
    numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
       
        while(numero>0)
        {
         suma=suma+numero;
         elementos++;
         numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
         
        }
        
        if(elementos==0)
        {
            JOptionPane.showMessageDialog(null,"No existe division entre 0");
            System.out.println("No existe division entre 0");
        }
        else
        {
            media=(float)suma/elementos;
            JOptionPane.showMessageDialog(null,"La media es: "+media);
            System.out.println("la media es: "+media);
            
        }
    
    
    }
    
}
