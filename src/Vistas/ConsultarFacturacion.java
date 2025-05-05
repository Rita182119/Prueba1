package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConsultarFacturacion extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnrocp;
	private JButton btnsalir;
	private JLabel lbltitulo5;
	private JLabel lblnrocp;
	private JButton btnConsultar;
	private JTextArea txtcomprobante;
	private JButton btnRV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarFacturacion frame = new ConsultarFacturacion();
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
	public ConsultarFacturacion() {
		setTitle("FACTURACION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 734, 617);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(206, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		lbltitulo5 = new JLabel("CONSULTA DE COMPROBANTES");
		lbltitulo5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitulo5.setBounds(152, 15, 428, 42);
		contentPane.add(lbltitulo5);
		
		lblnrocp = new JLabel("NUMERO DE COMPROBANTE");
		lblnrocp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblnrocp.setBounds(69, 124, 232, 42);
		contentPane.add(lblnrocp);
		
		txtcomprobante = new JTextArea();
		txtcomprobante.setText("\r\n\r\n");
		txtcomprobante.setBounds(10, 287, 691, 278);
		contentPane.add(txtcomprobante);
		
		txtnrocp = new JTextField();
		txtnrocp.setHorizontalAlignment(SwingConstants.CENTER);
		txtnrocp.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtnrocp.setBounds(382, 127, 242, 41);
		contentPane.add(txtnrocp);
		txtnrocp.setColumns(10);		
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(124, 228, 204, 42);
		contentPane.add(btnConsultar);
		btnConsultar.addActionListener(e -> buscarCodBoleta());
		
		btnRV = new JButton("REGISTRO DE VENTAS");
		btnRV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRV.setBounds(376, 228, 204, 42);
		btnRV.addActionListener(e -> {
			ReporteFacturacion ventanaLista = new ReporteFacturacion(MenuPrincipal.getCodigosBoletas());
		    ventanaLista.setVisible(true);
		});
		contentPane.add(btnRV);
						
		btnsalir = new JButton("SALIR");
		btnsalir.addActionListener(this);
		btnsalir.setBounds(598, 27, 103, 30);
		contentPane.add(btnsalir);	
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnsalir) {
			actionPerformedbtnsalir(e);
		}
	}
		protected void actionPerformedbtnsalir(ActionEvent e) {
	        dispose();
		
	}
		private void buscarCodBoleta() {
		    String codigoBoletaIngresado = txtnrocp.getText().trim();

		    if (codigoBoletaIngresado.isEmpty()) {
		        JOptionPane.showMessageDialog(this, "Ingrese un RUC para buscar.");
		        return;
		    }

		    ArrayList<String[]> CodBoletas = MenuPrincipal.getCodigosBoletas();

		    for (String[] codigo : CodBoletas) {
		        if (codigo[0].equalsIgnoreCase(codigoBoletaIngresado)) {
		        	txtcomprobante.setText("\n");		        	
		        	txtcomprobante.append("  Codigo de Boleta     " + codigo[0] + "\n");
		        	txtcomprobante.append("  Cliente..............................: " + codigo[1] + "\n");
		        	txtcomprobante.append("  Modelo.............................: " + codigo[2] + "\n");
		        	txtcomprobante.append("  Precio...............................: S/. " + codigo[3] + "\n");
		        	txtcomprobante.append("  Cantidad..........................: " + codigo[4] + "\n");
		        	txtcomprobante.append("  Importe compra..............: S/. " + codigo[5] + "\n");
		        	txtcomprobante.append("  Importe descuento.........: S/. " + codigo[6] + "\n");
		        	txtcomprobante.append("  Importe pagar.................: S/. " + codigo[7] + "\n");
		        	txtcomprobante.append("  Obsequio.........................: " + codigo[8]);
		        	return;
		        }
		    }

		    txtcomprobante.setText("Codigo de Boleta no encontrado.");
		}
		
	
}
