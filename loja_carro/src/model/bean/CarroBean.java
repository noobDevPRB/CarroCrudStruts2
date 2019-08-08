package model.bean;

public class CarroBean {
	
	private int id;
	private String marca;
	private String modelo;
	private String descModelo;
	private int nPortas;
	private String Ano;
	private String tipo;
	private String valor;
	
	public CarroBean(int id, String marca, String modelo, String descModelo, int nPortas, String ano, String tipo,
			String valor) {
		
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.descModelo = descModelo;
		this.nPortas = nPortas;
		Ano = ano;
		this.tipo = tipo;
		this.valor = valor;
	}

	
	
	public CarroBean() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getDescModelo() {
		return descModelo;
	}



	public void setDescModelo(String descModelo) {
		this.descModelo = descModelo;
	}



	public int getnPortas() {
		return nPortas;
	}



	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}



	public String getAno() {
		return Ano;
	}



	public void setAno(String ano) {
		Ano = ano;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}

}
