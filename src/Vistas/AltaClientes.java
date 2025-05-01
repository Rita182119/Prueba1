package Vistas;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class AltaClientes extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdni;
	private JTextField txtnomyapell;
	private JLabel lblAltaDeClientes;
	private JLabel lbldni;
	private JLabel lblnomyapell;
	private JButton btnRegistrar;
	private JButton btnSalir;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaClientes frame = new AltaClientes();
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
	public AltaClientes() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("CLIENTES");
		setBounds(100, 100, 689, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAltaDeClientes = new JLabel("ALTA DE CLIENTES");
		lblAltaDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaDeClientes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAltaDeClientes.setBounds(10, 41, 640, 42);
		contentPane.add(lblAltaDeClientes);
		
		lbldni = new JLabel("DNI");
		lbldni.setHorizontalAlignment(SwingConstants.CENTER);
		lbldni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldni.setBounds(10, 117, 256, 42);
		contentPane.add(lbldni);		
		
		txtnomyapell = new JTextField();
		txtnomyapell.setHorizontalAlignment(SwingConstants.CENTER);
		txtnomyapell.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtnomyapell.setColumns(10);
		txtnomyapell.setBounds(334, 215, 306, 42);
		contentPane.add(txtnomyapell);
		/////////////////////////////////////////////
		txtnomyapell.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isLetter(c) && c != ' ' && !esLetraAcentuada(c)) {
		            e.consume(); 
		        }
		    }

		    private boolean esLetraAcentuada(char c) {
		        return "áéíóúÁÉÍÓÚñÑ".indexOf(c) >= 0;
		    }
		});
		/////////////////////////////////////////////
		
		txtdni = new JTextField();
		txtdni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtdni.setHorizontalAlignment(SwingConstants.CENTER);
		txtdni.setColumns(10);
		txtdni.setBounds(334, 117, 306, 42);
		contentPane.add(txtdni);
		/////////////////////////////////////
		txtdni.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isDigit(c)) {
		            e.consume(); 
		        }
		        
		    }
		});
		//////////////////////////////////////
		
		lblnomyapell = new JLabel("NOMBRES Y APELLIDOS");
		lblnomyapell.setHorizontalAlignment(SwingConstants.CENTER);
		lblnomyapell.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblnomyapell.setBounds(10, 212, 256, 42);
		contentPane.add(lblnomyapell);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrar.setBounds(240, 334, 195, 42);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);
		
		
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this); 
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.setBounds(500, 23, 150, 32);
		contentPane.add(btnSalir);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		 if (e.getSource() == btnSalir) {
	            actionPerformedbtnSalir(e);
	        }
		 if (e.getSource()==btnRegistrar) {
				actionPerformedbtnRegistrar (e);
			}
	    }

	    public void actionPerformedbtnSalir(ActionEvent e) {
	        dispose();
	    }			
	    public void actionPerformedbtnRegistrar(ActionEvent e) {
	        String dni = txtdni.getText();
			String nombre = txtnomyapell.getText();
	    	if (dni.length() != 8) {
	        	JOptionPane.showMessageDialog(this, "DNI incorrecto, cantiad permitida de 8 digitos.", "Error", JOptionPane.ERROR_MESSAGE);
				return;		        
			}else {
				String[] datosCliente = {dni, nombre};
		        MenuPrincipal.agregarCliente(datosCliente);		        
		        JOptionPane.showMessageDialog(null, "Se registró correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			}
	    }
}