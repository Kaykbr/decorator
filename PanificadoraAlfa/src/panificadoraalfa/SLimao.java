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
public class SLimao extends Bolo{
   

    public SLimao() {
        this.setNome("Limao");
    }

    @Override
    public String getAdicionais() {
        return "Massa + Limao ecah \n";
    }

    @Override
    public double getValor() {
        return 5.0;
    }

}
    
