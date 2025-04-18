package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.ClientesClass;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texttipodocumento;
	private JTextField txtnumdocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txteps;
	private JTextField txtalergias;
	private JTextField txtfechanacimiento;
	private JTextField txtcorreo;
	private JTextField txtestadocivil;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JTextField txtidclientes;
	ClientesClass cliente = new ClientesClass();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel txttipodocumento = new JLabel("tipo documento");
		txttipodocumento.setBounds(20, 11, 74, 14);
		contentPane.add(txttipodocumento);

		JLabel numdocumento = new JLabel("numero de documento");
		numdocumento.setBounds(20, 36, 107, 14);
		contentPane.add(numdocumento);

		JLabel nombres = new JLabel("nombres");
		nombres.setBounds(20, 61, 46, 14);
		contentPane.add(nombres);

		JLabel apellidos = new JLabel("apellidos");
		apellidos.setBounds(20, 86, 46, 14);
		contentPane.add(apellidos);

		JLabel eps = new JLabel("eps");
		eps.setBounds(20, 111, 46, 14);
		contentPane.add(eps);

		JLabel alergias = new JLabel("alergias");
		alergias.setBounds(20, 136, 46, 14);
		contentPane.add(alergias);

		JLabel fechanacimento = new JLabel("fecha de nacimento");
		fechanacimento.setBounds(20, 161, 101, 14);
		contentPane.add(fechanacimento);

		JLabel correo = new JLabel("correo");
		correo.setBounds(20, 186, 46, 14);
		contentPane.add(correo);

		JLabel lblNewLabel_8 = new JLabel("estadocivil");
		lblNewLabel_8.setBounds(20, 211, 62, 14);
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("telefono");
		lblNewLabel_9.setBounds(20, 236, 46, 14);
		contentPane.add(lblNewLabel_9);

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(274, 157, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				cliente.create(Integer.parseInt(texttipodocumento.getText()),
						Integer.parseInt(txtnumdocumento.getText()), txtnombres.getText(), txtapellidos.getText(),
						txteps.getText(), txtalergias.getText(), txtfechanacimiento.getText(), txtcorreo.getText(),
						txtestadocivil.getText(), txttelefono.getText(), txtdireccion.getText());

			}
		});
		contentPane.add(btnNewButton);

		texttipodocumento = new JTextField();
		texttipodocumento.setBounds(131, 8, 86, 20);
		texttipodocumento.addMouseListener(new MouseAdapter() {
		});
		contentPane.add(texttipodocumento);
		texttipodocumento.setColumns(10);

		txtnumdocumento = new JTextField();
		txtnumdocumento.setBounds(131, 33, 86, 20);
		contentPane.add(txtnumdocumento);
		txtnumdocumento.setColumns(10);

		txtnombres = new JTextField();
		txtnombres.setBounds(131, 58, 86, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);

		txtapellidos = new JTextField();
		txtapellidos.setBounds(92, 83, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);

		txteps = new JTextField();
		txteps.setBounds(92, 108, 86, 20);
		contentPane.add(txteps);
		txteps.setColumns(10);

		txtalergias = new JTextField();
		txtalergias.setBounds(92, 133, 86, 20);
		contentPane.add(txtalergias);
		txtalergias.setColumns(10);

		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBounds(131, 158, 86, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);

		txtcorreo = new JTextField();
		txtcorreo.setBounds(92, 183, 86, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);

		txtestadocivil = new JTextField();
		txtestadocivil.setBounds(92, 208, 86, 20);
		contentPane.add(txtestadocivil);
		txtestadocivil.setColumns(10);

		txttelefono = new JTextField();
		txttelefono.setBounds(92, 233, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);

		txtdireccion = new JTextField();
		txtdireccion.setBounds(131, 256, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);

		JLabel lblNewLabel = new JLabel("direccion");
		lblNewLabel.setBounds(20, 261, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("idclientes");
		lblNewLabel_1.setBounds(249, 11, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtidclientes = new JTextField();
		txtidclientes.setBounds(305, 8, 86, 20);
		contentPane.add(txtidclientes);
		txtidclientes.setColumns(10);

		JButton btnNewButton_1 = new JButton("delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.delete(Integer.parseInt(txtidclientes.getText()));

			}
		});
		btnNewButton_1.setBounds(274, 207, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnbuscar = new JButton("buscar");
		btnbuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cliente.Read(Integer.parseInt(txtidclientes.getText()), texttipodocumento, txtnumdocumento, txtnombres,
						txtapellidos, txteps, txtalergias, txtfechanacimiento, txtcorreo, txtestadocivil, txttelefono,
						txtdireccion);

			}
		});
		btnbuscar.addMouseListener(new MouseAdapter() {
		});
		btnbuscar.setBounds(274, 107, 89, 23);
		contentPane.add(btnbuscar);
	}
}
