/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author Gera
 */
public class Accion extends Behaviour{
    private int cont=0;
    public void action(){
         System.out.print(cont+", ");
         cont++;
     }
     public boolean done(){
         if(cont <= 100)
          return false; 
         else
          return true;     
     }      
}

