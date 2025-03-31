package modelo;

public class PromotoresClass {

	
	public int tipodocumento;
    public int documento;
    public String nombres ;
    public String apellidos ;
    public String direccion ;
    public String correopersonal;
    public String orreocorp;
    public String telefono ;
	public PromotoresClass(int tipodocumento, int documento, String nombres, String apellidos, String direccion,
			String correopersonal, String orreocorp, String telefono) {
		super();
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correopersonal = correopersonal;
		this.orreocorp = orreocorp;
		this.telefono = telefono;
	}
	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
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
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getOrreocorp() {
		return orreocorp;
	}
	public void setOrreocorp(String orreocorp) {
		this.orreocorp = orreocorp;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
