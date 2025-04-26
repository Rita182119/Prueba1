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
		lblprecio.setBounds(118, 108, 170, 42);
		contentPane.add(lblprecio);
		
		lblcantidad = new JLabel("Cantidad");
		lblcantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcantidad.setBounds(118, 159, 170, 42);
		contentPane.add(lblcantidad);
		
		cmbmodelo = new JComboBox<String>();
		cmbmodelo.addItemListener(this);
		cmbmodelo.setModel(new DefaultComboBoxModel<String>(new String[] {"SAMSUNG SM-A215U NEGRO", "LG A567"}));
		cmbmodelo.setBounds(333, 56, 223, 30);
		contentPane.add(cmbmodelo);
		
		txtprecio = new JTextArea();
		txtprecio.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtprecio.setBounds(333, 116, 223, 31);
		contentPane.add(txtprecio);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(333, 166, 223, 29);
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
		
		txtprecio.setText(""+MenuPrincipal.precio0);
		
		btnFacturar = new JButton("EMITIR COMPROBANTE");
		btnFacturar.addActionListener(this);
		btnFacturar.setBounds(247, 212, 204, 42);
		contentPane.add(btnFacturar);
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
	        // Cargando el valor del precio de acuerdo al comboBox modelo
	        int item = cmbmodelo.getSelectedIndex();
	        txtprecio.setText("" + precio(item));
	    }

	    protected double precio(int item) {
	        switch (item) {
	            case 0: return MenuPrincipal.precio0;
	            default: return MenuPrincipal.precio1;
	        }
	    }
	    
	    protected void actionPerformedBtnVender(ActionEvent e) {
	        // Llamando a los métodos
	        obtenerDatos();
	        importeCompra();
	        importeDescuento();
	        importePagar();
	        obtenerObsequio();
	        mostrarResultados();
	        contAcum();
	        contAcumTotal();
	        mostrarMensajePantalla();
	    }
	    
	 // Metodo para obtener los valores de las JTextField
	    void obtenerDatos() {
	        precioVenta = Double.parseDouble(txtprecio.getText());
	        cantidadVenta = Integer.parseInt(txtcantidad.getText());
	    }
	    
	 // Metodo Calcular importe de compra
	    void importeCompra() {
	        impCompra = precioVenta * cantidadVenta;
	    }
	    
	 // Metodo para calcular importe de descuento
	    void importeDescuento() {
	        if (cantidadVenta >= 16) impDescuento = impCompra * MenuPrincipal.porcentaje4 / 100;
	        else if (cantidadVenta >= 11) impDescuento = impCompra * MenuPrincipal.porcentaje3 / 100;
	        else if (cantidadVenta >= 6) impDescuento = impCompra * MenuPrincipal.porcentaje2 / 100;
	        else impDescuento = impCompra * MenuPrincipal.porcentaje1 / 100;
	    }
	    
	 // Metodo para calcular importe a Pagar
	    void importePagar() {
	        impPagar = impCompra - impDescuento;
	    }
	    
	 // Metodo para determinar el tipo de obsequio
	    void obtenerObsequio() {
	        if (cantidadVenta >= 6) obsequio = MenuPrincipal.obsequio3;
	        else if (cantidadVenta >= 2) obsequio = MenuPrincipal.obsequio2;
	        else obsequio = MenuPrincipal.obsequio1;
	    }
	    
	 // Metodo para mostrar los resultados en el JTextArea
	    void mostrarResultados() {
	        // Creando el objeto formato1 tipo DecimalFormat que realizará el redondeo de los valores a 2 decimales
	        
	        // Mostrando el resultado de la venta en el txtArea
	        txtfacturacion.setText("");
	        txtfacturacion.append("BOLETA DE VENTA\n\n");
	        txtfacturacion.append("Modelo : " + cmbmodelo.getSelectedItem() + "\n");
	        txtfacturacion.append("Precio : S/. " + precioVenta + "\n");
	        txtfacturacion.append("Cantidad : " + cantidadVenta + "\n");
	        txtfacturacion.append("Importe compra : S/. " + impCompra + "\n");
	        txtfacturacion.append("Importe descuento : S/. " + impDescuento + "\n");
	        txtfacturacion.append("Importe pagar : S/. " + impPagar + "\n");
	        txtfacturacion.append("Obsequio : " + obsequio);
	    }
	    
	 // Metodo calcular los contadores y acumuladores por modelo
	    void contAcum() {
	        int item = cmbmodelo.getSelectedIndex();

	        switch (item) {
	            case 0:
	            	MenuPrincipal.contadorVenta0++;
	            	MenuPrincipal.importeAcumulado0 += impPagar;
	            	MenuPrincipal.porcentajeCuota0 = (MenuPrincipal.importeAcumulado0 / MenuPrincipal.cuotaDiaria) * 100;
	            	MenuPrincipal.cantUniVendidas0 += cantidadVenta;
	                break;

	            default:
	            	MenuPrincipal.contadorVenta4++;
	            	MenuPrincipal.importeAcumulado4 += impPagar;
	            	MenuPrincipal.porcentajeCuota4 = (MenuPrincipal.importeAcumulado4 / MenuPrincipal.cuotaDiaria) * 100;
	            	MenuPrincipal.cantUniVendidas4 += cantidadVenta;
	        }
	    }
	    
	 // Metodo calcular los contadores y acumuladores totales
	    void contAcumTotal() {
	    	MenuPrincipal.contadorVentaTotal++;
	    	MenuPrincipal.importeAcumuladoTotal += impPagar;
	    	MenuPrincipal.porcentajeCuotaTotal += (impPagar / MenuPrincipal.cuotaDiaria) * 100;
	    }

	    // Metodo mostrar mensaje en pantalla cada 5 ventas
	    void mostrarMensajePantalla() {
	        // Verificando si la cantidad de ventas acumuladas es múltiplo de 5
	        if (MenuPrincipal.contadorVentaTotal % 5 == 0) {
	            JOptionPane.showInternalMessageDialog(null,
	                "Venta Nro. " + MenuPrincipal.contadorVentaTotal + "\n" +
	                "Importe total general acumulado: S/." + Math.round(MenuPrincipal.importeAcumuladoTotal * 100.0) / 100.0 + "\n" +
	                "Porcentaje de la cuota diaria: " + Math.round(MenuPrincipal.porcentajeCuotaTotal * 100.0) / 100.0 + "%",
	                "Avance de Ventas", JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
}
