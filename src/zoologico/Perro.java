/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author lds
 */
public class Perro extends Canino implements Mascota {

    @Override
    public void Amigable() {
        System.out.println("El perro esta siendo amigable");
        
    }

    @Override
    public void Jugar() {
        System.out.println("El perro esta jugando");
        
    }
    
    
    
}
