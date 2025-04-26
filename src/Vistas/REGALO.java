package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class REGALO extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtregalo1;
	private JTextField txtregalo2;
	private JTextField txtregalo3;
	private	JLabel lbltitulo18;
	private	JLabel lblunidades1;
	private	JLabel lblunidades2;
	private	JLabel lblunidades3;
	private JButton btnGrabar;		
	private JButton btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGALO frame = new REGALO();
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
	public REGALO() {
		setTitle("CONFIGURACION");
		setBounds(100, 100, 717, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(206, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo18 = new JLabel("REGALO");
		lbltitulo18.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltitulo18.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitulo18.setBounds(233, 35, 164, 42);
		contentPane.add(lbltitulo18);
		
		lblunidades1 = new JLabel("1 unidad");
		lblunidades1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblunidades1.setBounds(27, 138, 164, 42);
		contentPane.add(lblunidades1);
		
		txtregalo1 = new JTextField();
		txtregalo1.setHorizontalAlignment(SwingConstants.CENTER);
		txtregalo1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtregalo1.setColumns(10);
		txtregalo1.setBounds(233, 139, 210, 41);
		contentPane.add(txtregalo1);
		
		lblunidades2 = new JLabel("2 a 5 unidades");
		lblunidades2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblunidades2.setBounds(27, 192, 164, 42);
		contentPane.add(lblunidades2);
		
		txtregalo2 = new JTextField();
		txtregalo2.setHorizontalAlignment(SwingConstants.CENTER);
		txtregalo2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtregalo2.setColumns(10);
		txtregalo2.setBounds(233, 193, 210, 41);
		contentPane.add(txtregalo2);
		
		lblunidades3 = new JLabel("6 a mas unidades");
		lblunidades3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblunidades3.setBounds(27, 245, 164, 42);
		contentPane.add(lblunidades3);
		
		txtregalo3 = new JTextField();
		txtregalo3.setHorizontalAlignment(SwingConstants.CENTER);
		txtregalo3.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtregalo3.setColumns(10);
		txtregalo3.setBounds(233, 246, 210, 41);
		contentPane.add(txtregalo3);
		
		btnGrabar = new JButton("GRABAR");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(560, 146, 103, 30);
		contentPane.add(btnGrabar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(560, 200, 103, 30);
		contentPane.add(btnSalir);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnSalir) {
			actionPerformedbtnSalir (e);
		}		
		if (e.getSource()==btnGrabar) {
			actionPerformedbtnGrabar (e);
		}		
	}
	protected void actionPerformedbtnSalir(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedbtnGrabar(ActionEvent e) {
		JOptionPane.showInternalMessageDialog(null, "Se modifico el item de Regalo exitosamente.", "Aviso", 1, null);	  
	}
	
}
