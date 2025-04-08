package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.AgenciasClass;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Agencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtdireccion;
	private JTextField txtcorreoelectronico;
	private JTextField txttelefono;
	private JTextField txtweb;
	private JTextField txtidagencias;
	AgenciasClass cr = new AgenciasClass();
	private JTextField txtidcompañia;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agencias frame = new Agencias();
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
	public Agencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nombre = new JLabel("nombre");
		nombre.setBounds(40, 11, 63, 14);
		contentPane.add(nombre);
		
		JLabel apellido = new JLabel("apellido");
		apellido.setBounds(40, 36, 79, 14);
		contentPane.add(apellido);
		
		JLabel direccion = new JLabel("direccion");
		direccion.setBounds(40, 95, 63, 14);
		contentPane.add(direccion);
		
		JLabel correo = new JLabel("correo electronico");
		correo.setBounds(40, 120, 89, 14);
		contentPane.add(correo);
		
		JLabel telefono = new JLabel("telefono");
		telefono.setBounds(40, 151, 46, 14);
		contentPane.add(telefono);
		
		JButton btnguardaragencias = new JButton("Guardar");
		btnguardaragencias.setBounds(144, 227, 89, 23);
		btnguardaragencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtnombre.getText(),txtdireccion.getText(),txtcorreoelectronico.getText(),txttelefono.getText(),txtweb.getText(), Integer.parseInt(txtidagencias.getText()));
				
			}
		});
		contentPane.add(btnguardaragencias);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(169, 8, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(169, 33, 86, 20);
		contentPane.add(txtapellido);
		txtapellido.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(169, 92, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreoelectronico = new JTextField();
		txtcorreoelectronico.setBounds(169, 117, 86, 20);
		contentPane.add(txtcorreoelectronico);
		txtcorreoelectronico.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(169, 148, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel web = new JLabel("web");
		web.setBounds(40, 199, 46, 14);
		contentPane.add(web);
		
		txtweb = new JTextField();
		txtweb.setBounds(169, 196, 86, 20);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("idcompañia");
		lblNewLabel.setBounds(40, 176, 79, 14);
		contentPane.add(lblNewLabel);
		
		txtidagencias = new JTextField();
		txtidagencias.setBounds(169, 58, 86, 20);
		contentPane.add(txtidagencias);
		txtidagencias.setColumns(10);
		
		JButton deleteagencias = new JButton("delete");
		deleteagencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidagencias.getText()));
			}
			
		});
		deleteagencias.setBounds(307, 227, 89, 23);
		contentPane.add(deleteagencias);
		
		txtidcompañia = new JTextField();
		txtidcompañia.setColumns(10);
		txtidcompañia.setBounds(169, 173, 86, 20);
		contentPane.add(txtidcompañia);
		
		JLabel lblNewLabel_1 = new JLabel("idagencias");
		lblNewLabel_1.setBounds(40, 61, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnread = new JButton("buscar");
		btnread.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Read(Integer.parseInt(txtidcompañia.getText()), txtnombre, txtdireccion, txtcorreoelectronico, txttelefono, txtweb);
			}
		});
		btnread.setBounds(307, 172, 89, 23);
		contentPane.add(btnread);
	}

	
	}
	

