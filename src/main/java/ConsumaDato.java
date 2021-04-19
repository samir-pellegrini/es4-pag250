
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
public class ConsumaDato {
     Semaforo pieno;
    Semaforo vuoto;
    int[] dato;

    public ConsumaDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
        public void run()
    {
       while(true)
       {
               pieno.p();
               dato=Main.buffer;
               System.out.println("dato letto:" + dato);
               vuoto.v();
              
           }
           
       }
    }
    

