package Adapter;

public class Run {

    
    
    
    public static void main(String[] args) {
        
     
        Dispositivo d = new Pc();
        
        d.pesquisarFilme();
        d.carregarFilme();
        d.assistirFilme();
        

        
        d = new Adapter();
        
        d.pesquisarFilme();
        d.carregarFilme();
        d.assistirFilme();
        
        
    }
    
}