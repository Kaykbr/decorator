package builder.components;

/**
 *
 * @author Kayky
 */
public interface ConsultaBuilder {
    	void cadastrarMedico(String nome, String especialidade);
	void cadastrarPaciente(String nome, String dt_Nascimento);
	void agendarConsulta(String data, String hora);
	Consulta finalizarConsulta();
	
}
