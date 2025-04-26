package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class AltaClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtAlexisJanpierEspinoza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaClientes frame = new AltaClientes();
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
	public AltaClientes() {
		setTitle("CLIENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAltaDeClientes = new JLabel("ALTA DE CLIENTES");
		lblAltaDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaDeClientes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAltaDeClientes.setBounds(10, 41, 640, 42);
		contentPane.add(lblAltaDeClientes);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 117, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("70092915");
		textField.setColumns(10);
		textField.setBounds(334, 117, 306, 42);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("NOMBRES Y APELLIDOS");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 212, 256, 42);
		contentPane.add(lblNewLabel_1_1);
		
		txtAlexisJanpierEspinoza = new JTextField();
		txtAlexisJanpierEspinoza.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlexisJanpierEspinoza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAlexisJanpierEspinoza.setText("ALEXIS JANPIER ESPINOZA GARCIA");
		txtAlexisJanpierEspinoza.setColumns(10);
		txtAlexisJanpierEspinoza.setBounds(334, 215, 306, 42);
		contentPane.add(txtAlexisJanpierEspinoza);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrar.setBounds(48, 335, 195, 42);
		contentPane.add(btnRegistrar);
		
		JTextArea txtrElRegistroSe = new JTextArea();
		txtrElRegistroSe.setText("EL REGISTRO SE REALIZO CORRECTAMENTE");
		txtrElRegistroSe.setBounds(334, 330, 306, 47);
		contentPane.add(txtrElRegistroSe);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 23, 150, 32);
		contentPane.add(btnSalir);
	}

}
