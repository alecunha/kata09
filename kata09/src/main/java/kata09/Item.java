package kata09;

public enum Item {
	
	A(50, new Integer(3), new Double(130)),
	B(30, new Integer(2), new Double(45)),
	C(20, null, null),
	D(15, null, null);
	
	Item(double precoUnitario, Integer quantidadeDesconto, Double precoDesconto) {
		this.precoUnitario = precoUnitario;
		this.quantidadeDesconto = quantidadeDesconto;
		this.precoDesconto = precoDesconto;
	}
	
	private double precoUnitario;
	
	private Integer quantidadeDesconto;
	
	private Double precoDesconto;

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public Integer getQuantidadeDesconto() {
		return quantidadeDesconto;
	}

	public Double getPrecoDesconto() {
		return precoDesconto;
	}
	
}
