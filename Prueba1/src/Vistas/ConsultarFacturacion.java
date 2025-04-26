package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConsultarFacturacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarFacturacion frame = new ConsultarFacturacion();
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
	public ConsultarFacturacion() {
		setTitle("FACTURACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 727);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(177, 219, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.setBounds(598, 27, 103, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblConsultaDeComprobantes = new JLabel("CONSULTA DE COMPROBANTES");
		lblConsultaDeComprobantes.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblConsultaDeComprobantes.setBounds(152, 15, 428, 42);
		contentPane.add(lblConsultaDeComprobantes);
		
		JLabel lblNumeroDeComprobante = new JLabel("NUMERO DE COMPROBANTE");
		lblNumeroDeComprobante.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNumeroDeComprobante.setBounds(69, 124, 232, 42);
		contentPane.add(lblNumeroDeComprobante);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(124, 228, 204, 42);
		contentPane.add(btnConsultar);
		
		JTextArea txtrBoletaDe = new JTextArea();
		txtrBoletaDe.setText("-------------------------------------------------------------------------------------\r\n                           BOLETA DE VENTA B001-00000001\r\n-------------------------------------------------------------------------------------\r\n\r\nMarca.................................................:\r\n\r\nModelo................................................:\r\n\r\nCantidad..............................................:\r\n\r\nImporte Compra........................................:\r\n\r\nImporte Dscto.........................................:\r\n\r\nImporte a Pagar.......................................:\r\n\r\nRegalo................................................:");
		txtrBoletaDe.setBounds(10, 287, 691, 405);
		contentPane.add(txtrBoletaDe);
		
		txtB = new JTextField();
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtB.setText("B001-00000001");
		txtB.setBounds(382, 127, 242, 41);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnRegistroDeVentas = new JButton("REGISTRO DE VENTAS");
		btnRegistroDeVentas.setBounds(376, 228, 204, 42);
		contentPane.add(btnRegistroDeVentas);
	}
}
