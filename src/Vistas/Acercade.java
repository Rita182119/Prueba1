package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Acercade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblEmpresa;
	private JLabel lblDescripcion;
	private JLabel lblDescripcion1;
	private JLabel lblDescripcion2;
	private JLabel lblcreadopor;
	private JButton btnSalir;
	private JLabel lblautor1;
	private JLabel lblautor2;
	private JLabel lblautor3;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acercade frame = new Acercade();
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
	public Acercade() {
		setTitle("AYUDA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(185, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEmpresa = new JLabel("TELEMOBIL.CORP");
		lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpresa.setBounds(155, 0, 292, 70);
		contentPane.add(lblEmpresa);
		
		lblDescripcion = new JLabel("Telemobil Corp. es una empresa nueva y dinámica especializada ");
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setBounds(56, 81, 536, 46);
		contentPane.add(lblDescripcion);
		
		lblDescripcion1 = new JLabel("en la venta de celulares de última generación.");
		lblDescripcion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion1.setBounds(185, 111, 265, 32);
		contentPane.add(lblDescripcion1);
		
		
		lblDescripcion2 = new JLabel("Nacimos en 2025 con la misión de acercar la mejor tecnología móvil al alcance de todos.");
		lblDescripcion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion2.setBounds(66, 136, 536, 32);
		contentPane.add(lblDescripcion2);
		
		
		lblcreadopor = new JLabel("Autores");
		lblcreadopor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcreadopor.setHorizontalAlignment(SwingConstants.CENTER);
		lblcreadopor.setBounds(64, 177, 489, 39);
		contentPane.add(lblcreadopor);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(241, 322, 150, 32);
		contentPane.add(btnSalir);
		
		lblautor1 = new JLabel("Alexis Espinoza Garcia");
		lblautor1.setHorizontalAlignment(SwingConstants.CENTER);
		lblautor1.setBounds(185, 214, 246, 32);
		contentPane.add(lblautor1);
		
	    lblautor2 = new JLabel("Frank Huaman Auqui");
		lblautor2.setHorizontalAlignment(SwingConstants.CENTER);
		lblautor2.setBounds(195, 245, 226, 32);
		contentPane.add(lblautor2);
		
		lblautor3 = new JLabel("Rita Ramos Almonacid");
		lblautor3.setHorizontalAlignment(SwingConstants.CENTER);
		lblautor3.setBounds(195, 269, 226, 39);
		contentPane.add(lblautor3);
		
		lblDescripcion1 = new JLabel("Nacimos en 2025 con la misión de acercar la mejor tecnología móvil al alcance de todos.");
		lblDescripcion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion1.setBounds(66, 136, 536, 32);
		contentPane.add(lblDescripcion1);
		
		lblDescripcion2 = new JLabel("en la venta de celulares de última generación.");
		lblDescripcion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion2.setBounds(185, 111, 265, 32);
		contentPane.add(lblDescripcion2);
	}
}
