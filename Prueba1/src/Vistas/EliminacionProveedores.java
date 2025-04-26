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

public class EliminacionProveedores extends JFrame {

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
					EliminacionProveedores frame = new EliminacionProveedores();
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
	public EliminacionProveedores() {
		setTitle("PROVEEDORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEliminacionDeRegistro = new JLabel("ELIMINACION DE REGISTRO");
		lblEliminacionDeRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminacionDeRegistro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEliminacionDeRegistro.setBounds(10, 48, 640, 42);
		contentPane.add(lblEliminacionDeRegistro);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 21, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("RUC");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 118, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("20456552430");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(334, 118, 306, 42);
		contentPane.add(textField);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEliminar.setBounds(238, 182, 195, 42);
		contentPane.add(btnEliminar);
		
		JTextArea txtrLaEliminacionSe = new JTextArea();
		txtrLaEliminacionSe.setText("LA ELIMINACION SE REALIZO EXITOSAMENTE");
		txtrLaEliminacionSe.setBounds(84, 257, 527, 146);
		contentPane.add(txtrLaEliminacionSe);
	}

}
