package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Conexion.Conexion;

public class PromotoresClass {
	
	Conexion conector = new Conexion();
	public int txtidpromotor;
	public int tipodocumento;
	public int documento;
	public String nombres;
	public String apellidos;
	public String direccion;
	public String correopersonal;
	public String orreocorp;
	public String telefono;

	public Conexion getConector() {
		return conector;
	}

	public void setConector(Conexion conector) {
		this.conector = conector;
	}

	public int getTxtidpromotor() {
		return txtidpromotor;
	}

	public void setTxtidpromotor(int txtidpromotor) {
		this.txtidpromotor = txtidpromotor;
	}

	public PromotoresClass(int tipodocumento, int documento, String nombres, String apellidos, String direccion,
			String correopersonal, String orreocorp, String telefono) {
		super();
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correopersonal = correopersonal;
		this.orreocorp = orreocorp;
		this.telefono = telefono;
	}

	public PromotoresClass() {
		super();
	}

	public int getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreopersonal() {
		return correopersonal;
	}

	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}

	public String getOrreocorp() {
		return orreocorp;
	}

	public void setOrreocorp(String orreocorp) {
		this.orreocorp = orreocorp;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	//

	public void create(int txtidpromotor,int tipodocumento, int documento,String nombres,String apellidos, String direccion,String correopersonal,String orreocorp,String telefono) {
		Connection dbConnetion = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblPromotores (tipodocumento,documento,nombres,apellidos,direccion,correopersonal,) values (?,?,?,?,?,?)";

		try {
			dbConnetion = conector.conectarBD();
			pst = dbConnetion.prepareStatement(script);

			pst.setLong(1, tipodocumento);
			pst.setLong(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correopersonal);
			pst.setString(6, orreocorp);
			pst.setString(6, telefono);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int txtidpromotor) {
		Connection conectarBD = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tblpromotores WHERE idagencias= ? ";
		try {
			Conexion conector = null;
			conectarBD = conector.conectarBD();
			pst = conectarBD.prepareStatement(script);

			pst.setInt(1, txtidpromotor);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + txtidpromotor + " ? ");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + txtidpromotor + " Eliminado Correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void Read( int txtidpromotor,  JTextField tipodocumento, JTextField documento, JTextField nombres, JTextField apellidos,
			JTextField direccion,JTextField correopersonal,JTextField orreocorp,JTextField telefono) {
		Connection conectarBD = null;
		PreparedStatement pst = null;

		String script = "SELECT * FROM tblagencias WHERE idagencia = ? ";
		
		try {
			conectarBD = conector.conectarBD();
			pst = conectarBD.prepareStatement(script);
			
			pst.setInt(1 ,txtidpromotor);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				direccion.setText(rs.getString(6));
				correopersonal.setText(rs.getString(3));
				orreocorp.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				
				
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
