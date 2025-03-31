package modelo;

import javax.swing.JOptionPane;

import Conexion.Conexion;


public class Test {

	public static void main(String[] args) {
		Conexion Test= new Conexion();
		
		if (Test.conectarBD() != null) {
			JOptionPane.showConfirmDialog(null, "conectado a la base de datos");
		}else {
			JOptionPane.showConfirmDialog(null, "no conectado a la base de datos");
		}
	}

}
