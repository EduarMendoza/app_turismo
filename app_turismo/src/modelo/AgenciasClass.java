package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Conexion.Conexion;

public class AgenciasClass {

	public int idagencias;
	public String nombre; 
	public String direccion; 
	public String correo;
	public String telefono;
	public String web;
	Conexion conector=new Conexion ();
	
	
	public AgenciasClass() {
		super();
	}
	public int getIdagencias() {
		return idagencias;
	}
	public void setIdagencias(int idagencias) {
		this.idagencias = idagencias;
	}
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
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
		
		public void create(String nombre,String direccion,String correo,String telefono,String web,int  idcompania) {
			Connection conectarBD = null;
			PreparedStatement pst = null;
			String script = "INSERT INTO tblagencias(nombre,direccion,correo,telefono,web,idcompañia) values (?,?,?,?,?,?)";
			
			try {
				conectarBD = conector.conectarBD();
				pst = conectarBD.prepareStatement(script);
				
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
		public void delete (int idagencia) {
			Connection conectarBD = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM  tblagencias WHERE idagencia= ? ";
			try {
				Conexion conector = null;
				conectarBD = conector.conectarBD();
				pst = conectarBD.prepareStatement(script);
				
				
				pst.setInt(1,idagencia);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idagencia  +" ? ");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null,"Registro No. "+idagencias+" Eliminado Correctamente");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());		}
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
	


