package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Facturacion extends JFrame {

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
					Facturacion frame = new Facturacion();
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
	public Facturacion() {
		setTitle("FACTURACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 726);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(208, 236, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(118, 48, 170, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrecios.setBounds(118, 108, 170, 42);
		contentPane.add(lblPrecios);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCantidad.setBounds(118, 159, 170, 42);
		contentPane.add(lblCantidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SAMSUNG SM-A215U NEGRO", "LG A567 "}));
		comboBox.setBounds(333, 56, 223, 30);
		contentPane.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setText("         845");
		textArea.setBounds(333, 116, 223, 31);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setText("                    3");
		textField.setBounds(333, 166, 223, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.setBounds(598, 11, 103, 30);
		contentPane.add(btnNewButton);
		
		JButton btnFacturar = new JButton("EMITIR COMPROBANTE");
		btnFacturar.setBounds(247, 212, 204, 42);
		contentPane.add(btnFacturar);
		
		JTextArea txtrBoletaDe = new JTextArea();
		txtrBoletaDe.setText("-------------------------------------------------------------------------------------\r\n                           BOLETA DE VENTA B001-00000001\r\n-------------------------------------------------------------------------------------\r\n\r\nMarca.................................................:\r\n\r\nModelo................................................:\r\n\r\nCantidad..............................................:\r\n\r\nImporte Compra........................................:\r\n\r\nImporte Dscto.........................................:\r\n\r\nImporte a Pagar.......................................:\r\n\r\nRegalo................................................:");
		txtrBoletaDe.setBounds(10, 271, 691, 405);
		contentPane.add(txtrBoletaDe);
		
		JLabel lblFacturacion = new JLabel("FACTURACION");
		lblFacturacion.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFacturacion.setBounds(258, -5, 210, 42);
		contentPane.add(lblFacturacion);
	}
}
