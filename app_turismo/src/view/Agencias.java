package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		apellido.setBounds(40, 47, 79, 14);
		contentPane.add(apellido);
		
		JLabel direccion = new JLabel("direccion");
		direccion.setBounds(40, 83, 63, 14);
		contentPane.add(direccion);
		
		JLabel correo = new JLabel("correo electronico");
		correo.setBounds(40, 120, 89, 14);
		contentPane.add(correo);
		
		JLabel telefono = new JLabel("telefono");
		telefono.setBounds(40, 159, 46, 14);
		contentPane.add(telefono);
		
		JButton btnguardaragencias = new JButton("Guardar");
		btnguardaragencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Agencias cr = new Agencias();
				cr.create(txtnombre.getText(),txtapellido.getText(),txtdireccion.getText(),txtcorreoelectronico.getText(),txttelefono.getText(),txtweb.getText());
				
			}
		});
		btnguardaragencias.setBounds(144, 227, 89, 23);
		contentPane.add(btnguardaragencias);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(169, 8, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(169, 44, 86, 20);
		contentPane.add(txtapellido);
		txtapellido.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(169, 80, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreoelectronico = new JTextField();
		txtcorreoelectronico.setBounds(169, 117, 86, 20);
		contentPane.add(txtcorreoelectronico);
		txtcorreoelectronico.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(169, 156, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel web = new JLabel("web");
		web.setBounds(40, 192, 46, 14);
		contentPane.add(web);
		
		txtweb = new JTextField();
		txtweb.setBounds(169, 187, 86, 20);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
	}

	protected void create(String text, String text2, String text3, String text4, String text5, String text6) {
		// TODO Auto-generated method stub
		
	}
}
