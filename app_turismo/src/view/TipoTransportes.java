package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.TipoTransportesClass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TipoTransportes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservacion;
	TipoTransportesClass cr = new TipoTransportesClass();
	private JTextField txttipotransportes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipoTransportes frame = new TipoTransportes();
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
	public TipoTransportes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(70, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("observación");
		lblNewLabel_1.setBounds(70, 78, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(204, 29, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(204, 75, 86, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			public void TipoTransportes(MouseEvent e) {
				cr.create (txtobservacion.getText(),txtnombre.getText(),txttipotransportes.getText());
			};
			
			
		});
		btnNewButton.setBounds(143, 184, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("idtipotransporte");
		lblNewLabel_2.setBounds(56, 118, 87, 14);
		contentPane.add(lblNewLabel_2);
		
		txttipotransportes = new JTextField();
		txttipotransportes.setBounds(204, 115, 86, 20);
		contentPane.add(txttipotransportes);
		txttipotransportes.setColumns(10);
		
		JButton btntipotransportes = new JButton("delete");
		btntipotransportes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txttipotransportes.getText()));
			}
			
		});
		btntipotransportes.setBounds(285, 184, 89, 23);
		contentPane.add(btntipotransportes);
	}

}
