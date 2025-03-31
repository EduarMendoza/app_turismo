package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexion.Conexion;

public class AgenciasClass {

	
	public String nombre; 
	public String direccion; 
	public String correo;
	public String telefono;
	public String web;
	public int idcompania;
	public AgenciasClass(String nombre, String direccion, String correo, String telefono, String web, int idcompania) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.web = web;
		this.idcompania = idcompania;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getIdcompania() {
		return idcompania;
	}
	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}
	
	
	public class Agencias{
		Conexion conector=new Conexion ();
		public void create(String nombre,String direccion,String correo,String telefono,String web,int  idcompania) {
			Connection dbConnetion = null;
			PreparedStatement pst = null;//preparar la trx
			String script = "INSERT INTO tblagencias(nombre,direccion,correo,telefono,web,idcompañia) values (?,?,?,?,?,?)";
			
			try {
				dbConnetion = conector.conectarBD();
				pst = dbConnetion.prepareStatement(script);
				
				pst.setString(1,nombre);
				pst.setString(2,direccion);
				pst.setString(3,correo);
				pst.setString(4,telefono);
				pst.setString(5,web);
				pst.setLong(6,idcompania);
				
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"registro con exito");
			    }catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			
					
		}
	}

}
