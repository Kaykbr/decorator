package builder.components;

public class Diretor {
private ConcretConsultaBuilder c;

    public Diretor(ConcretConsultaBuilder c) {
        this.c = c;
    }
	
  public void cadastrarConsulta(String mnome, String especialidade,String pnome, String dt_Nascimento, String data, String hora){
		c.cadastrarMedico(mnome, especialidade);
                c.cadastrarPaciente(pnome, dt_Nascimento);
                c.agendarConsulta(data,hora);
                
		
	}
	 public Consulta finalizarConsulta() {
        return this.finalizarConsulta();
    }
}


