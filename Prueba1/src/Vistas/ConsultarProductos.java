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

public class ConsultarProductos extends JFrame {

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
					ConsultarProductos frame = new ConsultarProductos();
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
	public ConsultarProductos() {
		setTitle("PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultarLotes = new JLabel("CONSULTAR PRODUCTOS");
		lblConsultarLotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultarLotes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConsultarLotes.setBounds(43, 36, 640, 42);
		contentPane.add(lblConsultarLotes);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(571, 23, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("LOTE");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(37, 127, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setText("00000001");
		textField.setColumns(10);
		textField.setBounds(361, 127, 306, 42);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("PROCESAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(68, 248, 195, 42);
		contentPane.add(btnNewButton);
		
		JButton btnListaDeProductos = new JButton("LISTA DE PRODUCTOS");
		btnListaDeProductos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnListaDeProductos.setBounds(258, 400, 195, 42);
		contentPane.add(btnListaDeProductos);
		
		JTextArea txtrNLote = new JTextArea();
		txtrNLote.setText("N° LOTE....................:  00000001\r\nMARCA......................:  SAMSUNG\r\nMODELO.....................:  SM-A215U\r\nPRECIO.....................:  845\r\nCANTIDAD...................:  9\r\nBATERIA....................:  5000 mAh\r\nMEMORIA....................:  32 GB\r\nCOLOR......................:  NEGRO\r\nPROVEEDOR..................:  TELEFONIA MOVIL S.A.");
		txtrNLote.setBounds(311, 202, 410, 176);
		contentPane.add(txtrNLote);
	}

}
