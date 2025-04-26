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

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Facturacion extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcantidad;
	private JLabel lblmodelo;
	private JLabel lblprecio;
	private JLabel lblcantidad;
	private JComboBox <String> cmbmodelo;
	private JButton btnSalir;
	private JButton btnFacturar;
	private JTextArea txtboleta;
	private JTextArea txtprecio;
	private JLabel lbltitulo14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facturacion frame = new Facturacion();
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
	public Facturacion() {
		setTitle("FACTURACION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 727, 726);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(208, 236, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblmodelo = new JLabel("Modelo");
		lblmodelo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblmodelo.setBounds(118, 48, 170, 42);
		contentPane.add(lblmodelo);
		
		lblprecio = new JLabel("Precio (S/)");
		lblprecio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblprecio.setBounds(118, 108, 170, 42);
		contentPane.add(lblprecio);
		
		lblcantidad = new JLabel("Cantidad");
		lblcantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcantidad.setBounds(118, 159, 170, 42);
		contentPane.add(lblcantidad);
		
		cmbmodelo = new JComboBox<String>();
		cmbmodelo.setModel(new DefaultComboBoxModel<String>(new String[] {"SAMSUNG SM-A215U NEGRO", "LG A567 "}));
		cmbmodelo.setBounds(333, 56, 223, 30);
		contentPane.add(cmbmodelo);
		
		txtprecio = new JTextArea();
		txtprecio.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtprecio.setBounds(333, 116, 223, 31);
		contentPane.add(txtprecio);
		
		txtcantidad = new JTextField();
		txtcantidad.setForeground(new Color(255, 255, 255));
		txtcantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtcantidad.setBounds(333, 166, 223, 29);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);		
		
		txtboleta = new JTextArea();
		txtboleta.setText("\r\n\r\n");
		txtboleta.setBounds(10, 271, 691, 405);
		contentPane.add(txtboleta);	
		
		lbltitulo14 = new JLabel("FACTURACION");
		lbltitulo14.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitulo14.setBounds(258, -5, 210, 42);
		contentPane.add(lbltitulo14);	
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(598, 11, 103, 30);
		contentPane.add(btnSalir);
		
		btnFacturar = new JButton("EMITIR COMPROBANTE");
		btnFacturar.setBounds(247, 212, 204, 42);
		contentPane.add(btnFacturar);
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
