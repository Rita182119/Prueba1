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

public class EliminacionProveedores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtruc;
	private JLabel lbltitulo13;
	private JButton btnSalir;
	private JLabel lblruc;
	private JButton btnEliminar;
	private JTextArea txteliminacion;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 685, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo13 = new JLabel("ELIMINACION DE REGISTRO");
		lbltitulo13.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo13.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo13.setBounds(10, 48, 640, 42);
		contentPane.add(lbltitulo13);
			
		lblruc = new JLabel("RUC");
		lblruc.setHorizontalAlignment(SwingConstants.CENTER);
		lblruc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblruc.setBounds(10, 118, 256, 42);
		contentPane.add(lblruc);
		
		txtruc = new JTextField();
		txtruc.setHorizontalAlignment(SwingConstants.CENTER);
		txtruc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtruc.setColumns(10);
		txtruc.setBounds(334, 118, 306, 42);
		contentPane.add(txtruc);
		
		txteliminacion = new JTextArea();
		txteliminacion.setBounds(84, 257, 527, 146);
		contentPane.add(txteliminacion);
								
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEliminar.setBounds(238, 182, 195, 42);
		contentPane.add(btnEliminar);		

		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 21, 150, 32);
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
