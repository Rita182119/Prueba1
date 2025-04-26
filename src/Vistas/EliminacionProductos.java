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

public class EliminacionProductos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtlote;
	private	JLabel lbltitulo12;
	private	JButton btnSalir;
	private	JLabel lbllote;
	private	JButton btnEliminar;
	private	JTextArea txteliminacion;
	
	
	

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 697, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo12 = new JLabel("ELIMINACION DE REGISTRO");
		lbltitulo12.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo12.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo12.setBounds(10, 55, 640, 42);
		contentPane.add(lbltitulo12);
					
		lbllote = new JLabel("LOTE");
		lbllote.setHorizontalAlignment(SwingConstants.CENTER);
		lbllote.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbllote.setBounds(10, 125, 256, 42);
		contentPane.add(lbllote);
		
		txtlote = new JTextField();
		txtlote.setHorizontalAlignment(SwingConstants.CENTER);
		txtlote.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtlote.setColumns(10);
		txtlote.setBounds(334, 125, 306, 42);
		contentPane.add(txtlote);
				
		txteliminacion = new JTextArea();
		txteliminacion.setBounds(84, 264, 527, 146);
		contentPane.add(txteliminacion);		
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEliminar.setBounds(238, 189, 195, 42);
		contentPane.add(btnEliminar);
						
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 28, 150, 32);
		contentPane.add(btnSalir);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnSalir) {
			actionPerformedbtnSalir (e);
		}				
	}
	protected void actionPerformedbtnSalir(ActionEvent e) {
		dispose ();
	}
}
