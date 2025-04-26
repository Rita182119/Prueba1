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

public class Version extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Version frame = new Version();
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
	public Version() {
		setTitle("AYUDA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 811, 401);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(185, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(635, 11, 150, 32);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(btnSalir);
		
		JLabel LBLempresa = new JLabel("TELEMOBIL.CORP");
		LBLempresa.setBounds(266, 28, 263, 24);
		LBLempresa.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(LBLempresa);
		
		JLabel lblversión = new JLabel("Versión 1.0.0");
		lblversión.setBounds(224, 80, 318, 24);
		lblversión.setHorizontalAlignment(SwingConstants.CENTER);
		lblversión.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblversión);
		
		JLabel lblultimaActualizacin = new JLabel("Última actualización: 25/04/2025");
		lblultimaActualizacin.setBounds(234, 103, 318, 24);
		lblultimaActualizacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblultimaActualizacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblultimaActualizacin);
		
		JLabel lbldesarrollo = new JLabel("Desarrollado por:");
		lbldesarrollo.setBounds(224, 148, 318, 24);
		lbldesarrollo.setHorizontalAlignment(SwingConstants.CENTER);
		lbldesarrollo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lbldesarrollo);
		
		JLabel lblnum1 = new JLabel("Alexis Espinoza García");
		lblnum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum1.setBounds(234, 183, 318, 24);
		lblnum1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblnum1);
		
		JLabel lblnum2 = new JLabel("Frank Huamán Auqui");
		lblnum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum2.setBounds(234, 206, 318, 24);
		lblnum2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblnum2);
		
		JLabel lblnum3 = new JLabel("Rita Ramos Almonacid");
		lblnum3.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum3.setBounds(234, 231, 318, 24);
		lblnum3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblnum3);
		
		JLabel lblNotas = new JLabel("Notas:");
		lblNotas.setBounds(10, 294, 318, 24);
		lblNotas.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNotas);
		
		JLabel lblnotas_1 = new JLabel("Primera versión para venta de celulares y gestión de contactos.");
		lblnotas_1.setBounds(10, 329, 405, 24);
		lblnotas_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblnotas_1);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(412, 293, 77, 24);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblEstado);
		
		JLabel lblestado_1 = new JLabel("Estable");
		lblestado_1.setBounds(413, 329, 76, 24);
		lblestado_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblestado_1);
		
		JLabel lblTecnologa = new JLabel("Tecnología:");
		lblTecnologa.setHorizontalAlignment(SwingConstants.LEFT);
		lblTecnologa.setBounds(603, 293, 103, 24);
		lblTecnologa.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblTecnologa);
		
		JLabel lbltecnología_1 = new JLabel("Java Swing");
		lbltecnología_1.setBounds(603, 329, 96, 24);
		lbltecnología_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lbltecnología_1);
	}

}
