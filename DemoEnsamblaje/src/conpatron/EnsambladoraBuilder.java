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
public abstract class EnsambladoraBuilder {
    protected Vehiculo vehiculo;
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
    public abstract void ConstruirVehiculo();
    public abstract void ConstruirHabitaculo();
    public abstract void ConstruirMotor();
    public abstract void ConstruirCarroceria();
}
