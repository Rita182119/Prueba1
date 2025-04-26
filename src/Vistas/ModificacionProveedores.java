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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ModificacionProveedores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtruc;
	private JTextField txtrazonsocial;
	private	JLabel lbltitulo17;
	private	JButton btnSalir;
	private	JLabel lblruc;
	private	JLabel lblrazonsocial;
	private	JButton btnprocesar;
	private JTextArea txtmodificacion;
	private JButton btnModificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificacionProveedores frame = new ModificacionProveedores();
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
	public ModificacionProveedores() {
		setTitle("PROVEEDORES");
		setBounds(100, 100, 672, 456);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo17 = new JLabel("MODIFICACION DE REGISTRO");
		lbltitulo17.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltitulo17.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo17.setBounds(51, 37, 370, 42);
		contentPane.add(lbltitulo17);		
		
		lblruc = new JLabel("RUC");
		lblruc.setHorizontalAlignment(SwingConstants.CENTER);
		lblruc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblruc.setBounds(10, 119, 256, 42);
		contentPane.add(lblruc);
		
		txtruc = new JTextField();
		txtruc.setHorizontalAlignment(SwingConstants.CENTER);
		txtruc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtruc.setColumns(10);
		txtruc.setBounds(292, 119, 288, 42);
		contentPane.add(txtruc);
		
		lblrazonsocial = new JLabel("RAZON SOCIAL");
		lblrazonsocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblrazonsocial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblrazonsocial.setBounds(33, 245, 256, 42);
		contentPane.add(lblrazonsocial);
		
		txtrazonsocial = new JTextField();
		txtrazonsocial.setHorizontalAlignment(SwingConstants.CENTER);
		txtrazonsocial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrazonsocial.setColumns(10);
		txtrazonsocial.setBounds(299, 246, 288, 42);
		contentPane.add(txtrazonsocial);
				
		txtmodificacion = new JTextArea();
		txtmodificacion.setToolTipText("");
		txtmodificacion.setBounds(299, 335, 300, 41);
		contentPane.add(txtmodificacion);
		
		btnprocesar = new JButton("PROCESAR");
		btnprocesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnprocesar.setBounds(241, 184, 195, 42);
		contentPane.add(btnprocesar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnModificar.setBounds(69, 335, 195, 42);
		contentPane.add(btnModificar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(471, 37, 150, 32);
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
