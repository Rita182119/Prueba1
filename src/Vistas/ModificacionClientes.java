package Vistas;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

public class ModificacionClientes extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnomyapelli;
	private JLabel lbltitulo15;
	private JLabel lbldni;
	private JLabel lblnomyapelli;
	private JButton btnModificar;
	private JButton btnProcesar;
	private JButton btnSalir;
	private JComboBox<String> comboBox;
	private HashMap<String, String> clientes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificacionClientes frame = new ModificacionClientes();
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
	public ModificacionClientes() {
		setTitle("CLIENTES");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 701, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbltitulo15 = new JLabel("MODIFICACIÓN DE REGISTRO");
		lbltitulo15.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo15.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltitulo15.setBounds(21, 50, 640, 42);
		contentPane.add(lbltitulo15);

		lbldni = new JLabel("DNI");
		lbldni.setHorizontalAlignment(SwingConstants.CENTER);
		lbldni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldni.setBounds(21, 137, 256, 42);
		contentPane.add(lbldni);

		comboBox = new JComboBox<>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(345, 137, 306, 42);
		contentPane.add(comboBox);

		lblnomyapelli = new JLabel("NOMBRES Y APELLIDOS");
		lblnomyapelli.setHorizontalAlignment(SwingConstants.CENTER);
		lblnomyapelli.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblnomyapelli.setBounds(21, 273, 256, 42);
		contentPane.add(lblnomyapelli);

		txtnomyapelli = new JTextField();
		txtnomyapelli.setHorizontalAlignment(SwingConstants.CENTER);
		txtnomyapelli.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtnomyapelli.setColumns(10);
		txtnomyapelli.setBounds(355, 274, 306, 42);
		contentPane.add(txtnomyapelli);

		btnProcesar = new JButton("PROCESAR");
		btnProcesar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnProcesar.setBounds(250, 200, 195, 42);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);

		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnModificar.setBounds(55, 350, 195, 42);
		btnModificar.addActionListener(this);
		contentPane.add(btnModificar);

		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(511, 23, 150, 32);
		contentPane.add(btnSalir);

		clientes = new HashMap<>();
		clientes.put("12345678", "Juan Pérez");
		clientes.put("87654321", "Ana López");
		clientes.put("11223344", "Carlos Ruiz");

		comboBox.addItem("Seleccione un DNI");
		for (String dni : clientes.keySet()) {
			comboBox.addItem(dni);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			dispose();
		} else if (e.getSource() == btnProcesar) {
			mostrarNombreActual();
		} else if (e.getSource() == btnModificar) {
			modificarCliente();
		}
	}

	public void mostrarNombreActual() {
		String dniSeleccionado = (String) comboBox.getSelectedItem();
		if (dniSeleccionado.equals("Seleccione un DNI")) {
			JOptionPane.showMessageDialog(this, "Seleccione un DNI válido.", "Error", JOptionPane.ERROR_MESSAGE);
			txtnomyapelli.setText("");
		} else {
			String nombre = clientes.get(dniSeleccionado);
			txtnomyapelli.setText(nombre);
		}
	}

	public void modificarCliente() {
		String dniSeleccionado = (String) comboBox.getSelectedItem();
		String nuevoNombre = txtnomyapelli.getText().trim();

		if (dniSeleccionado.equals("Seleccione un DNI") || nuevoNombre.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Complete los campos correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		clientes.put(dniSeleccionado, nuevoNombre);
		JOptionPane.showMessageDialog(this, "Cliente con DNI " + dniSeleccionado + " modificado correctamente.", "Modificación Exitosa", JOptionPane.INFORMATION_MESSAGE);
	}
}