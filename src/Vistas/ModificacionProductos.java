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

public class ModificacionProductos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtlote;
	private JTextField txtmarca;
	private JTextField txtmodelo;
	private JTextField txtprecio;
	private JTextField txtcantidad;
	private JTextField txtbateria;
	private JTextField txtmemoria;
	private JTextField txtcolor;
	private JTextField txtproveedor;
	private	JLabel lbltitulo16;
	private	JButton btnSalir;
	private	JLabel lbllote;
	private	JLabel lblmarca;
	private	JLabel lblmodelo;
	private	JLabel lblprecio;
	private	JLabel lblcantidad;
	private	JLabel lblbateria;
	private	JLabel lblmemoria;
	private	JLabel lblcolor;
	private	JLabel lblproveedor;
	private	JButton btnModificar;
	private	JTextArea txtmodificacion;
	private	JButton btnProcesar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificacionProductos frame = new ModificacionProductos();
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
	public ModificacionProductos() {
		setTitle("PRODUCTOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 695, 721);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 232, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo16 = new JLabel("MODIFICACION DE PRODUCTOS");
		lbltitulo16.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo16.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo16.setBounds(126, 11, 407, 42);
		contentPane.add(lbltitulo16);
					
		lbllote = new JLabel("LOTE");
		lbllote.setHorizontalAlignment(SwingConstants.CENTER);
		lbllote.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbllote.setBounds(36, 90, 166, 42);
		contentPane.add(lbllote);
		
		txtlote = new JTextField();
		txtlote.setHorizontalAlignment(SwingConstants.CENTER);
		txtlote.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtlote.setColumns(10);
		txtlote.setBounds(214, 91, 219, 42);
		contentPane.add(txtlote);
		
		lblmarca = new JLabel("MARCA");
		lblmarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblmarca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblmarca.setBounds(10, 138, 256, 42);
		contentPane.add(lblmarca);
		
		txtmarca = new JTextField();
		txtmarca.setHorizontalAlignment(SwingConstants.CENTER);
		txtmarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtmarca.setColumns(10);
		txtmarca.setBounds(334, 139, 306, 42);
		contentPane.add(txtmarca);
		
		lblmodelo = new JLabel("MODELO");
		lblmodelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblmodelo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblmodelo.setBounds(10, 191, 256, 42);
		contentPane.add(lblmodelo);
		
		txtmodelo = new JTextField();
		txtmodelo.setHorizontalAlignment(SwingConstants.CENTER);
		txtmodelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtmodelo.setColumns(10);
		txtmodelo.setBounds(334, 192, 306, 42);
		contentPane.add(txtmodelo);
		
		lblprecio = new JLabel("PRECIO");
		lblprecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblprecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblprecio.setBounds(10, 244, 256, 42);
		contentPane.add(lblprecio);
		
		txtprecio = new JTextField();
		txtprecio.setHorizontalAlignment(SwingConstants.CENTER);
		txtprecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtprecio.setColumns(10);
		txtprecio.setBounds(334, 245, 306, 42);
		contentPane.add(txtprecio);
		
		lblcantidad = new JLabel("CANTIDAD");
		lblcantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblcantidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblcantidad.setBounds(10, 311, 256, 42);
		contentPane.add(lblcantidad);
		
		txtcantidad = new JTextField();
		txtcantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtcantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtcantidad.setColumns(10);
		txtcantidad.setBounds(334, 311, 306, 42);
		contentPane.add(txtcantidad);
		
		lblbateria = new JLabel("BATERIA");
		lblbateria.setHorizontalAlignment(SwingConstants.CENTER);
		lblbateria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblbateria.setBounds(10, 364, 256, 42);
		contentPane.add(lblbateria);
		
		txtbateria = new JTextField();
		txtbateria.setHorizontalAlignment(SwingConstants.CENTER);
		txtbateria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtbateria.setColumns(10);
		txtbateria.setBounds(334, 365, 306, 42);
		contentPane.add(txtbateria);
		
		lblmemoria = new JLabel("MEMORIA");
		lblmemoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblmemoria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblmemoria.setBounds(10, 426, 256, 42);
		contentPane.add(lblmemoria);
		
		txtmemoria = new JTextField();
		txtmemoria.setHorizontalAlignment(SwingConstants.CENTER);
		txtmemoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtmemoria.setColumns(10);
		txtmemoria.setBounds(334, 426, 306, 42);
		contentPane.add(txtmemoria);
		
		lblcolor = new JLabel("COLOR");
		lblcolor.setHorizontalAlignment(SwingConstants.CENTER);
		lblcolor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblcolor.setBounds(10, 488, 256, 42);
		contentPane.add(lblcolor);
		
		txtcolor = new JTextField();
		txtcolor.setHorizontalAlignment(SwingConstants.CENTER);
		txtcolor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtcolor.setColumns(10);
		txtcolor.setBounds(334, 489, 306, 42);
		contentPane.add(txtcolor);
		
		lblproveedor = new JLabel("PROVEEDOR");
		lblproveedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblproveedor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblproveedor.setBounds(10, 551, 256, 42);
		contentPane.add(lblproveedor);
		
		txtproveedor = new JTextField();
		txtproveedor.setHorizontalAlignment(SwingConstants.CENTER);
		txtproveedor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtproveedor.setColumns(10);
		txtproveedor.setBounds(334, 556, 306, 42);
		contentPane.add(txtproveedor);
		
		txtmodificacion = new JTextArea();
		txtmodificacion.setText("\r\n");
		txtmodificacion.setBounds(319, 609, 335, 49);
		contentPane.add(txtmodificacion);		
		
		btnProcesar = new JButton("PROCESAR");
		btnProcesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnProcesar.setBounds(481, 96, 150, 32);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnModificar.setBounds(44, 614, 195, 42);
		contentPane.add(btnModificar);
									
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 19, 150, 32);
		btnModificar.addActionListener(this);
		contentPane.add(btnSalir);
	
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnSalir) {
			dispose();
		} else if (e.getSource() == btnProcesar) {
			mostrarProductos();
		} else if (e.getSource() == btnModificar) {
			modificarProducto();
		}
	}
	
	public void mostrarProductos() {
		String productosA = (String) txtlote.getText();
	    if (productosA.equals("")) {
	        JOptionPane.showMessageDialog(this, "Ingrese un Lote válido.", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    for (String[] producto : MenuPrincipal.getListaProductos()) {
	        if (producto[0].equals(productosA)) {
	        	txtmarca.setText(producto[1]);
	        	txtmodelo.setText(producto[2]);
	        	txtprecio.setText(producto[3]);
	        	txtcantidad.setText(producto[4]);
	        	txtbateria.setText(producto[5]);
	        	txtmemoria.setText(producto[6]);
	        	txtcolor.setText(producto[7]);
	        	txtproveedor.setText(producto[8]);
	            return;
	        }
	    }

        JOptionPane.showMessageDialog(this, "Lote no encontrado.", "Alert", JOptionPane.ERROR_MESSAGE);
	}
	public void modificarProducto() {
		 String productoA = (String) txtlote.getText();
		    String lote = txtlote.getText().trim();
		    String marca = txtmarca.getText().trim();
		    String modelo = txtmodelo.getText().trim();
		    String precio = txtprecio.getText().trim();
		    String cantidad = txtcantidad.getText().trim();
		    String bateria = txtbateria.getText().trim();
		    String memoria = txtmemoria.getText().trim();
		    String color = txtcolor.getText().trim();
		    String proveedor = txtproveedor.getText().trim();

		    if (lote.isEmpty() ||  marca.isEmpty() || modelo.isEmpty() || precio.isEmpty() || cantidad.isEmpty() || bateria.isEmpty() || memoria.isEmpty() || color.isEmpty() || proveedor.isEmpty()) {
		        JOptionPane.showMessageDialog(this, "Complete los campos correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    for (String[] productos : MenuPrincipal.getListaProductos
		    		()) {
		        if (productos[0].equals(productoA)) {
		        	productos[0] = lote;
		        	productos[1] = marca; 
		        	productos[2] = modelo; 
		        	productos[3] = precio; 
		        	productos[4] = cantidad; 
		        	productos[5] = bateria; 
		        	productos[6] = memoria;
		        	productos[7] = color; 
		        	productos[8] = proveedor; 
		            JOptionPane.showMessageDialog(this, "Se modificaron campos del lote " + productoA + " correctamente.", "Modificación Exitosa", JOptionPane.INFORMATION_MESSAGE);
		            return;
		        }
		    }

		    JOptionPane.showMessageDialog(this, "Lote no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	
	
}
