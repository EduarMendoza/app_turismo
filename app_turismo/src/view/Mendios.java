package view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexion.Conexion;
import modelo.MediosClass;
import modelo.TiposMediosClass;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mendios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	public JTextField getTxtidmedios() {
		return txtidmedios;
	}

	public void setTxtidmedios(JTextField txtidmedios) {
		this.txtidmedios = txtidmedios;
	}

	private JTextField txtdescripcion;
	private JTextField txtidmedios;
	MediosClass cr = new MediosClass();
	private JTextField txtmedio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mendios frame = new Mendios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mendios() {
		addMouseListener(new MouseAdapter() {
			private JLabel nombre;
			private JLabel descripcion;

			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtnombre.getText(), txtdescripcion.getText(), Integer.parseInt(txtidmedios.getText()));
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(106, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("descripcion");
		lblNewLabel_1.setBounds(106, 87, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(179, 49, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtdescripcion = new JTextField();
		txtdescripcion.setBounds(179, 84, 86, 20);
		contentPane.add(txtdescripcion);
		txtdescripcion.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(140, 171, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel idmedios = new JLabel("idmedios");
		idmedios.setBounds(106, 131, 46, 14);
		contentPane.add(idmedios);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(179, 128, 86, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		JButton deletemedios = new JButton("delete");
		deletemedios.setBounds(277, 171, 89, 23);
		deletemedios.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidmedios.getText()));
			}
		});
		contentPane.add(deletemedios);
		
		JLabel lblNewLabel_2 = new JLabel("idmedio");
		lblNewLabel_2.setBounds(106, 21, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtmedio = new JTextField();
		txtmedio.setBounds(179, 18, 86, 20);
		contentPane.add(txtmedio);
		txtmedio.setColumns(10);
	}
}
