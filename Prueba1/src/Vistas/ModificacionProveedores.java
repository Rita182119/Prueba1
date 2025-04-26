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

public class ModificacionProveedores extends JFrame {

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
					ModificacionProveedores frame = new ModificacionProveedores();
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
	public ModificacionProveedores() {
		setTitle("PROVEEDORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 456);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificacionDeRegistro = new JLabel("MODIFICACION DE REGISTRO");
		lblModificacionDeRegistro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModificacionDeRegistro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblModificacionDeRegistro.setBounds(51, 37, 370, 42);
		contentPane.add(lblModificacionDeRegistro);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(471, 37, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("RUC");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 119, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("20456552430");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(292, 119, 288, 42);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("RAZON SOCIAL");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(33, 245, 256, 42);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("TELEFONIA MOVIL S.A.");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(299, 246, 288, 42);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("PROCESAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(241, 184, 195, 42);
		contentPane.add(btnNewButton);
		
		JTextArea txtrLaModificacionDel = new JTextArea();
		txtrLaModificacionDel.setToolTipText("");
		txtrLaModificacionDel.setText("LA MODIFICACION DEL REGISTRO\r\nSE REALIZO CORRECTAMENTE\r\n\r\n");
		txtrLaModificacionDel.setBounds(299, 335, 300, 41);
		contentPane.add(txtrLaModificacionDel);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnModificar.setBounds(69, 335, 195, 42);
		contentPane.add(btnModificar);
	}

}
