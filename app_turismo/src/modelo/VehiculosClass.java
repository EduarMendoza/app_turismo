package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Conexion.Conexion;

public class VehiculosClass {
	public String matricula ;
	public String marca ;
	public int puestos ;
	public String modelo ;
	public String numeromotor ;
	
	
	
	
	
	public VehiculosClass() {
		super();
		
		this.matricula = matricula;
		this.marca = marca;
		this.puestos = puestos;
		this.modelo = modelo;
		this.numeromotor = numeromotor;
		this.categoria = categoria;
	}
	public String categoria;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(String numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	//
	Conexion conector=new Conexion ();
	public void create(String nombre,String direccion,String correo,String telefono,String web,int  idcompania) {
		Connection dbConnetion = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblVehiculos (matricula,marca,puestos,modelo,numeromotor,categoria) values (?,?,?,?,?,?)";
		
		try {
			dbConnetion = conector.conectarBD();
			pst = dbConnetion.prepareStatement(script);
			
			pst.setString(1,matricula);
			pst.setString(2,marca);
			pst.setLong(3,puestos);
			pst.setString(4,modelo);
			pst.setString(5,numeromotor);
			pst.setString(6,categoria);
			
			
			
			
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"registro con exito");
		    }catch (SQLException e) {
				System.out.println(e.getMessage());
		    }
		    }
	public void delete (int matricula) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM  tblcompanias WHERE idcompañia = ? ";
		try {
			Conexion conector = null;
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			
			pst.setInt(1,matricula);
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + matricula  +" ? ");
			
			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"Registro No. "+matricula+" Eliminado Correctamente");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());		}
	}
	public void create(String txtrazonsocial, String txtdireccion, String txtcorreo, String txtapellidos, String txttelefono, String txtfechacreacion,
			String txtweb) {
		// TODO Auto-generated method stub
		
	}
}
