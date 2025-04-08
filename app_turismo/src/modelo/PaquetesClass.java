package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexion.Conexion;

public class PaquetesClass {

	public int iddestino; 
	public PaquetesClass(int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observacion) {
		super();
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.horasalida = horasalida;
		this.fechaejecucion = fechaejecucion;
		this.observacion = observacion;
	}
	public PaquetesClass() {
		// TODO Auto-generated constructor stub
	}
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int idorigen ;
	public String fechaventa ;
	public String horaventa ;
	public String horasalida ;
	public String fechaejecucion;
	public String observacion;


	Conexion conector=new Conexion ();
	public void create(int iddestino,int idorigen,String fechaventa,String horaventa,String fechaejecucion,String  observacion) {
		Connection dbConnetion = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblPaquetes (iddestino,idorigen,correo,telefono,razonsocial) values (?,?,?,?,?,?)";
		
		try {
			dbConnetion = conector.conectarBD();
			pst = dbConnetion.prepareStatement(script);
			
			pst.setLong(1,iddestino);
			pst.setLong(2,idorigen);
			pst.setString(3,fechaventa);
			pst.setString(4,horaventa);
			pst.setString(5,fechaejecucion);
			pst.setString(6,observacion);
			
			
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"registro con exito");
		    }catch (SQLException e) {
				System.out.println(e.getMessage());
		    }
		    }
	        public void delete1 (int idorigen) {
				Connection dbConnection = null;
				PreparedStatement pst = null;
				String script = "DELETE FROM  tblPaquetes WHERE idcompañia = ? ";
				try {
					Conexion conector = null;
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					
					
					pst.setInt(1,idorigen);
					
					int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idorigen  +" ? ");
					
					if (resp == JOptionPane.OK_OPTION) {
						pst.executeUpdate();
						JOptionPane.showConfirmDialog(null,"Registro No. "+idorigen+" Eliminado Correctamente");
					}
					
				} catch (SQLException e) {
					System.out.println(e.getMessage());		}
			}
	        public void delete (int iddestino) {
				Connection dbConnection = null;
				PreparedStatement pst = null;
				String script = "DELETE FROM  tblPaquetes WHERE idcompañia = ? ";
				try {
					Conexion conector = null;
					dbConnection = conector.conectarBD();
					pst = dbConnection.prepareStatement(script);
					
					
					pst.setInt(1,iddestino);
					
					int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + iddestino  +" ? ");
					
					if (resp == JOptionPane.OK_OPTION) {
						pst.executeUpdate();
						JOptionPane.showConfirmDialog(null,"Registro No. "+iddestino+" Eliminado Correctamente");
					}
					
				} catch (SQLException e) {
					System.out.println(e.getMessage());		}
			}
			public void create1 (String txtrazonsocial, String txtdireccion, String txtcorreo, String txtapellidos, String txttelefono, String txtfechacreacion,
					String txtweb) {
				// TODO Auto-generated method stub
				
			}
	public void create(String text, String text2, String text3, String text4, String text5, String text6,
			String text7) {
		// TODO Auto-generated method stub
		
	}
}
