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

public class AltaProovedores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtPeruimporta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaProovedores frame = new AltaProovedores();
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
	public AltaProovedores() {
		setTitle("PROVEEDORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroDeProveedores = new JLabel("REGISTRO DE PROVEEDORES");
		lblRegistroDeProveedores.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRegistroDeProveedores.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRegistroDeProveedores.setBounds(72, 32, 370, 42);
		contentPane.add(lblRegistroDeProveedores);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(492, 32, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("RUC");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 114, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("RAZON SOCIAL");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(31, 193, 256, 42);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("20456552430");
		textField.setBounds(313, 114, 288, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtPeruimporta = new JTextField();
		txtPeruimporta.setHorizontalAlignment(SwingConstants.CENTER);
		txtPeruimporta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPeruimporta.setText("TELEFONIA MOVIL S.A.");
		txtPeruimporta.setColumns(10);
		txtPeruimporta.setBounds(313, 193, 288, 42);
		contentPane.add(txtPeruimporta);
		
		JButton btnNewButton = new JButton("PROCESAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(72, 307, 195, 42);
		contentPane.add(btnNewButton);
		
		JTextArea txtrElRegistroSe = new JTextArea();
		txtrElRegistroSe.setText("EL REGISTRO SE REALIZO CORRECTAMENTE");
		txtrElRegistroSe.setBounds(313, 307, 300, 41);
		contentPane.add(txtrElRegistroSe);
	}
}
