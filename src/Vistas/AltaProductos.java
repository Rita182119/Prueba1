package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class AltaProductos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmarca;
	private JTextField txtmodelo;
	private JTextField txtprecio;
	private JTextField txtlote;
	private JTextField txtbateria;
	private JTextField txtmemoria;
	private JTextField txtcolor;
	private JTextField txtproveedor;
	private JTextField txtcantidad;
	private JButton btnSalir;
	private JLabel lbltitulo;
	private JLabel lblmarca;
	private JLabel lblmodelo;
	private JButton btnRegistrar;
	private JTextArea txtregistro;
	private JLabel lblprecio;
	private JLabel lbllote;
	private JLabel lblbateria;
	private JLabel lblmemoria;
	private JLabel lblcolor;
	private JLabel lblproveedor;
	private JLabel lblcantidad;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaProductos frame = new AltaProductos();
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
	public AltaProductos() {
		setTitle("PRODUCTOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 707, 723);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);	

		lbltitulo = new JLabel("REGISTRO DE PRODUCTOS");
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo.setBounds(140, 28, 407, 42);
		contentPane.add(lbltitulo);
		
		lblmarca = new JLabel("MARCA");
		lblmarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblmarca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblmarca.setBounds(24, 155, 256, 42);
		contentPane.add(lblmarca);
		
		txtmarca = new JTextField();
		txtmarca.setHorizontalAlignment(SwingConstants.CENTER);
		txtmarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtmarca.setColumns(10);
		txtmarca.setBounds(348, 156, 306, 42);
		contentPane.add(txtmarca);
		
		lblmodelo = new JLabel("MODELO");
		lblmodelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblmodelo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblmodelo.setBounds(24, 208, 256, 42);
		contentPane.add(lblmodelo);
		
		txtmodelo = new JTextField();
		txtmodelo.setHorizontalAlignment(SwingConstants.CENTER);
		txtmodelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtmodelo.setColumns(10);
		txtmodelo.setBounds(348, 209, 306, 42);
		contentPane.add(txtmodelo);
		
		lblprecio = new JLabel("PRECIO");
		lblprecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblprecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblprecio.setBounds(24, 261, 256, 42);
		contentPane.add(lblprecio);
		
		txtprecio = new JTextField();
		txtprecio.setHorizontalAlignment(SwingConstants.CENTER);
		txtprecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtprecio.setColumns(10);
		txtprecio.setBounds(348, 262, 306, 42);
		contentPane.add(txtprecio);
		
		lbllote = new JLabel("LOTE");
		lbllote.setHorizontalAlignment(SwingConstants.CENTER);
		lbllote.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbllote.setBounds(24, 107, 256, 42);
		contentPane.add(lbllote);
		
		txtlote = new JTextField();
		txtlote.setHorizontalAlignment(SwingConstants.CENTER);
		txtlote.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtlote.setColumns(10);
		txtlote.setBounds(348, 107, 306, 42);
		contentPane.add(txtlote);
		
		lblbateria = new JLabel("BATERIA");
		lblbateria.setHorizontalAlignment(SwingConstants.CENTER);
		lblbateria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblbateria.setBounds(24, 381, 256, 42);
		contentPane.add(lblbateria);
		
		txtbateria = new JTextField();
		txtbateria.setHorizontalAlignment(SwingConstants.CENTER);
		txtbateria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtbateria.setColumns(10);
		txtbateria.setBounds(348, 382, 306, 42);
		contentPane.add(txtbateria);
		
		lblmemoria = new JLabel("MEMORIA");
		lblmemoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblmemoria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblmemoria.setBounds(24, 443, 256, 42);
		contentPane.add(lblmemoria);
		
	    lblcolor = new JLabel("COLOR");
		lblcolor.setHorizontalAlignment(SwingConstants.CENTER);
		lblcolor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblcolor.setBounds(24, 505, 256, 42);
		contentPane.add(lblcolor);
		
		txtmemoria = new JTextField();
		txtmemoria.setHorizontalAlignment(SwingConstants.CENTER);
		txtmemoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtmemoria.setColumns(10);
		txtmemoria.setBounds(348, 443, 306, 42);
		contentPane.add(txtmemoria);
		
		txtcolor = new JTextField();
		txtcolor.setHorizontalAlignment(SwingConstants.CENTER);
		txtcolor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtcolor.setColumns(10);
		txtcolor.setBounds(348, 506, 306, 42);
		contentPane.add(txtcolor);
		
		lblproveedor = new JLabel("PROVEEDOR");
		lblproveedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblproveedor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblproveedor.setBounds(24, 568, 256, 42);
		contentPane.add(lblproveedor);
		
		txtproveedor = new JTextField();
		txtproveedor.setHorizontalAlignment(SwingConstants.CENTER);
		txtproveedor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtproveedor.setColumns(10);
		txtproveedor.setBounds(348, 573, 306, 42);
		contentPane.add(txtproveedor);
		
		lblcantidad = new JLabel("CANTIDAD");
		lblcantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblcantidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblcantidad.setBounds(24, 328, 256, 42);
		contentPane.add(lblcantidad);
		
		txtcantidad = new JTextField();
		txtcantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtcantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtcantidad.setColumns(10);
		txtcantidad.setBounds(348, 328, 306, 42);
		contentPane.add(txtcantidad);
		
		txtregistro = new JTextArea();
		txtregistro.setBounds(348, 626, 306, 47);
		contentPane.add(txtregistro);
				
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrar.setBounds(58, 631, 195, 42);
		btnRegistrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String lote = txtlote.getText();
		            String marca = txtmarca.getText();
		            String modelo = txtmodelo.getText();
		            double precio = Double.parseDouble(txtprecio.getText());
		            int cantidad = Integer.parseInt(txtcantidad.getText());
		            String bateria = txtbateria.getText();
		            String memoria = txtmemoria.getText();
		            String color = txtcolor.getText();
		            String proveedor = txtproveedor.getText();

		            String[] datosProductos = {
		            	    lote, 
		            	    marca, 
		            	    modelo, 
		            	    String.valueOf(precio), 
		            	    String.valueOf(cantidad), 
		            	    bateria, 
		            	    memoria, 
		            	    color, 
		            	    proveedor
		            	};         
		            MenuPrincipal.agregarProductos(datosProductos);
		            JOptionPane.showMessageDialog(null, "Producto registrado correctamente.");
		            dispose();
		        } catch (Exception ex) {
		            JOptionPane.showMessageDialog(null, "Error al registrar el producto. Verifica los campos.");
		        }
		    }
		});
		contentPane.add(btnRegistrar);	
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(514, 36, 150, 32);
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
