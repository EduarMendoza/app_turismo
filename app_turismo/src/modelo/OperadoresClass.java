package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexion.Conexion;

public class OperadoresClass {
	public int idoperadores ;
	public int getIdoperadores() {
		return idoperadores;
	}
	public void setIdoperadores(int idoperadores) {
		this.idoperadores = idoperadores;
	}
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
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
		Conexion conector=new Conexion ();
		public void create(String nombre,String direccion,String correo,String telefono,String web,int  idcompania) {
			Connection dbConnetion = null;
			PreparedStatement pst = null;
			String script = "INSERT INTO tblOperadores (tipodocumento,numdocumento,nombre,apellidos,direccion,correo,telefono) values (?,?,?,?,?,?,?)";
			
			try {
				dbConnetion = conector.conectarBD();
				pst = dbConnetion.prepareStatement(script);
				
				pst.setString(1,tipodocumento);
				pst.setLong(2,numdocumento);
				pst.setString(3,nombre);
				pst.setString(4,apellidos);
				pst.setString(5,direccion);
				pst.setString(6,correo);
				pst.setString(7,telefono);
				
				
				
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"registro con exito");
			    }catch (SQLException e) {
					System.out.println(e.getMessage());
			    }
			    }
		public void delete (int idoperadores) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tblcompanias WHERE idcompañia = ? ";
			try {
				Conexion conector = null;
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				
				pst.setInt(1,idoperadores);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idoperadores  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+idoperadores+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
		}
		public void create(String txtrazonsocial, String txtdireccion, String txtcorreo, String txtapellidos, String txttelefono, String txtfechacreacion,
				String txtweb) {
			// TODO Auto-generated method stub
			
		}
	}
