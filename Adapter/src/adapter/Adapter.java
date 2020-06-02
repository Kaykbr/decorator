package Adapter;

public class Adapter extends Tv implements Dispositivo{

    @Override
    public void carregarFilme() {
        this.carregarAplicacoes();
        System.out.println("Carregando filme aguarde...");
    }

    @Override
    public void pesquisarFilme() {
        this.verificarRede();
        System.out.println("Pesquisando filme aguarde...");
    }

    @Override
    public void assistirFilme() {
        this.verificarRede();
        System.out.println("Iniciando filme... /n Curta o Filme Salve salve");
        
    }
    
    
    
}