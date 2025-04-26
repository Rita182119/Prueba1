package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class AltaProductos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLg;
	private JTextField txtA;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField txtMah;
	private JTextField txtgb;
	private JTextField txtNegro;
	private JTextField txtTelefoniaMovilSac;
	private JTextField txtCelularesimport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaProductos frame = new AltaProductos();
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
	public AltaProductos() {
		setTitle("PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 723);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(514, 36, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblRegistroDeProductos = new JLabel("REGISTRO DE PRODUCTOS");
		lblRegistroDeProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroDeProductos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRegistroDeProductos.setBounds(140, 28, 407, 42);
		contentPane.add(lblRegistroDeProductos);
		
		JLabel lblNewLabel_1 = new JLabel("MARCA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(24, 155, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		txtLg = new JTextField();
		txtLg.setText("SAMSUNG");
		txtLg.setHorizontalAlignment(SwingConstants.CENTER);
		txtLg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLg.setColumns(10);
		txtLg.setBounds(348, 156, 306, 42);
		contentPane.add(txtLg);
		
		JLabel lblNewLabel_1_1 = new JLabel("MODELO");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(24, 208, 256, 42);
		contentPane.add(lblNewLabel_1_1);
		
		txtA = new JTextField();
		txtA.setText("SM-A215U");
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setColumns(10);
		txtA.setBounds(348, 209, 306, 42);
		contentPane.add(txtA);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrar.setBounds(58, 631, 195, 42);
		contentPane.add(btnRegistrar);
		
		JTextArea txtrElRegistroSe = new JTextArea();
		txtrElRegistroSe.setText("EL REGISTRO SE REALIZO CORRECTAMENTE");
		txtrElRegistroSe.setBounds(348, 626, 306, 47);
		contentPane.add(txtrElRegistroSe);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PRECIO");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(24, 261, 256, 42);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText("800");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(348, 262, 306, 42);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("LOTE");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(24, 107, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setText("00000001");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(348, 107, 306, 42);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("BATERIA");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2.setBounds(24, 381, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		txtMah = new JTextField();
		txtMah.setText("5000 mAh");
		txtMah.setHorizontalAlignment(SwingConstants.CENTER);
		txtMah.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMah.setColumns(10);
		txtMah.setBounds(348, 382, 306, 42);
		contentPane.add(txtMah);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("MEMORIA");
		lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2_1.setBounds(24, 443, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("COLOR");
		lblNewLabel_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2_1_1.setBounds(24, 505, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2_1_1);
		
		txtgb = new JTextField();
		txtgb.setText("64GB");
		txtgb.setHorizontalAlignment(SwingConstants.CENTER);
		txtgb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtgb.setColumns(10);
		txtgb.setBounds(348, 443, 306, 42);
		contentPane.add(txtgb);
		
		txtNegro = new JTextField();
		txtNegro.setText("NEGRO");
		txtNegro.setHorizontalAlignment(SwingConstants.CENTER);
		txtNegro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNegro.setColumns(10);
		txtNegro.setBounds(348, 506, 306, 42);
		contentPane.add(txtNegro);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("PROVEEDOR");
		lblNewLabel_1_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(24, 568, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1);
		
		txtTelefoniaMovilSac = new JTextField();
		txtTelefoniaMovilSac.setText("TELEFONIA MOVIL S.A.C.");
		txtTelefoniaMovilSac.setHorizontalAlignment(SwingConstants.CENTER);
		txtTelefoniaMovilSac.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTelefoniaMovilSac.setColumns(10);
		txtTelefoniaMovilSac.setBounds(348, 573, 306, 42);
		contentPane.add(txtTelefoniaMovilSac);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1 = new JLabel("CANTIDAD");
		lblNewLabel_1_1_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2_1_1_1_1.setBounds(24, 328, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1_1);
		
		txtCelularesimport = new JTextField();
		txtCelularesimport.setText("6");
		txtCelularesimport.setHorizontalAlignment(SwingConstants.CENTER);
		txtCelularesimport.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCelularesimport.setColumns(10);
		txtCelularesimport.setBounds(348, 328, 306, 42);
		contentPane.add(txtCelularesimport);
	}
}
