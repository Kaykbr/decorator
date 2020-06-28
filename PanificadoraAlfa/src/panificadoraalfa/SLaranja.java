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
public class SLaranja extends Bolo{
   

    public SLaranja() {
        this.setNome("Laranja");
    }

    @Override
    public String getAdicionais() {
        return "Massa + Laranja hummm \n";
    }

    @Override
    public double getValor() {
        return 5.0;
    }

}
    
