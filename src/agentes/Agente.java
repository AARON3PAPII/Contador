/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.Agent;
/**
 *
 * @author AaronRamos
 */
public class Agente extends Agent{
    @Override
    protected void setup(){
        Comportamiento obj = new Comportamiento();
        addBehaviour(obj);
       // obj.action();
        //obj.done();
    }

}
