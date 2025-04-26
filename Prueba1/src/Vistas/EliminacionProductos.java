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

public class EliminacionProductos extends JFrame {

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
					EliminacionProductos frame = new EliminacionProductos();
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
	public EliminacionProductos() {
		setTitle("PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEliminacionDeRegistro = new JLabel("ELIMINACION DE REGISTRO");
		lblEliminacionDeRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminacionDeRegistro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEliminacionDeRegistro.setBounds(10, 55, 640, 42);
		contentPane.add(lblEliminacionDeRegistro);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 28, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("LOTE");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 125, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("00000001");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(334, 125, 306, 42);
		contentPane.add(textField);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEliminar.setBounds(238, 189, 195, 42);
		contentPane.add(btnEliminar);
		
		JTextArea txtrLaEliminacionSe = new JTextArea();
		txtrLaEliminacionSe.setText("LA ELIMINACION SE REALIZO EXITOSAMENTE");
		txtrLaEliminacionSe.setBounds(84, 264, 527, 146);
		contentPane.add(txtrLaEliminacionSe);
	}

}
