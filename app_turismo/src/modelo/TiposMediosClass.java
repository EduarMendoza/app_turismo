package modelo;

public class TiposMediosClass {
	public String nombre;
	public String observacion;
	public TiposMediosClass(String nombre, String observacion) {
		super();
		this.nombre = nombre;
		this.observacion = observacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}
