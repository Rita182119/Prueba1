package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ModificacionClientes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdni;
	private JTextField txtnomyapelli;
	private JLabel lbltitulo15;
	private	JLabel lbldni;
	private	JLabel lblnomyapelli;
	private	JButton btnModificar;
	private	JTextArea txtmodificacion;
	private JButton btnProcesar;
	private JButton btnSalir;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificacionClientes frame = new ModificacionClientes();
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
	public ModificacionClientes() {
		setTitle("CLIENTES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 701, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo15 = new JLabel("MODIFICACION DE REGISTRO");
		lbltitulo15.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo15.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo15.setBounds(21, 50, 640, 42);
		contentPane.add(lbltitulo15);
		
		lbldni = new JLabel("DNI");
		lbldni.setHorizontalAlignment(SwingConstants.CENTER);
		lbldni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldni.setBounds(21, 137, 256, 42);
		contentPane.add(lbldni);
		
		txtdni = new JTextField();
		txtdni.setHorizontalAlignment(SwingConstants.CENTER);
		txtdni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtdni.setColumns(10);
		txtdni.setBounds(345, 137, 306, 42);
		contentPane.add(txtdni);
		
		lblnomyapelli = new JLabel("NOMBRES Y APELLIDOS");
		lblnomyapelli.setHorizontalAlignment(SwingConstants.CENTER);
		lblnomyapelli.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblnomyapelli.setBounds(21, 273, 256, 42);
		contentPane.add(lblnomyapelli);
		
		txtnomyapelli = new JTextField();
		txtnomyapelli.setHorizontalAlignment(SwingConstants.CENTER);
		txtnomyapelli.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtnomyapelli.setColumns(10);
		txtnomyapelli.setBounds(355, 274, 306, 42);
		contentPane.add(txtnomyapelli);			
		
		txtmodificacion = new JTextArea();
		txtmodificacion.setBounds(345, 350, 316, 53);
		contentPane.add(txtmodificacion);		
		
		btnProcesar = new JButton("PROCESAR");
		btnProcesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnProcesar.setBounds(250, 200, 195, 42);
		contentPane.add(btnProcesar);		
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnModificar.setBounds(55, 350, 195, 42);
		contentPane.add(btnModificar);				
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(511, 23, 150, 32);
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
