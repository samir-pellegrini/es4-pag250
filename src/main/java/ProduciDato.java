
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class ProduciDato extends Thread {
    Semaforo pieno;
    Semaforo vuoto;
    int[10] tanti;

    public ProduciDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    public void run()
    {
       for(int i=0; i<tanti;i++)
       {
           try {
               vuoto.p();
               Main.buffer = i;
               System.out.println("dato scritto:" + i);
               pieno.v();
               Thread.sleep(500);
           } catch (InterruptedException ex) {
               Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }
    
    
    
    
}
