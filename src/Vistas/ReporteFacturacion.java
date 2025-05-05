package Vistas;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReporteFacturacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblreporte;
	private JComboBox cboreporte;
	private JScrollPane scpresultado;
	private JTextArea txtresultado;
	private JButton btncerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReporteFacturacion frame = new ReporteFacturacion(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param arrayList 
	 */
	public ReporteFacturacion(ArrayList<String[]> arrayList) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 553);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(206, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblreporte = new JLabel("Tipo de Reporte");
		lblreporte.setBounds(20, 26, 104, 14);
		contentPane.add(lblreporte);
		
		cboreporte = new JComboBox();
		cboreporte.setBounds(116, 22, 294, 22);
		cboreporte.addItem("Venta por modelo");
		cboreporte.addItem("Venta por relación a la venta óptima");
		cboreporte.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	mostrarNombreActual();
		    }
		});
		contentPane.add(cboreporte);
		
		scpresultado = new JScrollPane();
		scpresultado.setBounds(20, 76, 566, 409);
		contentPane.add(scpresultado);
		
		txtresultado = new JTextArea();
		scpresultado.setViewportView(txtresultado);
		cboreporte.setSelectedIndex(0);
		mostrarNombreActual();
		
		btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncerrar.setBounds(497, 22, 89, 23);
		contentPane.add(btncerrar);
	}
	
	public void mostrarNombreActual() {
		String opcionSeleccionada = (String) cboreporte.getSelectedItem();
	    if (opcionSeleccionada.equals("Venta por modelo")) {
	        mostrarResumenPorModelo();
	    } else if (opcionSeleccionada.equals("Venta por relación a la venta óptima")) {
	        mostrarComparacionConVentaOptima();
	    } else {
	        txtresultado.setText("Opción no reconocida.");
	    }
	}
	public void mostrarResumenPorModelo() {
	    ArrayList<String[]> ventas = MenuPrincipal.getCodigosBoletas();
	    HashMap<String, Integer> cantidades = new HashMap<>();
	    HashMap<String, Double> totales = new HashMap<>();
	    

	    for (String[] venta : ventas) {
	        String modelo = venta[2];
	        int cantidad = Integer.parseInt(venta[4]);
	        double importe = Double.parseDouble(venta[7]);

	        cantidades.put(modelo, cantidades.getOrDefault(modelo, 0) + cantidad);
	        totales.put(modelo, totales.getOrDefault(modelo, 0.0) + importe);
	    }

	    txtresultado.setText("RESUMEN POR MODELO\n\n");
	    for (String modelo : cantidades.keySet()) {
	        int cantidadTotal = cantidades.get(modelo);
	        double totalModelo = totales.get(modelo);
	        txtresultado.append("Modelo: " + modelo + "\n");
	        txtresultado.append(" - Cantidad Total Vendida: " + cantidadTotal + "\n");
	        txtresultado.append(" - Total Recaudado: S/. " + totalModelo + "\n");
	        txtresultado.append("-------------------------------------------\n");
	    }
	}
	public void mostrarComparacionConVentaOptima() {
	    ArrayList<String[]> ventas = MenuPrincipal.getCodigosBoletas();
	    HashMap<String, Integer> cantidades = new HashMap<>();

	    int TOPE_SUGERIDO = MenuPrincipal.UVendida;

	    for (String[] venta : ventas) {
	        String modelo = venta[2];
	        int cantidad = Integer.parseInt(venta[4]);
	        cantidades.put(modelo, cantidades.getOrDefault(modelo, 0) + cantidad);
	    }

	    txtresultado.setText("COMPARACIÓN CON TOPE SUGERIDO DE VENTA\n\n");

	    for (String[] modelo : MenuPrincipal.getListaProductos()) {
	        int cantidadVendida = cantidades.getOrDefault(modelo, 0);
	        txtresultado.append("Modelo: " + modelo[1] + " - " + modelo[2] + "\n");
	        txtresultado.append(" - Unidades vendidas: " + cantidadVendida + "\n");

	        if (cantidadVendida >= TOPE_SUGERIDO) {
	            txtresultado.append(" - ✅ ¡Meta alcanzada o superada!\n");
	        } else {
	            txtresultado.append(" - ⚠️ No se alcanzó la meta (faltan " + (TOPE_SUGERIDO - cantidadVendida) + " unidades)\n");
	        }

	        txtresultado.append("-------------------------------------------\n");
	    }
	}
	

}
