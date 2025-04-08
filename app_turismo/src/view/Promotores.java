package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.PromotoresClass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Promotores extends JFrame {
	PromotoresClass promotores = new PromotoresClass();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodedocumento;
	private JTextField txtdocumento;
	private JTextField txtnombre;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txtcorreopersonal;
	private JTextField txtcorreodelacorporacion;
	private JTextField txtfechadenacimiento;
	private JTextField txttelefono;
	
	
	private JTextField txtidpromotor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promotores frame = new Promotores();
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
	public Promotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("tipo de documento");
		lblNewLabel.setBounds(52, 23, 101, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("documento");
		lblNewLabel_1.setBounds(52, 48, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("nombres");
		lblNewLabel_2.setBounds(52, 73, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("apellidos");
		lblNewLabel_3.setBounds(52, 98, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("direccion");
		lblNewLabel_4.setBounds(52, 123, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("correo personal");
		lblNewLabel_5.setBounds(52, 148, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("correo de la corporacion");
		lblNewLabel_6.setBounds(52, 173, 118, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("fecha de nacimiento");
		lblNewLabel_7.setBounds(52, 203, 101, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("telefono");
		lblNewLabel_8.setBounds(52, 228, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		txttipodedocumento = new JTextField();
		txttipodedocumento.setBounds(180, 20, 86, 20);
		contentPane.add(txttipodedocumento);
		txttipodedocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(180, 45, 86, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(180, 70, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(180, 95, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(180, 120, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreopersonal = new JTextField();
		txtcorreopersonal.setBounds(180, 145, 86, 20);
		contentPane.add(txtcorreopersonal);
		txtcorreopersonal.setColumns(10);
		
		txtcorreodelacorporacion = new JTextField();
		txtcorreodelacorporacion.setBounds(180, 170, 86, 20);
		contentPane.add(txtcorreodelacorporacion);
		txtcorreodelacorporacion.setColumns(10);
		
		txtfechadenacimiento = new JTextField();
		txtfechadenacimiento.setBounds(180, 200, 86, 20);
		contentPane.add(txtfechadenacimiento);
		txtfechadenacimiento.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(180, 225, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				promotores.create( Integer.parseInt(txtdocumento.getText()), Integer.parseInt(txttipodedocumento.getText()), Integer.parseInt(txtidpromotor.getText())
						,txtapellidos.getText(),txtdireccion.getText()
						,txtcorreopersonal.getText(),txtfechadenacimiento.getText(),txttelefono.getText(),txtnombre.getText());
			}
				
			}
		);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666542_save_icon.png"));
		btnNewButton.setBounds(301, 109, 67, 43);
		contentPane.add(btnNewButton);
		
		JButton deleteidpromotor = new JButton("borrar");
		deleteidpromotor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				promotores.delete(Integer.parseInt(txtidpromotor.getText()));
			}
		});
		deleteidpromotor.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564502_basket_delete_remove_icon.png"));
		deleteidpromotor.setBounds(313, 182, 46, 57);
		contentPane.add(deleteidpromotor);
		
		JLabel lblNewLabel_9 = new JLabel("idpromotor");
		lblNewLabel_9.setBounds(52, -2, 77, 14);
		contentPane.add(lblNewLabel_9);
		
		txtidpromotor = new JTextField();
		txtidpromotor.setBounds(180, -5, 86, 20);
		contentPane.add(txtidpromotor);
		txtidpromotor.setColumns(10);
		
		JButton btnbuscar = new JButton("buscar");
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btnbuscar.setBounds(291, 44, 89, 23);
		contentPane.add(btnbuscar);
	}
	
}
