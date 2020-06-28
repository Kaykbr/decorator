/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panificadoraalfa;

public class CDoceLeite  extends Cobertura {
    


    public CDoceLeite(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicionais() {

        return  this.getBolo().getAdicionais() + "Cobertura: Doce de Leite \n";
    }

    @Override
    public double getValor() {

        return 1.50 + this.getBolo().getValor();
    }

}