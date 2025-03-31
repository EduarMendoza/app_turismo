package modelo;

public class VehiculosClass {
	public String matricula ;
	public String marca ;
	public int puestos ;
	public String modelo ;
	public String numeromotor ;
	public VehiculosClass(String matricula, String marca, int puestos, String modelo, String numeromotor,
			String categoria) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.puestos = puestos;
		this.modelo = modelo;
		this.numeromotor = numeromotor;
		this.categoria = categoria;
	}
	public String categoria;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(String numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
