package entities;

public class PessoaFisica extends Contribuintes{

	private Double gastosSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double calculoImposto() {
		double sum = 0;
		if (rendaAnual < 20000.00) {
			sum += (rendaAnual * 1.5) - (gastosSaude * 5.0);
		}
		else if (rendaAnual >= 20000.00) {
			sum += (rendaAnual * 2.5) - (gastosSaude * 5.0);
		}
		return sum;
	}
}
