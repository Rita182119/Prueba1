package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class EliminacionClientes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdni;
	private JButton btnSalir;
	private JLabel lbltitulo11;
	private	JLabel lbldni;
	private	JButton btnEliminar;
	private	JTextArea txteliminacion;
	
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 723, 511);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		lbltitulo11 = new JLabel("ELIMINACION DE REGISTRO");
		lbltitulo11.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo11.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo11.setBounds(24, 61, 640, 42);
		contentPane.add(lbltitulo11);
		
		lbldni = new JLabel("DNI");
		lbldni.setHorizontalAlignment(SwingConstants.CENTER);
		lbldni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldni.setBounds(24, 148, 256, 42);
		contentPane.add(lbldni);
		
		txtdni = new JTextField();
		txtdni.setHorizontalAlignment(SwingConstants.CENTER);
		txtdni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtdni.setColumns(10);
		txtdni.setBounds(348, 148, 306, 42);
		contentPane.add(txtdni);
				
		txteliminacion = new JTextArea();
		txteliminacion.setBounds(98, 287, 527, 146);
		contentPane.add(txteliminacion);
				
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEliminar.setBounds(252, 212, 195, 42);
		contentPane.add(btnEliminar);		
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(514, 34, 150, 32);
		contentPane.add(btnSalir);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnSalir) {
			actionPerformedbtnSalir (e);
		}	
	}
	protected void actionPerformedbtnSalir(ActionEvent e) {
		dispose();
	}	
}
