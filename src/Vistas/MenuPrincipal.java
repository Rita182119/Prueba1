package Vistas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
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
	
	// Declarando Variables Globales 
		// Datos mínimos de la 1ra cocina
		public static String modelo0 ="SAMSUNG SM-A215U NEGRO";
		public static double precio0 = 949.0;
		public static double fondo0 = 58.6;
		public static double ancho0 = 60.0;
		public static double alto0 = 91.0;
		public static int quemadores0 = 4;
		// Datos mínimos de la 2da cocina
		public static String modelo1 = "LG A567";
		public static double precio1 = 1089.0;
		public static double ancho1 = 80.0;
		public static double alto1 = 94.0;
		public static double fondo1 = 67.5;
		public static int quemadores1 = 6;

		// Porcentajes de descuento
		public static double porcentaje1 = 7.5;
		public static double porcentaje2 = 10.0;
		public static double porcentaje3 = 12.5;
		public static double porcentaje4 = 15.0;

		// Obsequios
		public static String obsequio1 = "Cupon de Dst. del 50% en las Sirenitas";
		public static String obsequio2 = "Cupon de Dst. del 70% en las Sirenitas";
		public static String obsequio3 = "Servicio completo por 1 día";

		// Parámetros adicionales
		public static int cantidadOptima = 30;
		public static double cuotaDiaria = 75000.0;
		
		// VARIABLES PUBLIC STATICS GLOBALES NUEVAS 
		// Importe acumulado de ventas por modelo
		public static double importeAcumulado0, importeAcumulado1, importeAcumulado2,
		                      importeAcumulado3, importeAcumulado4, importeAcumuladoTotal;

		// Porcentaje de cuota diaria por modelo
		public static double porcentajeCuota0, porcentajeCuota1, porcentajeCuota2,
		                      porcentajeCuota3, porcentajeCuota4, porcentajeCuotaTotal;

		// Contador de cantidad acumulada de ventas por modelo
		public static int contadorVenta0, contadorVenta1, contadorVenta2,
		                  contadorVenta3, contadorVenta4, contadorVentaTotal;

		// Cantidad acumulada de unidades vendidas por modelo
		public static int cantUniVendidas0, cantUniVendidas1, cantUniVendidas2,
		                  cantUniVendidas3, cantUniVendidas4;
	
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

	
	


