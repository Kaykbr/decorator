
package panificadoraalfa;


public abstract class Bolo {
    
    private String nome;
    
    public abstract String getAdicionais();
    public abstract double getValor();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
    