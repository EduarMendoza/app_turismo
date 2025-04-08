package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Conexion.Conexion;

public class CompañiasClass {
	CompañiasClass cr = new CompañiasClass ();
	public CompañiasClass(int idcompañia, String razonsocial, String direccion, String correo, String telefono,
			String fechacreacion, String web, Conexion conector) {
		super();
		this.idcompañia = idcompañia;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.fechacreacion = fechacreacion;
		this.web = web;
		this.conector = conector;
	}
	public CompañiasClass() {
		super();
	}
	public int idcompañia = 0;
	public String razonsocial ;
	public String direccion ;
	public int getIdcompañia() {
		return idcompañia;
	}
	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
	}
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
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
	
		Conexion conector = new Conexion ();
		public void create(String nombre,String direccion,String correo,String telefono,String web,int  idcompania) {
			Connection conectarBD = null;
			PreparedStatement pst = null;
			String script = "INSERT INTO tblCompañia (razonsocial,direccion,correo,telefono,razonsocial) values (?,?,?,?,?,?)";
			
			try {
				conectarBD = conector.conectarBD();
				pst = conectarBD.prepareStatement(script);
				
				pst.setString(1,razonsocial);
				pst.setString(2,direccion);
				pst.setString(3,correo);
				pst.setString(4,telefono);
				pst.setString(5,fechacreacion);
				pst.setString(6,web);
				
				
				
				
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"registro con exito");
			    }catch (SQLException e) {
					System.out.println(e.getMessage());
			    }
			    }
		
		public void delete (int idcompañia) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tblcompanias WHERE idcompañia = ? ";
			try {
				Conexion conector = null;
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				
				pst.setInt(1,idcompañia);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idcompañia  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+idcompañia+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
		}
		public void create(String txtrazonsocial, String txtdireccion, String txtcorreo, String txtapellidos, String txttelefono, String txtfechacreacion,
				String txtweb) {
			// TODO Auto-generated method stub
			
		}
		
		public void Read(int idagencia, JTextField nombre, JTextField direccion, JTextField correo, JTextField telefono,
				JTextField web) {
			Connection conectarBD = null;
			PreparedStatement pst = null;

			String script = "SELECT * FROM tblagencias WHERE idagencia = ? ";
			
			try {
				conectarBD = conector.conectarBD();
				pst = conectarBD.prepareStatement(script);
				
				pst.setInt(1, idagencia);
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {
					nombre.setText(rs.getString(2));
					direccion.setText(rs.getString(3));
					correo.setText(rs.getString(4));
					telefono.setText(rs.getString(5));
					web.setText(rs.getString(6));
					
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		}
	}


