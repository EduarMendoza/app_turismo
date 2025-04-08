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

public class Operadores extends JFrame {
	Operadores cr = new Operadores();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodedocumento;
	private JTextField txtnumerodedocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txtcorreoelectronico;
	private JTextField txttelefono;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operadores frame = new Operadores();
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
	public Operadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("tipo de documento");
		lblNewLabel.setBounds(43, 11, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("numero de documento");
		lblNewLabel_1.setBounds(43, 36, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("nombres");
		lblNewLabel_2.setBounds(43, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("apellidos");
		lblNewLabel_3.setBounds(43, 86, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("correo electronico");
		lblNewLabel_4.setBounds(43, 143, 89, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("telefono");
		lblNewLabel_5.setBounds(43, 168, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("direccion");
		lblNewLabel_6.setBounds(43, 111, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(166, 227, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create (txttipodedocumento.getText(),txtdireccion.getText(),txtnumerodedocumento.getText(),txttelefono.getText(),txtnombres.getText(),txtapellidos.getText(),txtcorreoelectronico.getText());
			}
		});
		contentPane.add(btnNewButton);
		
		txttipodedocumento = new JTextField();
		txttipodedocumento.setBounds(166, 8, 86, 20);
		contentPane.add(txttipodedocumento);
		txttipodedocumento.setColumns(10);
		
		txtnumerodedocumento = new JTextField();
		txtnumerodedocumento.setBounds(166, 33, 86, 20);
		contentPane.add(txtnumerodedocumento);
		txtnumerodedocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(166, 58, 86, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(166, 83, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(166, 110, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreoelectronico = new JTextField();
		txtcorreoelectronico.setBounds(166, 140, 86, 20);
		contentPane.add(txtcorreoelectronico);
		txtcorreoelectronico.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(166, 165, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel idoperador = new JLabel("idoperador");
		idoperador.setBounds(43, 193, 89, 14);
		contentPane.add(idoperador);
		
		JTextField txtidoperador = new JTextField();
		txtidoperador.setBounds(166, 190, 86, 20);
		contentPane.add(txtidoperador);
		txtidoperador.setColumns(10);
		
		JButton deleteoperador = new JButton("delete");
		deleteoperador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidoperador.getText()));
			}
		});
		deleteoperador.setBounds(303, 227, 89, 23);
		contentPane.add(deleteoperador);
	}

	protected void delete(int int1) {
		// TODO Auto-generated method stub
		
	}

	protected void create(String txttipodedocumento, String txtdireccion, String txtnumerodedocumento, String txtapellidos, String txttelefono, String txtnombres,
			String txtapellidos1) {
		// TODO Auto-generated method stub
		
	}

}
