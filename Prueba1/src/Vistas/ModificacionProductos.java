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

public class ModificacionProductos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtgb;
	private JTextField textField_7;
	private JTextField txtTelefoniaMovilSa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificacionProductos frame = new ModificacionProductos();
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
	public ModificacionProductos() {
		setTitle("PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 721);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificacionDeProductos = new JLabel("MODIFICACION DE PRODUCTOS");
		lblModificacionDeProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificacionDeProductos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblModificacionDeProductos.setBounds(126, 11, 407, 42);
		contentPane.add(lblModificacionDeProductos);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 19, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("LOTE");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(36, 90, 166, 42);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setText("00000001");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(214, 91, 219, 42);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("MARCA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 138, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("SAMSUNG");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(334, 139, 306, 42);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MODELO");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 191, 256, 42);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText("SM-A215U");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(334, 192, 306, 42);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PRECIO");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 244, 256, 42);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setText("845");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(334, 245, 306, 42);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1 = new JLabel("CANTIDAD");
		lblNewLabel_1_1_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2_1_1_1_1.setBounds(10, 311, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setText("9");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(334, 311, 306, 42);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("BATERIA");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2.setBounds(10, 364, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setText("5000 mAh");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(334, 365, 306, 42);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("MEMORIA");
		lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2_1.setBounds(10, 426, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		txtgb = new JTextField();
		txtgb.setText("32GB");
		txtgb.setHorizontalAlignment(SwingConstants.CENTER);
		txtgb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtgb.setColumns(10);
		txtgb.setBounds(334, 426, 306, 42);
		contentPane.add(txtgb);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("COLOR");
		lblNewLabel_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2_1_1.setBounds(10, 488, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2_1_1);
		
		textField_7 = new JTextField();
		textField_7.setText("NEGRO");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(334, 489, 306, 42);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("PROVEEDOR");
		lblNewLabel_1_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(10, 551, 256, 42);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1);
		
		txtTelefoniaMovilSa = new JTextField();
		txtTelefoniaMovilSa.setText("TELEFONIA MOVIL S.A.");
		txtTelefoniaMovilSa.setHorizontalAlignment(SwingConstants.CENTER);
		txtTelefoniaMovilSa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTelefoniaMovilSa.setColumns(10);
		txtTelefoniaMovilSa.setBounds(334, 556, 306, 42);
		contentPane.add(txtTelefoniaMovilSa);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnModificar.setBounds(44, 614, 195, 42);
		contentPane.add(btnModificar);
		
		JTextArea txtrLaModificacionSe = new JTextArea();
		txtrLaModificacionSe.setText("LA MODIFICACION SE REALIZO CORRECTAMENTE");
		txtrLaModificacionSe.setBounds(319, 609, 335, 49);
		contentPane.add(txtrLaModificacionSe);
		
		JButton btnProcesar = new JButton("PROCESAR");
		btnProcesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnProcesar.setBounds(481, 96, 150, 32);
		contentPane.add(btnProcesar);
	}
}
