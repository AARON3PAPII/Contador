/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;
import jade.core.Agent;
/**
 *
 * @author AaronRamos
 */
public class Contador extends Agent{
    @Override
    protected void setup(){
        Accion obj=new Accion();
        addBehaviour(obj);
    }
    
}
