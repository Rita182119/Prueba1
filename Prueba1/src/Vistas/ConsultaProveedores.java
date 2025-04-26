package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ConsultaProveedores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaProveedores frame = new ConsultaProveedores();
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
	public ConsultaProveedores() {
		setTitle("PROVEEDORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 468);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultarProveedor = new JLabel("CONSULTA DE PROVEEDORES");
		lblConsultarProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultarProveedor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConsultarProveedor.setBounds(16, 38, 640, 42);
		contentPane.add(lblConsultarProveedor);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(544, 25, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("RUC");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 129, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("20456552430");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(334, 129, 306, 42);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("PROCESAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(43, 237, 195, 42);
		contentPane.add(btnNewButton);
		
		JTextArea txtrTelefonia = new JTextArea();
		txtrTelefonia.setText("20456552430 - TELEFONIA MOVIL S.A.");
		txtrTelefonia.setBounds(334, 237, 306, 47);
		contentPane.add(txtrTelefonia);
		
		JButton btnListaDeProveedores = new JButton("LISTA DE PROVEEDORES");
		btnListaDeProveedores.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnListaDeProveedores.setBounds(243, 354, 195, 42);
		contentPane.add(btnListaDeProveedores);
	}

}
