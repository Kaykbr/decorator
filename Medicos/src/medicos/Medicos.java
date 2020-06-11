package medicos;

import builder.components.ConcretConsultaBuilder;
import builder.components.Consulta;
import builder.components.Diretor;


public class Medicos {

	public static void main(String[] args) {
		ConcretConsultaBuilder ConsultaBuilder = new ConcretConsultaBuilder(1);
		Diretor dir = new Diretor (ConsultaBuilder);
		dir.cadastrarConsulta("Maria Fernanda","psicologa","Jose Vinicius","08/09/2003","10/06/2020","16:40");

	
		Consulta Consulta = ConsultaBuilder.finalizarConsulta();
		Consulta.imprimirComprovante();

	}

}
