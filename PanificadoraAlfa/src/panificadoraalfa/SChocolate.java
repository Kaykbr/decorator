/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panificadoraalfa;

/**
 *
 * @author Kayky
 */
public class SChocolate extends Bolo{
   

    public SChocolate() {
        this.setNome("Chocolate");
    }

    @Override
    public String getAdicionais() {
        return "Massa + Chocolate\n";
    }

    @Override
    public double getValor() {
        return 6.0;
    }

}
    
