package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexion.Conexion;

public class ClientesClass {

	public String tipodocumento ;
	public String numdocumento ;
	public String nombres;
	public String apellidos ;
	public String eps;
	public String alergias;
	public String fechanacimento ;
	public String correo ;
	public String estadocivil;
	public String telefono ;
	public String direccion ;
	public String Tipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNumdocumento() {
		return numdocumento;
	}
	public void setNumdocumento(String numdocumento) {
		this.numdocumento = numdocumento;
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
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getFechanacimento() {
		return fechanacimento;
	}
	public void setFechanacimento(String fechanacimento) {
		this.fechanacimento = fechanacimento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public class Agencias{
		Conexion conector=new Conexion ();
		public void create(String nombre,String direccion,String correo,String telefono,String web,int  idcompania) {
			Connection dbConnetion = null;
			PreparedStatement pst = null;//preparar la trx
			String script = "INSERT INTO tblClientes (tipodocumento,numdocumento,nombres,apellidos,eps,alergias,fechanacimento,correo,estadocivil,telefono,direccion) values (?,?,?,?,?,?,?,?,?,?,?,?)";
			
			try {
				dbConnetion = conector.conectarBD();
				pst = dbConnetion.prepareStatement(script);
				
				pst.setString(1,tipodocumento);
				pst.setString(2,numdocumento);
				pst.setString(3,nombres);
				pst.setString(4,apellidos);
				pst.setString(5,eps);
				pst.setString(6,alergias);
				pst.setString(7,fechanacimento);
				pst.setString(8,correo);
                pst.setString(9,estadocivil);
				pst.setString(10,telefono);
				pst.setString(11,direccion);
				
				
				
				
				
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"registro con exito");
			    }catch (SQLException e) {
					System.out.println(e.getMessage());
			    }
			    }
	}
}