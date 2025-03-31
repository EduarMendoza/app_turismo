package modelo;

public class OperadoresClass {

	public String tipodocumento ;
	public int numdocumento;
	public String nombre;
	public String apellidos ;
	public String direccion ;
	public String correo ;
	public String telefono ;
	public OperadoresClass(String tipodocumento, int numdocumento, String nombre, String apellidos, String direccion,
			String correo, String telefono) {
		super();
		this.tipodocumento = tipodocumento;
		this.numdocumento = numdocumento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getNumdocumento() {
		return numdocumento;
	}
	public void setNumdocumento(int numdocumento) {
		this.numdocumento = numdocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
}
