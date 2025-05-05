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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class AltaProovedores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtruc;
	private JTextField txtrazonsocial;
	private JLabel lbltitulo2;
	private JButton btnSalir;
	private JLabel lblruc;
	private JLabel lblrazonsocial;
	private JButton btnprocesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaProovedores frame = new AltaProovedores();
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
	public AltaProovedores() {
		setTitle("PROVEEDORES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 683, 365);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo2 = new JLabel("REGISTRO DE PROVEEDORES");
		lbltitulo2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltitulo2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo2.setBounds(72, 32, 370, 42);
		contentPane.add(lbltitulo2);
		
		lblruc = new JLabel("RUC");
		lblruc.setHorizontalAlignment(SwingConstants.CENTER);
		lblruc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblruc.setBounds(31, 114, 256, 42);
		contentPane.add(lblruc);
		
		lblrazonsocial = new JLabel("RAZON SOCIAL");
		lblrazonsocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblrazonsocial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblrazonsocial.setBounds(31, 193, 256, 42);
		contentPane.add(lblrazonsocial);
		
		txtruc = new JTextField();
		txtruc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtruc.setHorizontalAlignment(SwingConstants.CENTER);
		txtruc.setBounds(313, 114, 288, 42);
		contentPane.add(txtruc);
		txtruc.setColumns(10);
		
		txtrazonsocial = new JTextField();
		txtrazonsocial.setHorizontalAlignment(SwingConstants.CENTER);
		txtrazonsocial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrazonsocial.setColumns(10);
		txtrazonsocial.setBounds(313, 193, 288, 42);
		contentPane.add(txtrazonsocial);
		
		btnprocesar = new JButton("PROCESAR");
		btnprocesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnprocesar.setBounds(247, 266, 195, 42);
		btnprocesar.addActionListener(this);
		    
		contentPane.add(btnprocesar);			
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(492, 32, 150, 32);
		contentPane.add(btnSalir);
	}

	
	 public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnSalir) {
	            actionPerformedbtnSalir(e);
	        }
	        if (e.getSource() == btnprocesar) {
	        	actionPerformedbtnprocesar(e);
	        }
	    }

	    protected void actionPerformedbtnSalir(ActionEvent e) {
	        dispose();
		
	}
	    public void actionPerformedbtnprocesar(ActionEvent e) {
	        String RUC = txtruc.getText();
            String RazonSocial = txtrazonsocial.getText();
	    	if (RUC.length() != 11) {
	            JOptionPane.showMessageDialog(null, "RUC incorrecto, cantiad permitida de 11 digitos.", "Error", JOptionPane.ERROR_MESSAGE);
	        } else {
	        	String[] datosProveedor = {
	            		RUC, 
	            		RazonSocial 
	            	};
	            MenuPrincipal.agregarProveedores(datosProveedor);
	            JOptionPane.showMessageDialog(null, "Proveedor registrado correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
	            txtruc.setText("");
	            txtrazonsocial.setText("");
	        }
	    };
}
