package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.PaquetesClass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Paquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtxiddestino;
	private JTextField txtidorigen;
	private JTextField txtfechadeventa;
	private JTextField txthoradeventa;
	private JTextField txthoradesalida;
	private JTextField txtfechadeejecucion;
	private JTextField txtobservacion;
	PaquetesClass cr = new PaquetesClass();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paquetes frame = new Paquetes();
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
	public Paquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id destino");
		lblNewLabel.setBounds(42, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id origen");
		lblNewLabel_1.setBounds(42, 36, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("fecha de venta");
		lblNewLabel_2.setBounds(42, 61, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("hora de venta");
		lblNewLabel_3.setBounds(42, 86, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("hora de salida");
		lblNewLabel_4.setBounds(42, 111, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("fecha de ejecucion");
		lblNewLabel_5.setBounds(42, 136, 105, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("observacion");
		lblNewLabel_6.setBounds(42, 164, 73, 14);
		contentPane.add(lblNewLabel_6);
		
		txtxiddestino = new JTextField();
		txtxiddestino.setBounds(181, 8, 86, 20);
		contentPane.add(txtxiddestino);
		txtxiddestino.setColumns(10);
		
		txtidorigen = new JTextField();
		txtidorigen.setBounds(181, 33, 86, 20);
		contentPane.add(txtidorigen);
		txtidorigen.setColumns(10);
		
		txtfechadeventa = new JTextField();
		txtfechadeventa.setBounds(181, 58, 86, 20);
		contentPane.add(txtfechadeventa);
		txtfechadeventa.setColumns(10);
		
		txthoradeventa = new JTextField();
		txthoradeventa.setBounds(181, 83, 86, 20);
		contentPane.add(txthoradeventa);
		txthoradeventa.setColumns(10);
		
		txthoradesalida = new JTextField();
		txthoradesalida.setBounds(181, 108, 86, 20);
		contentPane.add(txthoradesalida);
		txthoradesalida.setColumns(10);
		
		txtfechadeejecucion = new JTextField();
		txtfechadeejecucion.setBounds(181, 133, 86, 20);
		contentPane.add(txtfechadeejecucion);
		txtfechadeejecucion.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(181, 161, 86, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(124, 209, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create (txtxiddestino.getText(),txtidorigen.getText(),txtfechadeventa.getText(),txthoradeventa.getText(),txthoradesalida.getText(),txtfechadeejecucion.getText(),txtobservacion.getText());
			}
			
		});
		contentPane.add(btnNewButton);
		
		JButton btndelete = new JButton("delete");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtxiddestino.getText()));
			}
		});
		btndelete.setBounds(277, 209, 89, 23);
		contentPane.add(btndelete);
	}
}
