package Vistas;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contactos extends JDialog {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JLabel lblcontactos;
		private JButton btnsalir;
		private JLabel lblnum1;
		private JLabel lblCorreoElectronico;
		private JLabel lvlcorreo1;
		private JLabel LBLatención;
		private JLabel lvlatención_1;
		private JLabel lblnum2;
		private JLabel lblnum3;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Contactos frame = new Contactos();
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
		public Contactos() {
			setTitle("AYUDA");
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 430, 373);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(185, 255, 255));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			lblcontactos = new JLabel("CONTACTANOS");
			lblcontactos.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblcontactos.setHorizontalAlignment(SwingConstants.CENTER);
			lblcontactos.setBounds(106, 0, 207, 49);
			contentPane.add(lblcontactos);
	
			lblnum1 = new JLabel("Teléfono:  +51 934 921 187 ");
			lblnum1.setHorizontalAlignment(SwingConstants.CENTER);
			lblnum1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblnum1.setBounds(31, 61, 244, 30);
			contentPane.add(lblnum1);
			
			lblnum2 = new JLabel("Teléfono:  +51 921 443 934 ");
			lblnum2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblnum2.setBounds(59, 89, 207, 30);
			contentPane.add(lblnum2);
			
			lblnum3 = new JLabel("Teléfono:  +51 929 977 445 ");
			lblnum3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblnum3.setBounds(59, 122, 197, 30);
			contentPane.add(lblnum3);
			
			lblCorreoElectronico = new JLabel("CORREO ELECTRONICO:");
			lblCorreoElectronico.setHorizontalAlignment(SwingConstants.CENTER);
			lblCorreoElectronico.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblCorreoElectronico.setBounds(49, 147, 207, 49);
			contentPane.add(lblCorreoElectronico);
			
			lvlcorreo1 = new JLabel("ventas@telemobilcorp.com");
			lvlcorreo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lvlcorreo1.setBounds(59, 187, 350, 30);
			contentPane.add(lvlcorreo1);
			
			LBLatención = new JLabel("HORARIO DE ATENCION");
			LBLatención.setHorizontalAlignment(SwingConstants.CENTER);
			LBLatención.setFont(new Font("Tahoma", Font.BOLD, 15));
			LBLatención.setBounds(49, 217, 207, 49);
			contentPane.add(LBLatención);
			
			lvlatención_1 = new JLabel("Lunes a Viernes: 9:00 a.m.   -   6:00 p.m.");
			lvlatención_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lvlatención_1.setBounds(59, 255, 350, 30);
			contentPane.add(lvlatención_1);
			
			btnsalir = new JButton("SALIR");
			btnsalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnsalir.setBounds(159, 296, 103, 30);
			contentPane.add(btnsalir);
						
		}
	}
