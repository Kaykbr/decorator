
package panificadoraalfa;

/**
 *
 * @author Kayky
 */
public class PanificadoraAlfaBolos {
    
    public static void main(String[] args) {

        Bolo bolo = new SChocolate();
        bolo = new CChocolate(bolo);
        bolo = new FMorango(bolo);
        InfoBolo.ResumoBolo(bolo);

        Bolo bolo2 = new SBaunilha();
        bolo2 = new CDoceLeite(bolo2);
        bolo2 = new FPessego(bolo2);
        InfoBolo.ResumoBolo(bolo2);
           
        Bolo bolo3 = new SLimao();
        bolo3 = new CDoceLeite(bolo3);
        bolo3 = new FAmora(bolo3);
        InfoBolo.ResumoBolo(bolo3);
        
        Bolo bolo4 = new SLaranja();
        bolo4 = new CMorango(bolo4);
        bolo4 = new FMorango(bolo4);
        InfoBolo.ResumoBolo(bolo4);

    }

}




