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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.util.HashMap;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class Facturacion extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcantidad;
	private JLabel lblmodelo;
	private JLabel lblprecio;
	private JLabel lblcantidad;
	private JComboBox <String> cmbmodelo;
	private JButton btnSalir;
	private JButton btnFacturar;
	private JTextArea txtprecio;
	private JLabel lbltitulo14;
	private JScrollPane scpfacturacion;
	private JTextArea txtfacturacion;
	private double precioVenta, impCompra, impDescuento, impPagar;
	private int cantidadVenta;
    private String obsequio;
    private JLabel lblcliente;
    private JComboBox <String> cbocliente;
    private HashMap<String, String> clientes;
    private HashMap<String, String> productos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facturacion frame = new Facturacion();
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
	public Facturacion() {
		setTitle("FACTURACION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 727, 726);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(208, 236, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblmodelo = new JLabel("Modelo");
		lblmodelo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblmodelo.setBounds(118, 48, 170, 42);
		contentPane.add(lblmodelo);
		
		lblprecio = new JLabel("Precio (S/)");
		lblprecio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblprecio.setBounds(118, 146, 170, 42);
		contentPane.add(lblprecio);
		
		lblcantidad = new JLabel("Cantidad");
		lblcantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcantidad.setBounds(118, 187, 170, 42);
		contentPane.add(lblcantidad);
		
		cmbmodelo = new JComboBox<String>();
		cmbmodelo.setBounds(333, 56, 223, 30);
		cmbmodelo.addItem("Seleccione un producto");
		for (String[] producto : MenuPrincipal.getListaProductos()) {
			cmbmodelo.addItem(producto[1] + " - " + producto[2]);
		}
		cmbmodelo.addItemListener(this);
		contentPane.add(cmbmodelo);
		
		txtprecio = new JTextArea();
		txtprecio.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtprecio.setBounds(333, 154, 223, 31);
		txtprecio.setEditable(false);
		contentPane.add(txtprecio);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(333, 196, 223, 29);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		lbltitulo14 = new JLabel("FACTURACION");
		lbltitulo14.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitulo14.setBounds(258, -5, 210, 42);
		contentPane.add(lbltitulo14);	
	
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(598, 11, 103, 30);
		contentPane.add(btnSalir);
			
		scpfacturacion = new JScrollPane();
		scpfacturacion.setBounds(57, 302, 587, 299);
		contentPane.add(scpfacturacion);
		
		txtfacturacion = new JTextArea();
		txtfacturacion.setEditable(false);
		scpfacturacion.setViewportView(txtfacturacion);
				
		btnFacturar = new JButton("EMITIR COMPROBANTE");
		btnFacturar.addActionListener(this);
		btnFacturar.setBounds(264, 249, 204, 42);
		contentPane.add(btnFacturar);
		
		lblcliente = new JLabel("Cliente");
		lblcliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcliente.setBounds(118, 101, 84, 34);
		contentPane.add(lblcliente);
		
		cbocliente = new JComboBox();
		cbocliente.setBounds(333, 109, 223, 31);
		cbocliente.addItem("Seleccione el cliente");
		for (String[] cliente : MenuPrincipal.getListaClientes()) {
			cbocliente.addItem(cliente[1]);
		}		
		contentPane.add(cbocliente);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnFacturar) {
            actionPerformedBtnVender(e);
        }
		if (e.getSource()==btnSalir) {
			actionPerformedbtnSalir (e);
		}				
	}
	protected void actionPerformedbtnSalir(ActionEvent e) {
		dispose();
	}	
	public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cmbmodelo) {
            itemStateChangedCboModelo(e);
        }
    }
	
	 protected void itemStateChangedCboModelo(ItemEvent e) {
	        int item = cmbmodelo.getSelectedIndex();
	        txtprecio.setText("" + precio(item));
	    }

	 protected double precio(int item) {
		    if (item <= 0 || item > MenuPrincipal.getListaProductos().size()) return 0.0;
		    String[] producto = MenuPrincipal.getListaProductos().get(item - 1); 
		    return Double.parseDouble(producto[3]);
	}
    protected void actionPerformedBtnVender(ActionEvent e) {    	
        if (cbocliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cmbmodelo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un modelo.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String cantidadTexto = txtcantidad.getText().trim();
        if (cantidadTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int cantidad = Integer.parseInt(cantidadTexto);
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a cero.", "Validación", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtprecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione un modelo para cargar el precio.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        obtenerDatos();
        importeCompra();
        importeDescuento();
        importePagar();
        obtenerObsequio();
        mostrarResultados();
    }
    
    void obtenerDatos() {
        precioVenta = Double.parseDouble(txtprecio.getText());
        cantidadVenta = Integer.parseInt(txtcantidad.getText());
    }
    
    void importeCompra() {
        impCompra = precioVenta * cantidadVenta;
    }
    
    void importeDescuento() {
        if (cantidadVenta >= 16) impDescuento = impCompra * MenuPrincipal.porcentaje4 / 100;
        else if (cantidadVenta >= 11) impDescuento = impCompra * MenuPrincipal.porcentaje3 / 100;
        else if (cantidadVenta >= 6) impDescuento = impCompra * MenuPrincipal.porcentaje2 / 100;
        else impDescuento = impCompra * MenuPrincipal.porcentaje1 / 100;
    }
    
    void importePagar() {
        impPagar = impCompra - impDescuento;
    }
    
    void obtenerObsequio() {
        if (cantidadVenta >= 6) obsequio = MenuPrincipal.obsequio3;
        else if (cantidadVenta >= 2) obsequio = MenuPrincipal.obsequio2;
        else obsequio = MenuPrincipal.obsequio1;
    }
    
    void mostrarResultados() {
	        String codigoBoleta = MenuPrincipal.generarCodigoBoleta();
	        String clienteSeleccionado = (String) cbocliente.getSelectedItem();
	        String modeloSeleccionado = (String) cmbmodelo.getSelectedItem();
	        txtfacturacion.setText("");
	        txtfacturacion.append("                                                               ----------------------------------------------\n");
	        txtfacturacion.append("                                                               BOLETA DE VENTA " + codigoBoleta +  "\n");
	        txtfacturacion.append("                                                               ----------------------------------------------\n");
	        txtfacturacion.append("\n\n");
	        txtfacturacion.append("Codigo de Boleta...........:  " + codigoBoleta + "\n");
	        String[] datosCodBoleta = {
	        	    codigoBoleta, 
	        	    clienteSeleccionado, 
	        	    modeloSeleccionado,
	        	    String.valueOf(precioVenta), 
	        	    String.valueOf(cantidadVenta),
	        	    String.valueOf(impPagar),
	        	    String.valueOf(impDescuento),
	        	    String.valueOf(impPagar),
	        	    obsequio
	        	};
	        MenuPrincipal.agregarCodBoleta(datosCodBoleta);
	        txtfacturacion.append("Cliente..............................: " + clienteSeleccionado + "\n");
	        txtfacturacion.append("Modelo.............................: " + modeloSeleccionado + "\n");
	        txtfacturacion.append("Precio...............................: S/. " + precioVenta + "\n");
	        txtfacturacion.append("Cantidad..........................: " + cantidadVenta + "\n");
	        txtfacturacion.append("Importe compra..............: S/. " + impCompra + "\n");
	        txtfacturacion.append("Importe descuento.........: S/. " + impDescuento + "\n");
	        txtfacturacion.append("Importe pagar.................: S/. " + impPagar + "\n");
	        txtfacturacion.append("Obsequio.........................: " + obsequio);
	    	JOptionPane.showMessageDialog(this, "Se realizo la venta Exitosamente.", "Alert", JOptionPane.INFORMATION_MESSAGE);
	        txtcantidad.setText("");
	        cmbmodelo.setSelectedIndex(0);
	        cbocliente.setSelectedIndex(0);
    }    
	
}
