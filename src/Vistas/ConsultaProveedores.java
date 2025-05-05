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
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ConsultaProveedores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtruc;
	private JLabel lbltitulo3;
	private JButton btnSalir;
	private JLabel lblruc;
	private JButton btnprocesar;
	private JTextArea txtregistro;
	private JButton btnlista;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaProveedores frame = new ConsultaProveedores();
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
	public ConsultaProveedores() {
		setTitle("PROVEEDORES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 712, 468);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo3 = new JLabel("CONSULTA DE PROVEEDORES");
		lbltitulo3.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo3.setBounds(16, 38, 640, 42);
		contentPane.add(lbltitulo3);
				
		lblruc = new JLabel("RUC");
		lblruc.setHorizontalAlignment(SwingConstants.CENTER);
		lblruc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblruc.setBounds(10, 129, 256, 42);
		contentPane.add(lblruc);
		
		txtruc = new JTextField();
		txtruc.setHorizontalAlignment(SwingConstants.CENTER);
		txtruc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtruc.setColumns(10);
		txtruc.setBounds(334, 129, 306, 42);
		contentPane.add(txtruc);
		
		txtregistro = new JTextArea();
		txtregistro.setBounds(334, 237, 306, 47);
		contentPane.add(txtregistro);
		
		btnprocesar = new JButton("PROCESAR");
		btnprocesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnprocesar.setBounds(43, 237, 195, 42);
		btnprocesar.addActionListener(e -> buscarProveedor());
		contentPane.add(btnprocesar);				
		
		btnlista = new JButton("LISTA DE PROVEEDORES");
		btnlista.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnlista.setBounds(243, 354, 195, 42);
		btnlista.addActionListener(e -> {
			ListaProveedores ventanaLista = new ListaProveedores(MenuPrincipal.getListaProveedores());
		    ventanaLista.setVisible(true);
		});
		contentPane.add(btnlista);
				
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(544, 25, 150, 32);
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
    private void buscarProveedor() {
	    String proveedorIngresado = txtruc.getText().trim();

	    if (proveedorIngresado.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Ingrese un RUC para buscar.");
	        return;
	    }

	    ArrayList<String[]> proveedores = MenuPrincipal.getListaProveedores();

	    for (String[] proveedor : proveedores) {
	        if (proveedor[0].equalsIgnoreCase(proveedorIngresado)) {
	        	txtregistro.setText("\n");		        	
	        	txtregistro.append("       " + proveedor[1] + "\n");
	        	return;
	        }
	    }

	    txtregistro.setText("Proveedor no encontrado.");
	}
		

}
