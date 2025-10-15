package entities;

public abstract class Contribuintes {
	
	private String name;
	protected Double rendaAnual;
	
	public Contribuintes() {
	}
	
	public Contribuintes(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getRendaAnual() {
		return rendaAnual;
	}
	
	public abstract Double calculoImposto();
}
