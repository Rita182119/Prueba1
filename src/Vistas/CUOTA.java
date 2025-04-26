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

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CUOTA extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcuota;	
	private JLabel lblcuota;	
	private JLabel lbltitulo9;	
	private JButton btnSalir;	
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CUOTA frame = new CUOTA();
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
	public CUOTA() {
		setTitle("CONFIGURACION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 675, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(185, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo9 = new JLabel("CUOTA DIARIA");
		lbltitulo9.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo9.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitulo9.setBounds(140, 70, 395, 42);
		contentPane.add(lbltitulo9);
		
		lblcuota = new JLabel("Cuota diaria esperada (S/.) :");
		lblcuota.setHorizontalAlignment(SwingConstants.CENTER);
		lblcuota.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblcuota.setBounds(19, 153, 246, 75);
		contentPane.add(lblcuota);
		
		txtcuota = new JTextField();
		txtcuota.setText("15");
		txtcuota.setHorizontalAlignment(SwingConstants.CENTER);
		txtcuota.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtcuota.setColumns(10);
		txtcuota.setBounds(275, 170, 210, 41);
		contentPane.add(txtcuota);
		
		btnGrabar = new JButton("GRABAR");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(546, 147, 103, 30);
		contentPane.add(btnGrabar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(546, 200, 103, 30);
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
		JOptionPane.showInternalMessageDialog(null, "Se modifico la cuota diaria proyectada exitosamente.", "Aviso", 1, null);
  }
}
