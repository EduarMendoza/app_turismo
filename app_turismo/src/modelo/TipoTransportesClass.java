package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexion.Conexion;

public class TipoTransportesClass {
	String nombre;
	String observación;
	int idtipotransporte;



	public int getIdtipotransporte() {
		return idtipotransporte;
	}

	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}

	public Conexion getConector() {
		return conector;
	}

	public void setConector(Conexion conector) {
		this.conector = conector;
	}

	public String getNombre() {
		return nombre;
	}
	
	public TipoTransportesClass() {
		super();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservación() {
		return observación;
	}
	public void setObservación(String observación) {
		this.observación = observación;
	}
	public TipoTransportesClass(String nombre, String observación) {
		super();
		this.nombre = nombre;
		this.observación = observación;
	}
	//
	Conexion conector=new Conexion ();
	public void create(String nombre,String observación,int idtipotransporte) {
		Connection dbConnetion = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblTipoTransportes (nombre,observación) values (?,?)";
		
		try {
			dbConnetion = conector.conectarBD();
			pst = dbConnetion.prepareStatement(script);
			
			pst.setString(1,nombre);
			pst.setString(2,observación);
			
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"registro con exito");
		    }catch (SQLException e) {
				System.out.println(e.getMessage());
		    }
		    }
	public void delete (int idtipotransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tbltipotransporte WHERE idcompañia = ? ";
		try {
			Conexion conector = null;
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			
			pst.setInt(1,idtipotransporte);
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipotransporte  +" ? ");
			
			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"Registro No. "+idtipotransporte+" Eliminado Correctamente");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());		}
	}
	public void create(String txtrazonsocial, String txtdireccion, String txtcorreo, String txtapellidos, String txttelefono, String txtfechacreacion,
			String txtweb) {
		// TODO Auto-generated method stub
		
	}

	public void create(String text, String text2, String text3) {
		// TODO Auto-generated method stub
		
	}
}
