package modelo;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexion.Conexion;

public class TiposMediosClass {
	public int idtipomedios;
	public int getIdtipomedios() {
		return idtipomedios;
	}
	
	
	
	
	
	
	public TiposMediosClass() {
		super();
	}






	public void setIdtipomedios(int idtipomedios) {
		this.idtipomedios = idtipomedios;
	}
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
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
	//
	Conexion conector=new Conexion ();
	public void create(int i,String observacion) {
		Connection dbConnetion = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblTiposMedios (nombre,observacion) values (?,?)";
		
		try {
			dbConnetion = conector.conectarBD();
			pst = dbConnetion.prepareStatement(script);
			
			pst.setLong(1,i);
			pst.setString(2,observacion);
			
			
			
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"registro con exito");
		    }catch (SQLException e) {
				System.out.println(e.getMessage());
		    }
		    }
	public void delete (int idtipomedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tblcompanias WHERE idcompañia = ? ";
		try {
			Conexion conector = null;
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			
			pst.setInt(1,idtipomedios);
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipomedios  +" ? ");
			
			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"Registro No. "+idtipomedios+" Eliminado Correctamente");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());		}
	}
	public void create(String txtrazonsocial, String txtdireccion, String txtcorreo, String txtapellidos, String txttelefono, String txtfechacreacion,
			String txtweb) {
		// TODO Auto-generated method stub
		
	}






	public void create(int i, String string, String text) {
		// TODO Auto-generated method stub
		
	}

}
