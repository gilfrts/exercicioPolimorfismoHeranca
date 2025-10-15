package entities;

public class PessoaJuridica extends Contribuintes {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(Integer numeroFuncionarios, String name, Double rendaAnual) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double calculoImposto() {
		double sum = 0;
		if (numeroFuncionarios < 10) {
			sum += rendaAnual * 1.6;
		}
		else {
			sum += rendaAnual * 1.4;
		}
		return sum;
	}
}
