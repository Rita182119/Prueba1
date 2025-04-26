package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setFont(new Font("Dialog", Font.PLAIN, 18));
		setTitle("Telemobil.Corp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 516);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("     Salir");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Alta");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Modificacion");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Eliminacion");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Productos");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4_1 = new JMenuItem("Alta");
		mntmNewMenuItem_4_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_4_1);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("Modificacion");
		mntmNewMenuItem_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_2_1);
		
		JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("Eliminacion");
		mntmNewMenuItem_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_3_1);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Consultar");
		mntmNewMenuItem_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_1_1);
		
		JMenu mnNewMenu_5 = new JMenu("Proveedores");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4_1_1 = new JMenuItem("Alta");
		mntmNewMenuItem_4_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_5.add(mntmNewMenuItem_4_1_1);
		
		JMenuItem mntmNewMenuItem_2_1_1 = new JMenuItem("Modificacion");
		mntmNewMenuItem_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_5.add(mntmNewMenuItem_2_1_1);
		
		JMenuItem mntmNewMenuItem_3_1_1 = new JMenuItem("Eliminacion");
		mntmNewMenuItem_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_5.add(mntmNewMenuItem_3_1_1);
		
		JMenuItem mntmNewMenuItem_1_1_1 = new JMenuItem("Consultar");
		mntmNewMenuItem_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_5.add(mntmNewMenuItem_1_1_1);
		
		JMenu mnNewMenu_6 = new JMenu("Facturación");
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_1_1_2 = new JMenuItem("Facturar");
		mntmNewMenuItem_1_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_6.add(mntmNewMenuItem_1_1_2);
		
		JMenuItem mntmNewMenuItem_2_1_2 = new JMenuItem("Consulta ");
		mntmNewMenuItem_2_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_6.add(mntmNewMenuItem_2_1_2);
		
		JMenu mnNewMenu_3 = new JMenu("Configuracion");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Descuento");
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_1_1_3 = new JMenuItem("Regalo");
		mntmNewMenuItem_1_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_3.add(mntmNewMenuItem_1_1_3);
		
		JMenuItem mntmNewMenuItem_2_1_3 = new JMenuItem("COUV");
		mntmNewMenuItem_2_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_3.add(mntmNewMenuItem_2_1_3);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		mnNewMenu_4.setIcon(new ImageIcon("C:\\Users\\Frank\\Desktop\\5360776.jpg"));
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_1_1_4 = new JMenuItem("Acerca de...");
		mntmNewMenuItem_1_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_4.add(mntmNewMenuItem_1_1_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Contactos");
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Comentarios");
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_4.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_2_1_4 = new JMenuItem("Version");
		mntmNewMenuItem_2_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_4.add(mntmNewMenuItem_2_1_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
	}
}
