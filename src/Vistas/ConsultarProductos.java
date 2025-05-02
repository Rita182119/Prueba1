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

public class ConsultarProductos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtlote;
	private JLabel lbltitulo7;
	private JButton btnSalir;
	private JLabel lbllote;
	private JButton btnprocesar;
	private JButton btnlista;
	private JTextArea txtregistro;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarProductos frame = new ConsultarProductos();
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
	public ConsultarProductos() {
		setTitle("PRODUCTOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 774, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo7 = new JLabel("CONSULTAR PRODUCTOS");
		lbltitulo7.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo7.setBounds(43, 36, 640, 42);
		contentPane.add(lbltitulo7);
		
		lbllote = new JLabel("LOTE");
		lbllote.setHorizontalAlignment(SwingConstants.CENTER);
		lbllote.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbllote.setBounds(37, 127, 256, 42);
		contentPane.add(lbllote);
		
		txtlote = new JTextField();
		txtlote.setHorizontalAlignment(SwingConstants.CENTER);
		txtlote.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtlote.setColumns(10);
		txtlote.setBounds(361, 127, 306, 42);
		contentPane.add(txtlote);
		
		txtregistro = new JTextArea();
		txtregistro.setBounds(311, 202, 410, 176);
		contentPane.add(txtregistro);
				
		btnprocesar = new JButton("PROCESAR");
		btnprocesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnprocesar.setBounds(68, 248, 195, 42);
		btnprocesar.addActionListener(e -> buscarProducto());
		contentPane.add(btnprocesar);
		
		btnlista = new JButton("LISTA DE PRODUCTOS");
		btnlista.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnlista.setBounds(258, 400, 195, 42);
		btnlista.addActionListener(e -> {
			ListaProductos ventanaLista = new ListaProductos(MenuPrincipal.getListaProductos());
		    ventanaLista.setVisible(true);
		});
		contentPane.add(btnlista);
						
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(571, 23, 150, 32);
		contentPane.add(btnSalir);
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnSalir) {
			actionPerformedbtnSalir (e);
		}			
	}
	protected void actionPerformedbtnSalir(ActionEvent e) {
			dispose();
	}
	
	private void buscarProducto() {
	    String produtoIngresado = txtlote.getText().trim();

	    if (produtoIngresado.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Ingrese un DNI para buscar.");
	        return;
	    }

	    ArrayList<String[]> clientes = MenuPrincipal.getListaProductos();

	    for (String[] cliente : clientes) {
	        if (cliente[0].equalsIgnoreCase(produtoIngresado)) {
	        	txtregistro.setText("\n");
	            txtregistro.append("   Lote: " + cliente[0] + "\n");
	            txtregistro.append("   Marca: " + cliente[1] + "\n");
	            txtregistro.append("   Modelo: " + cliente[2] + "\n");
	            txtregistro.append("   Precio: " + cliente[3] + "\n");
	            txtregistro.append("   Cantidad: " + cliente[4] + "\n");
	            txtregistro.append("   Bateria: " + cliente[5] + "\n");
	            txtregistro.append("   Memoria: " + cliente[6] + "\n");
	            txtregistro.append("   Color: " + cliente[7] + "\n");
	            txtregistro.append("   Proveedor: " + cliente[8] + "\n");
	            return;
	        }
	    }

	    txtregistro.setText("Cliente no encontrado.");
	}
	

}
