package view;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.PromotoresClass;
import modelo.TiposMediosClass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TiposMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel txtnombre;
	private JTextField txtidtipomedios;
	private JTextField textField_1;
	private JTextField txtobservaciones;

	
	
	TiposMediosClass cr = new TiposMediosClass();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TiposMedios frame = new TiposMedios();
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
	public TiposMedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		txtnombre = new JPanel();
		txtnombre.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(txtnombre);
		txtnombre.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("idtipomedio");
		lblNewLabel.setBounds(74, 15, 68, 14);
		txtnombre.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(76, 55, 46, 14);
		txtnombre.add(lblNombre);
		
		JLabel lblNewLabel_1_1 = new JLabel("observaciones");
		lblNewLabel_1_1.setBounds(78, 90, 81, 14);
		txtnombre.add(lblNewLabel_1_1);
		
		txtidtipomedios = new JTextField();
		txtidtipomedios.setBounds(173, 12, 86, 20);
		txtnombre.add(txtidtipomedios);
		txtidtipomedios.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 51, 86, 20);
		txtnombre.add(textField_1);
		
		txtobservaciones = new JTextField();
		txtobservaciones.setColumns(10);
		txtobservaciones.setBounds(171, 85, 86, 20);
		txtnombre.add(txtobservaciones);
		
		JButton btnguardar = new JButton("guardar");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create( Integer.parseInt(txtidtipomedios.getText())
						,txtobservaciones.getText());
			}
			
		});
		btnguardar.setBounds(116, 181, 89, 23);
		txtnombre.add(btnguardar);
		
		JButton deleteidtipomedios = new JButton("delete");
		deleteidtipomedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidtipomedios.getText()));
			}
			
		});
		deleteidtipomedios.setBounds(264, 178, 89, 23);
		txtnombre.add(deleteidtipomedios);
	}

}
