package modelo;

public class CompañiasClass {

	public String razonsocial ;
	public String direccion ;
	public String correo ;
	public String telefono ;
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public CompañiasClass(String razonsocial, String direccion, String correo, String telefono, String fechacreacion,
			String web) {
		super();
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.fechacreacion = fechacreacion;
		this.web = web;
	}
	public String fechacreacion ;
	public String web ;
	
}
