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

public class DESCUENTO extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdsct1;
	private JTextField txtdsct2;
	private JTextField txtdsct3;
	private JTextField txtdsct4;
	private	JLabel lbltitulo10;
	private JLabel lblcntd1;
	private JLabel lblcntd2;
	private JLabel lblcntd3;
	private JLabel lblcntd4;
	private JLabel lbla;
	private JLabel lblb;
	private JLabel lblc;
	private JLabel lbld;
	private JButton btnsalir;
	private JButton btnGrabar;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DESCUENTO frame = new DESCUENTO();
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
	public DESCUENTO() {
		setTitle("CONFIGURACION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 763, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(191, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo10 = new JLabel("DESCUENTO");
		lbltitulo10.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitulo10.setBounds(307, 33, 164, 42);
		contentPane.add(lbltitulo10);
		
		lblcntd1 = new JLabel("1 a 5 unidades");
		lblcntd1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcntd1.setBounds(36, 117, 164, 42);
		contentPane.add(lblcntd1);
		
		lblcntd2 = new JLabel("6 a 10 unidades");
		lblcntd2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcntd2.setBounds(36, 171, 164, 42);
		contentPane.add(lblcntd2);
		
		lblcntd3 = new JLabel("11 a 15 unidades");
		lblcntd3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcntd3.setBounds(36, 224, 164, 42);
		contentPane.add(lblcntd3);
		
		lblcntd4 = new JLabel("16 a 20 unidades");
		lblcntd4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcntd4.setBounds(36, 278, 164, 42);
		contentPane.add(lblcntd4);
		
		txtdsct1 = new JTextField();
		txtdsct1.setHorizontalAlignment(SwingConstants.CENTER);
		txtdsct1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtdsct1.setColumns(10);
		txtdsct1.setBounds(256, 118, 184, 41);
		String porcentaje1 = Double.toString(MenuPrincipal.porcentaje1);
		txtdsct1.setText(porcentaje1);
		contentPane.add(txtdsct1);
		
		txtdsct2 = new JTextField();
		txtdsct2.setHorizontalAlignment(SwingConstants.CENTER);
		txtdsct2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtdsct2.setColumns(10);
		txtdsct2.setBounds(256, 172, 184, 41);
		String porcentaje2 = Double.toString(MenuPrincipal.porcentaje2);
		txtdsct2.setText(porcentaje2);
		contentPane.add(txtdsct2);
		
		txtdsct3 = new JTextField();
		txtdsct3.setHorizontalAlignment(SwingConstants.CENTER);
		txtdsct3.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtdsct3.setColumns(10);
		txtdsct3.setBounds(256, 225, 184, 41);
		String porcentaje3 = Double.toString(MenuPrincipal.porcentaje3);
		txtdsct3.setText(porcentaje3);
		contentPane.add(txtdsct3);
		
		txtdsct4 = new JTextField();
		txtdsct4.setHorizontalAlignment(SwingConstants.CENTER);
		txtdsct4.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtdsct4.setColumns(10);
		txtdsct4.setBounds(256, 279, 184, 41);
		String porcentaje4 = Double.toString(MenuPrincipal.porcentaje4);
		txtdsct4.setText(porcentaje4);
		contentPane.add(txtdsct4);
		
		lbla = new JLabel("%");
		lbla.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbla.setBounds(450, 117, 35, 42);
		contentPane.add(lbla);
		
		lblb = new JLabel("%");
		lblb.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblb.setBounds(450, 171, 35, 42);
		contentPane.add(lblb);
		
		lblc = new JLabel("%");
		lblc.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblc.setBounds(450, 224, 35, 42);
		contentPane.add(lblc);
		
		lbld = new JLabel("%");
		lbld.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbld.setBounds(450, 278, 35, 42);
		contentPane.add(lbld);
		
		btnsalir = new JButton("SALIR");
		btnsalir.addActionListener(this);
		btnsalir.setBounds(569, 179, 103, 30);
		contentPane.add(btnsalir);
		
		btnGrabar = new JButton("GRABAR");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(569, 125, 103, 30);
		contentPane.add(btnGrabar);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnsalir) {
			actionPerformedbtnsalir (e);
		}			
		if (e.getSource()==btnGrabar) {
			actionPerformedbtnGrabar (e);
		}}

	protected void actionPerformedbtnsalir(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedbtnGrabar(ActionEvent e) {
    	MenuPrincipal.porcentaje1 = Double.parseDouble(txtdsct1.getText());
    	MenuPrincipal.porcentaje2 = Double.parseDouble(txtdsct2.getText());
    	MenuPrincipal.porcentaje3 = Double.parseDouble(txtdsct3.getText());
    	MenuPrincipal.porcentaje4 = Double.parseDouble(txtdsct4.getText());
        JOptionPane.showInternalMessageDialog(null, "Cambio Realizado con Éxito", "Aviso", 1, null);
        dispose();
    }
}
