import static org.junit.Assert.*;

import org.junit.Test;

public class SusBulaMemoryTest {

	@Test
	public void test() {
		SisBulaMemory sisBula = new SisBulaMemory();
		assertTrue(sisBula.pesquisaMedicamentosDoFabricante(Fabricante.MEDLEY).size()==0);
		Medicamento m = new Medicamento("Dipirona", Fabricante.MEDLEY);
		try {
			sisBula.cadastrarMedicamento(m);
		} catch (MedicamentoJaExisteException e) {
			fail();
		}
		assertTrue(sisBula.pesquisaMedicamentosDoFabricante(Fabricante.MEDLEY).size()==1);
		
		assertTrue(sisBula.pesquisaMedicamentosDoFabricante(Fabricante.MEDLEY).get(0).getNome().equals("Dipirona"));
		
		try {
			sisBula.cadastrarMedicamento(m);
			fail();
		} catch (MedicamentoJaExisteException e) {
			System.out.println("Medicamento já existe");
		}
	}

}
