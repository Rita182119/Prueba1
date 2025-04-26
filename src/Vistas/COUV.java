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

public class COUV extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcantidad;
	private JLabel lbltitulo8;
	private JLabel lblcantidad;
	private JButton btnGrabar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					COUV frame = new COUV();
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
	public COUV() {
		setTitle("CONFIGURACION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 680, 313);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(206, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo8 = new JLabel("CANTIDAD OPTIMA");
		lbltitulo8.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo8.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitulo8.setBounds(131, 50, 395, 42);
		contentPane.add(lbltitulo8);
		
		lblcantidad = new JLabel("Cantidad optima de \r\nunidades vendidas");
		lblcantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblcantidad.setBounds(10, 133, 246, 75);
		contentPane.add(lblcantidad);
		
		txtcantidad = new JTextField();
		txtcantidad.setText("15");
		txtcantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtcantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtcantidad.setColumns(10);
		txtcantidad.setBounds(266, 150, 210, 41);
		contentPane.add(txtcantidad);
		
		btnGrabar = new JButton("GRABAR");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(537, 127, 103, 30);
		contentPane.add(btnGrabar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this); 
		btnSalir.setBounds(537, 180, 103, 30);
		contentPane.add(btnSalir);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnSalir) {
			actionPerformedbtnSalir (e) ;
		}
		if (e.getSource()==btnGrabar) {
			actionPerformedbtnGrabar (e) ;
		}
	}
	protected void actionPerformedbtnSalir(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedbtnGrabar(ActionEvent e) {
		JOptionPane.showInternalMessageDialog(null, "Se modifico el monto de costo optimo de unidades vendidas exitosamente.", "Aviso", 1, null);
	}
}	



