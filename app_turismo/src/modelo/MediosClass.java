package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexion.Conexion;

public class MediosClass {

	
	public String nombre;
    public String observacion;
    public int idmedio;
	public int getIdmedio() {
		return idmedio;
		
		
		
	}
	public MediosClass() {
		super();
	}
	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
	public MediosClass(String nombre, String observacion) {
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
		Conexion conector=new Conexion ();
		public void create(String nombre,String observacion, int idmedio) {
			Connection conectarBD = null;
			PreparedStatement pst = null;
			String script = "INSERT INTO tblMedios (nombre,observacion) values (?,?)";
			
			try {
				conectarBD = conector.conectarBD();
				pst = conectarBD.prepareStatement(script);
				
				pst.setString(1,nombre);
				pst.setString(2,observacion);
			
				
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"registro con exito");
			    }catch (SQLException e) {
					System.out.println(e.getMessage());
			    }
			    }
		public void delete (int idmedio) {
			Connection conectarBD = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tblmedios WHERE idagencias= ? ";
			try {
				Conexion conector = null;
				conectarBD = conector.conectarBD();
				pst = conectarBD.prepareStatement(script);
				
				
				pst.setInt(1,idmedio);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idmedio  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+idmedio+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
		}
	}

