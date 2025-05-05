package Vistas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Vistas.producto.Producto;

import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;	
	private JMenu mnarchivo;
	private JMenuItem mntmsalir;
	private JMenu mnclientes;
	private JMenuItem mntmaltacli;
	private JMenuItem mntmmodcli;
	private JMenuItem mntmelimcli;
	private JMenuItem mntmconsulclie;
	private JMenu mnproductos;
	private JMenuItem mntmaltaprod;
	private JMenuItem mntmmodprod;
	private JMenuItem mntmelimprod;
	private JMenuItem mntmconsulprod;
	private JMenu mnproveedor;
	private JMenuItem mntmaltaprov;
	private JMenuItem mntmmodprov;
	private JMenuItem mntmelimprov;
	private JMenuItem mntmconsulprov;
	private JMenu mnfacturacion;
	private JMenuItem mntmfactura;
	private JMenuItem mntmconsul;
	private JMenu mnconfiguracion;
	private JMenuItem mntmdescuento;
	private JMenuItem mntmregalo;
	private JMenuItem mntmcouv;
	private JMenuItem mntmcuotadia;
	private JMenu mnayuda;
	private JMenuItem mntmacercade;
	private JMenuItem mntmcontact;
	private JMenuItem mntmversion;			
	private JPanel contentPane;
		
    	private static ArrayList<String[]> listaClientes = new ArrayList<>();
    	static {
    		listaClientes.add(new String[]{"12345678", "Aquiles Castro"});
    		listaClientes.add(new String[]{"74852478", "Benito Camelo"});
    		listaClientes.add(new String[]{"12598652", "Paco Gertes"});
    		listaClientes.add(new String[]{"36547521", "Juanito Rosado"});
    	}
    	public static void agregarCliente(String[] datos) {
            listaClientes.add(datos);
            System.out.println("Cliente registrado: " + datos[0] + " - " + datos[1]);
        }
    	public static ArrayList<String[]> getListaClientes() {
    	    return listaClientes;
    	}
    	
    	public static ArrayList<String[]> listaProductos = new ArrayList<>();
    	static {
            listaProductos.add(new String[]{"001", "Sansung", "S24", "5000", "100", "300", "258", "Plateado", "Aleman"});
            listaProductos.add(new String[]{"002", "Motorola", "G30", "500", "100", "300", "258", "Plateado", "Frnaces"});
            listaProductos.add(new String[]{"003", "Iphone", "Iphone 14", "3000", "100", "300", "258", "Plateado", "EEUU"});
            listaProductos.add(new String[]{"004", "Xiaomi", "Redmi 8", "1000", "100", "300", "258", "Plateado", "Chino"});
        }
    	public static void agregarProductos(String[] datosProductos) {
            listaProductos.add(datosProductos);
            System.out.println("Producto registrado: " + datosProductos[1] + " - " + datosProductos[2]);
        }
    	public static ArrayList<String[]> getListaProductos() {
    	    return listaProductos;
    	}
    	
    	public static ArrayList<String[]> listaProveedores = new ArrayList<>();
    	static {
    		listaProveedores.add(new String[]{"123456789123", "Empresas ErIL"});
    		listaProveedores.add(new String[]{"356842595842", "Prueba SA"});
    		listaProveedores.add(new String[]{"452896321475", "Cariñosas SA"});
    		listaProveedores.add(new String[]{"125478956465", "Las Sirenitas SAC"});
        }
    	public static void agregarProveedores(String[] datosProveedores) {
    		listaProveedores.add(datosProveedores);
            System.out.println("Proveedor registrado: " + datosProveedores[0] + " - " + datosProveedores[1]);
        }
    	public static ArrayList<String[]> getListaProveedores() {
    	    return listaProveedores;
    	}
    	
    	private static ArrayList<String[]> codigosBoletas = new ArrayList<>();
    	private static int contadorBoletas = 1;
    	public static void agregarCodBoleta(String[] datos) {
    	    codigosBoletas.add(datos);
    	    contadorBoletas++;
    	}
    	public static ArrayList<String[]> listaCodBoleta = new ArrayList<>();
    	public static String generarCodigoBoleta() {
    	    return String.format("B001-%06d", contadorBoletas);
    	}
    	public static ArrayList<String[]> getCodigosBoletas() {
    	    return codigosBoletas;
    	}
    	
    	// Descuento del 10% por compras de 1 a 5 unidaes
		public static double porcentaje1 = 10;
		// Descuento del 20% por compras de 6 a 10 unidaes
		public static double porcentaje2 = 20;
		// Descuento del 30% por compras de 11 a 15 unidaes
		public static double porcentaje3 = 30;
		// Descuento del 40% por compras de 16 a 20 unidaes
		public static double porcentaje4 = 40;

		// Regalo por la compra de 1 unidad
		public static String obsequio1 = "Vidrio templado";
		// Regalo por la compra de 2 a 5 unidad
		public static String obsequio2 = "Auriculares inalambricos";
		// Regalo por la compra de 6 a mas unidad
		public static String obsequio3 = "Parlantes Bluetooth";
		
		// Cantidad optima de unidades vendidas
		public static int UVendida = 15;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MenuPrincipal() {
		setFont(new Font("Dialog", Font.PLAIN, 18));
		setTitle("Telemobil.Corp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 516);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnarchivo = new JMenu("Archivo");
		mnarchivo.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnarchivo.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnarchivo);
		
		mntmsalir = new JMenuItem("Salir");
		mntmsalir.addActionListener(this);
		mntmsalir.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/Salir.jpg")));
		mntmsalir.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnarchivo.add(mntmsalir);
		
		mnclientes = new JMenu("Clientes");
		mnclientes.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnclientes);
		
		mntmaltacli = new JMenuItem("Alta");
		mntmaltacli.addActionListener(this);	
		mntmaltacli.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/11507943.jpg")));
		mntmaltacli.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnclientes.add(mntmaltacli);
		
		mntmmodcli = new JMenuItem("Modificación");
		mntmmodcli.addActionListener(this); 
		mntmmodcli.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMAG90.jpg")));
		mntmmodcli.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnclientes.add(mntmmodcli);
		
		mntmelimcli = new JMenuItem("Eliminación");
		mntmelimcli.addActionListener(this); 
		mntmelimcli.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG10.jpg")));
		mntmelimcli.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnclientes.add(mntmelimcli);
		
		mntmconsulclie = new JMenuItem("Consultar");
		mntmconsulclie.addActionListener(this);
		mntmconsulclie.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG30.jpg")));
		mntmconsulclie.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnclientes.add(mntmconsulclie);
		
		mnproductos = new JMenu("Productos");
		mnproductos.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnproductos);
		
		mntmaltaprod = new JMenuItem("Alta");
		mntmaltaprod.addActionListener(this);
		mntmaltaprod.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/11507943.jpg")));
		mntmaltaprod.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnproductos.add(mntmaltaprod);
		
		mntmmodprod = new JMenuItem("Modificación");
		mntmmodprod.addActionListener(this);
		mntmmodprod.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMAG90.jpg")));
		mntmmodprod.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnproductos.add(mntmmodprod);
		
		mntmelimprod = new JMenuItem("Eliminación");
		mntmelimprod.addActionListener(this);
		mntmelimprod.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG10.jpg")));
		mntmelimprod.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnproductos.add(mntmelimprod);
		
		mntmconsulprod = new JMenuItem("Consultar");
		mntmconsulprod.addActionListener(this);
		mntmconsulprod.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG110.jpg")));
		mntmconsulprod.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnproductos.add(mntmconsulprod);
		
		mnproveedor = new JMenu("Proveedores");
		mnproveedor.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnproveedor);
		
		mntmaltaprov = new JMenuItem("Alta");
		mntmaltaprov.addActionListener(this);
		mntmaltaprov.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/11507943.jpg")));
		mntmaltaprov.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnproveedor.add(mntmaltaprov);
		
		mntmmodprov = new JMenuItem("Modificación");
		mntmmodprov.addActionListener(this);
		mntmmodprov.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMAG90.jpg")));
		mntmmodprov.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnproveedor.add(mntmmodprov);
		
		mntmelimprov = new JMenuItem("Eliminación");
		mntmelimprov.addActionListener(this);
		mntmelimprov.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG10.jpg")));
		mntmelimprov.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnproveedor.add(mntmelimprov);
		
		mntmconsulprov = new JMenuItem("Consultar");
		mntmconsulprov.addActionListener(this);
		mntmconsulprov.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG110.jpg")));
		mntmconsulprov.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnproveedor.add(mntmconsulprov);
		
		mnfacturacion = new JMenu("Facturación");
		mnfacturacion.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnfacturacion);
		
		mntmfactura = new JMenuItem("Facturar");
		mntmfactura.addActionListener(this);
		mntmfactura.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG20.jpg")));
		mntmfactura.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnfacturacion.add(mntmfactura);
		
		mntmconsul = new JMenuItem("Consulta ");
		mntmconsul.addActionListener(this);
		mntmconsul.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG110.jpg")));
		mntmconsul.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnfacturacion.add(mntmconsul);
		
		mnconfiguracion = new JMenu("Configuración");
		mnconfiguracion.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnconfiguracion);
		
		mntmdescuento = new JMenuItem("Descuento");
		mntmdescuento.addActionListener(this);
		mntmdescuento.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG130.jpg")));
		mntmdescuento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnconfiguracion.add(mntmdescuento);
		
		mntmregalo = new JMenuItem("Regalo");
		mntmregalo.addActionListener(this);
		mntmregalo.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/Regalo.jpg")));
		mntmregalo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnconfiguracion.add(mntmregalo);
		
		mntmcouv = new JMenuItem("COUV");
		mntmcouv.addActionListener(this);
		mntmcouv.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG140.jpg")));
		mntmcouv.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnconfiguracion.add(mntmcouv);
		
		mntmcuotadia = new JMenuItem("Cuota diaria");
		mntmcuotadia.addActionListener(this);
		mntmcuotadia.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG180.jpg")));
		mntmcuotadia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnconfiguracion.add(mntmcuotadia);
		
		mnayuda = new JMenu("Ayuda");
		mnayuda.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMGPP.jpg")));
		mnayuda.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnayuda);
		
		mntmacercade = new JMenuItem("Acerca de...");
		mntmacercade.addActionListener(this);
		mntmacercade.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG190.jpg")));
		mntmacercade.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnayuda.add(mntmacercade);
		
		mntmcontact = new JMenuItem("Contactos");
		mntmcontact.addActionListener(this);
		mntmcontact.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG230.jpg")));
		mntmcontact.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnayuda.add(mntmcontact);
		
		mntmversion = new JMenuItem("Version");
		mntmversion.addActionListener(this);
		mntmversion.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/IMG/IMG250.jpg")));
		mntmversion.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnayuda.add(mntmversion);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
	
		
		PanelFondoCelulares p = new PanelFondoCelulares();
	    p.setBorder(new EmptyBorder(5, 5, 5, 5));
	    p.setLayout(new BorderLayout(0, 0));
	    setContentPane(p);
	    p.setLayout(null);}
			
		//Metodo Actionperformed
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == mntmsalir) {
	            actionPerformedmntmsalir(e);
	        }
	        if (e.getSource() == mntmaltacli) {
	            actionPerformedmntmaltacli(e);
	        }
	        if (e.getSource() == mntmmodcli) {
	            actionPerformedmntmmodcli(e);
	        }
	        if (e.getSource() == mntmelimcli) {
	            actionPerformedmntmelimcli(e);
	        }
	        if (e.getSource() == mntmconsulclie) {
	            actionPerformedmntmconsulclie(e);
	        }
	        if (e.getSource() == mntmaltaprod) {
	            actionPerformedmntmaltaprod(e);
	        }
	        if (e.getSource() == mntmmodprod) {
	            actionPerformedmntmmodprod(e);
	        }
	        if (e.getSource() == mntmelimprod) {
	            actionPerformedmntmelimprod(e);
	        }
	        if (e.getSource() == mntmconsulprod) {
	            actionPerformedmntmconsulprod(e);
	        }
	        if (e.getSource() == mntmaltaprov) {
	            actionPerformedmntmaltaprov(e);
	        }
	        if (e.getSource() == mntmmodprov) {
	            actionPerformedmntmmodprov(e);
	        }
	        if (e.getSource() == mntmelimprov) {
	            actionPerformedmntmelimprov(e);
	        }
	        if (e.getSource() == mntmconsulprov) {
	            actionPerformedmntmconsulprov(e);
	        }
	        if (e.getSource() == mntmfactura) {
	            actionPerformedmntmfactura(e);
	        }
	        if (e.getSource() == mntmconsul) {
	            actionPerformedmntmconsul(e);
	        }
	        if (e.getSource() == mntmdescuento) {
	            actionPerformedmntmdescuento(e);
	        }
	        if (e.getSource() == mntmregalo) {
	            actionPerformedmntmregalo(e);
	        }
	        if (e.getSource() == mntmcouv) {
	            actionPerformedmntmcouv(e);
	        }
	        if (e.getSource() == mntmcuotadia) {
	            actionPerformedmntmcuotadia(e);
	        }
	        if (e.getSource() == mntmacercade) {
	            actionPerformedmntmacercade(e);
	        }
	        if (e.getSource() == mntmcontact) {
	            actionPerformedmntmcontact(e);
	        }
	        if (e.getSource() == mntmversion) {
	            actionPerformedmntmversion(e);
	        }
	   }
	      	        	        	        
			protected void actionPerformedmntmsalir(ActionEvent e) {
				System.exit(0);
			}
			protected void actionPerformedmntmaltacli(ActionEvent e) {				
				AltaClientes newframe = new AltaClientes();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);			
		    }			
			protected void actionPerformedmntmmodcli(ActionEvent e) {
				ModificacionClientes newframe = new ModificacionClientes();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);
			}
			protected void actionPerformedmntmelimcli(ActionEvent e) {
				EliminacionClientes newframe = new EliminacionClientes();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);
			}
			protected void actionPerformedmntmconsulclie(ActionEvent e) {
				ConsultarClientes newframe = new ConsultarClientes();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmaltaprod(ActionEvent e) {
				AltaProductos newframe = new AltaProductos();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmmodprod(ActionEvent e) {
				ModificacionProductos newframe = new ModificacionProductos();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmelimprod(ActionEvent e) {
				EliminacionProductos newframe = new EliminacionProductos();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmconsulprod(ActionEvent e) {
				ConsultarProductos newframe = new ConsultarProductos();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmaltaprov(ActionEvent e) {
				AltaProovedores newframe = new AltaProovedores();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmmodprov(ActionEvent e) {
				ModificacionProveedores newframe = new ModificacionProveedores();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmelimprov(ActionEvent e) {
				EliminacionProveedores newframe = new EliminacionProveedores();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmconsulprov(ActionEvent e) {
				ConsultaProveedores newframe = new ConsultaProveedores();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmfactura(ActionEvent e) {
				Facturacion newframe = new Facturacion();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmconsul(ActionEvent e) {
				ConsultarFacturacion newframe = new ConsultarFacturacion();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmdescuento(ActionEvent e) {
				DESCUENTO newframe = new DESCUENTO();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmregalo(ActionEvent e) {
				REGALO newframe = new REGALO();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmcouv(ActionEvent e) {
				COUV newframe = new COUV();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmcuotadia(ActionEvent e) {
				CUOTA newframe = new CUOTA();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmacercade(ActionEvent e) {
				Acercade newframe = new Acercade();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmcontact(ActionEvent e) {
				Contactos newframe = new Contactos();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}
			protected void actionPerformedmntmversion(ActionEvent e) {
				Version newframe = new Version();
				newframe.setLocationRelativeTo(null);						
				newframe.setVisible(true);	
			}				
}

	
	


