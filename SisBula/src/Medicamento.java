public class Medicamento {
	private String nome;
	private Fabricante fabricante;
	//private List<Medicamento> interacoesMedicamentos;
	//private List<indicacaoMedicamento> indicacoes;
	
	public Medicamento(String nome,Fabricante fabricante){
		this.nome=nome;
		this.fabricante = fabricante;
		//this.interacoesMedicamentos = interacoesMedicamentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	/*public List<Medicamento> getInteracoesMedicamentos() {
		return interacoesMedicamentos;
	}

	public void setInteracoesMedicamentos(List<Medicamento> interacoesMedicamentos) {
		this.interacoesMedicamentos = interacoesMedicamentos;
	}*/
	public String getId(){
		return this.nome+this.fabricante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicamento other = (Medicamento) obj;
		if (fabricante != other.fabricante)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
