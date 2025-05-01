package Vistas;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Acercade extends JDialog {

	private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JLabel lblEmpresa;
		private JLabel lblDescripcion;
		private JLabel lblDescripcion1;
		private JLabel lblDescripcion2;
		private JButton btnSalir;
		
		

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
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 650, 272);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(185, 255, 255));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			lblEmpresa = new JLabel("TELEMOBIL.CORP");
			lblEmpresa.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
			lblEmpresa.setBounds(173, 11, 292, 46);
			contentPane.add(lblEmpresa);
			
			lblDescripcion = new JLabel("Telemobil Corp. es una empresa nueva y dinámica especializada ");
			lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
			lblDescripcion.setBounds(56, 81, 536, 46);
			contentPane.add(lblDescripcion);
			
			lblDescripcion1 = new JLabel("en la venta de celulares de última generación.");
			lblDescripcion1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblDescripcion1.setHorizontalAlignment(SwingConstants.CENTER);
			lblDescripcion1.setBounds(185, 113, 265, 32);
			contentPane.add(lblDescripcion1);
			
			
			lblDescripcion2 = new JLabel("Nacimos en 2025 con la misión de acercar la mejor tecnología móvil al alcance de todos.");
			lblDescripcion2.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblDescripcion2.setHorizontalAlignment(SwingConstants.CENTER);
			lblDescripcion2.setBounds(56, 138, 536, 32);
			contentPane.add(lblDescripcion2);
			
			btnSalir = new JButton("SALIR");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnSalir.setBounds(230, 181, 150, 32);
			contentPane.add(btnSalir);
			
		}
	}
