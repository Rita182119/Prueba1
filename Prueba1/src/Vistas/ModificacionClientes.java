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

public class ModificacionClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificacionClientes frame = new ModificacionClientes();
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
	public ModificacionClientes() {
		setTitle("CLIENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificacionDeRegistro = new JLabel("MODIFICACION DE REGISTRO");
		lblModificacionDeRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificacionDeRegistro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblModificacionDeRegistro.setBounds(21, 50, 640, 42);
		contentPane.add(lblModificacionDeRegistro);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(21, 137, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("70092915");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(345, 137, 306, 42);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("NOMBRES Y APELLIDOS");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(21, 273, 256, 42);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("ALEXIS JANPIER ESPINOZA GARCIA");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(355, 274, 306, 42);
		contentPane.add(textField_1);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnModificar.setBounds(55, 350, 195, 42);
		contentPane.add(btnModificar);
		
		JTextArea txtrLaModificacionSe = new JTextArea();
		txtrLaModificacionSe.setText("LA MODIFICACION SE REALIZO EXITOSAMENTE");
		txtrLaModificacionSe.setBounds(345, 350, 316, 53);
		contentPane.add(txtrLaModificacionSe);
		
		JButton btnProcesar = new JButton("PROCESAR");
		btnProcesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnProcesar.setBounds(250, 200, 195, 42);
		contentPane.add(btnProcesar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(511, 23, 150, 32);
		contentPane.add(btnSalir);
	}

}
