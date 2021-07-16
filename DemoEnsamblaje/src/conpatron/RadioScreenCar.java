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
public class RadioScreenCar extends AutomovilDecorator{
    public RadioScreenCar(Vehiculo vehiculo){
        super(vehiculo);
    }
    
    @Override
    public void aggFeatures(){
        super.aggFeatures();
        System.out.println("Agregado una radio camara en el vehiculo");
    }
}
