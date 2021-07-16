/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conpatron;

/**
 *
 * @author alexx
 */
public class AutomovilDecorator {
    public Vehiculo vehiculo;
    public AutomovilDecorator (Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    public void aggFeatures(){
        System.out.println("Un carro basico");
    }
    
    
    
}
