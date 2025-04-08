package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Conexion.Conexion;

public class ClientesClass {

	public int getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}

	public ClientesClass() {
		super();
	}

	Conexion conector = new Conexion();

	public int idclientes;
	public int tipodocumento;
	public int numdocumento;
	public String nombres;
	public String apellidos;
	public String eps;
	public String alergias;
	public String fechanacimento;
	public String correo;
	public String estadocivil;
	public String telefono;
	public String direccion;

	public int Tipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public int getNumdocumento() {
		return numdocumento;
	}

	public void setNumdocumento(int numdocumento) {
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

	public void create(int tipodocumento, int numdocumento, String nombres, String apellidos, String eps,
			String alergias, String fechanacimento, String correo, String estadocivil, String telefono,
			String direccion) {
		Connection dbConnetion = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblClientes (tipodocumento,numdocumento,nombres,apellidos,eps,alergias,fechanacimento,correo,estadocivil,telefono,direccion) values (?,?,?,?,?,?,?,?,?,?,?)";

		try {
			dbConnetion = conector.conectarBD();
			pst = dbConnetion.prepareStatement(script);

			pst.setLong(1, tipodocumento);
			pst.setLong(2, numdocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, eps);
			pst.setString(6, alergias);
			pst.setString(7, fechanacimento);
			pst.setString(8, correo);
			pst.setString(9, estadocivil);
			pst.setString(10, telefono);
			pst.setString(11, direccion);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete(int idclientes) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tblclientes WHERE idclientes= ? ";
		try {
			Conexion conector = null;
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idclientes);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idclientes + " ? ");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idclientes + " Eliminado Correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void Read(int idclientes, JTextField tipodocumento, JTextField numdocumento, JTextField nombres,
			JTextField apellidos, JTextField eps, JTextField alergias, JTextField fechanacimento, JTextField correo,
			JTextField estadocivil, JTextField telefono, JTextField direccion) {
		Connection conectarBD = null;
		PreparedStatement pst = null;

		String script = "SELECT * FROM tblclientes WHERE idclientes = ? ";

		try {
			conectarBD = conector.conectarBD();
			pst = conectarBD.prepareStatement(script);

			pst.setInt(1, idclientes);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				numdocumento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				eps.setText(rs.getString(6));
				alergias.setText(rs.getString(7));
				fechanacimento.setText(rs.getString(8));
				correo.setText(rs.getString(9));
				estadocivil.setText(rs.getString(10));
				telefono.setText(rs.getString(11));
				direccion.setText(rs.getString(12));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
