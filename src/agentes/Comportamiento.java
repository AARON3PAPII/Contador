/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author AaronRamos
 */
public class Comportamiento extends Behaviour{    
     public void action(){
         System.out.println("hola mundo de agentes ");
     }
     public boolean done(){
        return true;
     }
}

