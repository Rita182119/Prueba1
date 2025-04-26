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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminacionClientes extends JFrame {

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
					EliminacionClientes frame = new EliminacionClientes();
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
	public EliminacionClientes() {
		setTitle("CLIENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 511);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(514, 34, 150, 32);
		contentPane.add(btnSalir);
		
		JLabel lblEliminacionDeRegistro = new JLabel("ELIMINACION DE REGISTRO");
		lblEliminacionDeRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminacionDeRegistro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEliminacionDeRegistro.setBounds(24, 61, 640, 42);
		contentPane.add(lblEliminacionDeRegistro);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(24, 148, 256, 42);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("70092915");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(348, 148, 306, 42);
		contentPane.add(textField);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEliminar.setBounds(252, 212, 195, 42);
		contentPane.add(btnEliminar);
		
		JTextArea txtrLaEliminacionSe = new JTextArea();
		txtrLaEliminacionSe.setText("LA ELIMINACION SE REALIZO EXITOSAMENTE");
		txtrLaEliminacionSe.setBounds(98, 287, 527, 146);
		contentPane.add(txtrLaEliminacionSe);
	}

}
