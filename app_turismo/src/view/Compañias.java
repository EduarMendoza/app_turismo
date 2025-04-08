package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.CompañiasClass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Compañias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtrazonsocial;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txtapellidos;
	private JTextField txttelefono;
	private JTextField txtfechacreacion;
	private JTextField txtweb;
	private JLabel idcompañia;
	private JTextField txtidcompañia;
	private JButton deletecompañias;
	CompañiasClass cr = new CompañiasClass();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compañias frame = new Compañias();
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
	public Compañias() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("razon social");
		lblNewLabel.setBounds(38, 11, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("direccion");
		lblNewLabel_1.setBounds(38, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("correo");
		lblNewLabel_2.setBounds(38, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("telefono");
		lblNewLabel_3.setBounds(38, 86, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("fecha de creacion");
		lblNewLabel_4.setBounds(38, 111, 103, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("web");
		lblNewLabel_5.setBounds(38, 136, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtrazonsocial = new JTextField();
		txtrazonsocial.setBounds(151, 8, 86, 20);
		contentPane.add(txtrazonsocial);
		txtrazonsocial.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(151, 33, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(151, 58, 86, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(151, 83, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtfechacreacion = new JTextField();
		txtfechacreacion.setBounds(151, 108, 86, 20);
		contentPane.add(txtfechacreacion);
		txtfechacreacion.setColumns(10);
		
		txtweb = new JTextField();
		txtweb.setBounds(151, 133, 86, 20);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(148, 211, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			private JLabel txtapellidos;

			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create (txtrazonsocial.getText(),txtdireccion.getText(),txtcorreo.getText(),txtapellidos.getText(),txttelefono.getText(),txtfechacreacion.getText(),txtweb.getText());
				
			}
		});
		contentPane.add(btnNewButton);
		
		idcompañia = new JLabel("idcompañia");
		idcompañia.setBounds(38, 171, 74, 14);
		contentPane.add(idcompañia);
		
		txtidcompañia = new JTextField();
		txtidcompañia.setBounds(151, 164, 86, 20);
		contentPane.add(txtidcompañia);
		txtidcompañia.setColumns(10);
		
		deletecompañias = new JButton("delete");
		deletecompañias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CompañiasClass cr = null;
				cr.delete(Integer.parseInt(txtidcompañia.getText()));
			}
		});
		deletecompañias.setBounds(272, 211, 89, 23);
		contentPane.add(deletecompañias);
	}
}
