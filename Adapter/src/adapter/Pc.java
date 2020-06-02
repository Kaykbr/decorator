package Adapter;


public class Pc implements Dispositivo{

    @Override
    public void carregarFilme() {
        System.out.println("Carregando filme...");
    }

    @Override
    public void pesquisarFilme() {
        System.out.println("Pesquisando filme");
        
    }

    @Override
    public void assistirFilme() {
        System.out.println("Iniciando filme.");
    }
    
    
}