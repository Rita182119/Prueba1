package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class ConsultarClientes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdni;
	private JLabel lbltitulo4;
	private JLabel lbldni;
	private JButton btnprocesar; 
	private JTextArea txtregistro;
	private JButton btnlista;
	private JButton btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarClientes frame = new ConsultarClientes();
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
	public ConsultarClientes() {
		setTitle("CLIENTES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 768, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo4 = new JLabel("CONSULTAR CLIENTES");
		lbltitulo4.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo4.setBounds(51, 24, 640, 42);
		contentPane.add(lbltitulo4);
		
		lbldni = new JLabel("DNI");
		lbldni.setHorizontalAlignment(SwingConstants.CENTER);
		lbldni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldni.setBounds(45, 115, 256, 42);
		contentPane.add(lbldni);
		
		txtdni = new JTextField();
		txtdni.setHorizontalAlignment(SwingConstants.CENTER);
		txtdni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtdni.setBounds(369, 115, 306, 42);
		contentPane.add(txtdni);
		txtdni.setColumns(10);
				
		txtregistro = new JTextArea();
		txtregistro.setBounds(369, 223, 306, 47);
		contentPane.add(txtregistro);
		
		btnlista = new JButton("LISTA DE CLIENTES");
		btnlista.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnlista.setBounds(278, 340, 195, 42);
		contentPane.add(btnlista);
		
		btnprocesar = new JButton("PROCESAR");
		btnprocesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnprocesar.setBounds(78, 223, 195, 42);
		contentPane.add(btnprocesar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(579, 11, 150, 32);
		contentPane.add(btnSalir);
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			actionPerformedbtnSalir(e);
		}
	}
	protected void actionPerformedbtnSalir(ActionEvent e) {
        dispose();
	}
}
       

