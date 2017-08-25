import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
		
/**
 * @author robson
 *
 */
public class SisBulaMemory {
	private Map<String, Medicamento> medicamentos;
	
	public SisBulaMemory(){
		medicamentos = new HashMap<String,Medicamento>();
	}
	public void cadastrarMedicamento(Medicamento m) throws MedicamentoJaExisteException{
		if (medicamentos.get(m.getId())!=null)throw new MedicamentoJaExisteException("O medicamento já existe");
		medicamentos.put(m.getId(), m);
		
	}
	public Medicamento pesquisaMedicamento(String nome,Fabricante fabricante) throws MedicamentoInexistenteException{
		String x = nome+fabricante;
		Medicamento medicamento = medicamentos.get(x);
		if (medicamento==null) throw new MedicamentoInexistenteException("O medicamento não existe");
		return medicamento;
	}
	public List<Medicamento> pesquisaMedicamentosDoFabricante(Fabricante f){
		List<Medicamento> resultado = new ArrayList<Medicamento>();
		Collection<Medicamento> lista = medicamentos.values();
		for (Medicamento m:lista){
			if (m.getFabricante().equals(f)){
				resultado.add(m);
			}
		}
		return resultado;
	}
	public List<Medicamento> pesquisaMedicamentosPara(Fabricante f){
		return  null;
	}
	
	
}
