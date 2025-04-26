package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaClientes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdni;
	private JTextField txtnomyapell;
	private JLabel lblAltaDeClientes;
	private JLabel lbldni;
	private JLabel lblnomyapell;
	private JButton btnRegistrar;
	private JTextArea txtresultado;
	private JButton btnSalir;
	
	
	public void Mostrarnomyapell() {
        setTitle("Mostrar Nombre y Apellidos");
        setSize(300, 100);
        setLayout(null);
	} 
    	  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaClientes frame = new AltaClientes();
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
	public AltaClientes() {
		setTitle("CLIENTES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 689, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAltaDeClientes = new JLabel("ALTA DE CLIENTES");
		lblAltaDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaDeClientes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAltaDeClientes.setBounds(10, 41, 640, 42);
		contentPane.add(lblAltaDeClientes);
		
		lbldni = new JLabel("DNI");
		lbldni.setHorizontalAlignment(SwingConstants.CENTER);
		lbldni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldni.setBounds(10, 117, 256, 42);
		contentPane.add(lbldni);
		
		txtdni = new JTextField();
		txtdni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtdni.setHorizontalAlignment(SwingConstants.CENTER);
		txtdni.setColumns(10);
		txtdni.setBounds(334, 117, 306, 42);
		contentPane.add(txtdni);
		
		lblnomyapell = new JLabel("NOMBRES Y APELLIDOS");
		lblnomyapell.setHorizontalAlignment(SwingConstants.CENTER);
		lblnomyapell.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblnomyapell.setBounds(10, 212, 256, 42);
		contentPane.add(lblnomyapell);
		
		txtnomyapell = new JTextField();
		txtnomyapell.setHorizontalAlignment(SwingConstants.CENTER);
		txtnomyapell.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtnomyapell.setColumns(10);
		txtnomyapell.setBounds(334, 215, 306, 42);
		contentPane.add(txtnomyapell);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   Mostrarnomyapell mostrar = new Mostrarnomyapell();
	                mostrar.setVisible(true);
			
	                UsuarioData.nombreUsuario = txtnomyapell.getText();
	                JOptionPane.showMessageDialog(null, "Usuario registrado");
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrar.setBounds(48, 335, 195, 42);
		contentPane.add(btnRegistrar);
		
		txtresultado = new JTextArea();
		txtresultado.setText("\r\n");
		txtresultado.setBounds(334, 330, 306, 47);
		contentPane.add(txtresultado);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this); 
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 23, 150, 32);
		contentPane.add(btnSalir);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		 if (e.getSource() == btnSalir) {
	            actionPerformedbtnSalir(e);
	        }
	    }

	    protected void actionPerformedbtnSalir(ActionEvent e) {
	        dispose();
	    }
	
}


