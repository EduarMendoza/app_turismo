package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.VehiculosClass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vahiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmatricula;
	private JTextField txtmarca;
	private JTextField txtpuestos;
	private JTextField txtmodelo;
	private JTextField txtnumeromotor;
	private JTextField txtcategoria;
	VehiculosClass cr = new VehiculosClass();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vahiculos frame = new Vahiculos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Vahiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("matricula");
		lblNewLabel.setBounds(57, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("marca");
		lblNewLabel_1.setBounds(57, 47, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("puestos");
		lblNewLabel_2.setBounds(57, 72, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("modelo");
		lblNewLabel_3.setBounds(57, 97, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("numero de motor");
		lblNewLabel_4.setBounds(57, 122, 105, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("categoria");
		lblNewLabel_5.setBounds(57, 147, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtmatricula = new JTextField();
		txtmatricula.setBounds(192, 19, 86, 20);
		contentPane.add(txtmatricula);
		txtmatricula.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Guardar");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				cr.create (txtmatricula.getText(),txtmarca.getText(),txtpuestos.getText(),txtmodelo.getText(),txtnumeromotor.getText(),Integer.parseInt(txtcategoria.getText()));
			}
		});
		btnNewButton_4.setBounds(155, 207, 89, 23);
		contentPane.add(btnNewButton_4);
		
		txtmarca = new JTextField();
		txtmarca.setBounds(192, 44, 86, 20);
		contentPane.add(txtmarca);
		txtmarca.setColumns(10);
		
		txtpuestos = new JTextField();
		txtpuestos.setBounds(192, 69, 86, 20);
		contentPane.add(txtpuestos);
		txtpuestos.setColumns(10);
		
		txtmodelo = new JTextField();
		txtmodelo.setBounds(192, 94, 86, 20);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		txtnumeromotor = new JTextField();
		txtnumeromotor.setBounds(192, 119, 86, 20);
		contentPane.add(txtnumeromotor);
		txtnumeromotor.setColumns(10);
		
		txtcategoria = new JTextField();
		txtcategoria.setBounds(192, 144, 86, 20);
		contentPane.add(txtcategoria);
		txtcategoria.setColumns(10);
		
		JButton deletevehiculo = new JButton("delete");
		deletevehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtmatricula.getText()));
			}
		});
		deletevehiculo.setBounds(304, 207, 89, 23);
		contentPane.add(deletevehiculo);
	}

}
