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
public class SBaunilha extends Bolo{
   

    public SBaunilha() {
        this.setNome("Baunilha");
    }

    @Override
    public String getAdicionais() {
        return "Massa + Baunilha\n";
    }

    @Override
    public double getValor() {
        return 3.0;
    }

}
    
