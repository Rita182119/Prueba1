package Vistas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Logeo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusuario;
	private JTextField txtcontra;
	private JLabel lblcontra;
	private JLabel lbltitulo0;
	private JLabel lblusuario;
	private JButton btniniciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
					frame.setLocationRelativeTo(null);
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
	public Logeo() {
		setTitle("INICIAR SESION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(193, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo0 = new JLabel("INGRESO");
		lbltitulo0.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo0.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbltitulo0.setBounds(127, 29, 254, 50);
		contentPane.add(lbltitulo0);
		
		lblusuario = new JLabel("USUARIO:");
		lblusuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblusuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblusuario.setBounds(10, 110, 254, 50);
		contentPane.add(lblusuario);
		
		lblcontra = new JLabel("CONTRASEÑA:");
		lblcontra.setHorizontalAlignment(SwingConstants.CENTER);
		lblcontra.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcontra.setBounds(10, 198, 254, 50);
		contentPane.add(lblcontra);
		
		txtusuario = new JTextField();
		txtusuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtusuario.setBounds(253, 113, 165, 48);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		txtcontra = new JPasswordField();
		txtcontra.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtcontra.setColumns(10);
		txtcontra.setBounds(253, 200, 165, 48);
		contentPane.add(txtcontra);
		
		btniniciar = new JButton("INICIAR SESION");
		btniniciar.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {

			        char[] clave = ((JPasswordField) txtcontra).getPassword();
			        String claveFinal = new String(clave);
			        String usuario = txtusuario.getText();

			        boolean accesoConcedido = false;
			        String mensaje = "";

			        if (usuario.equals("Alexis") && claveFinal.equals("2467")) {
			            mensaje = "Bienvenido al Sistema Alexis";
			            accesoConcedido = true;
			        } else if (usuario.equals("Rita") && claveFinal.equals("4509")) {
			            mensaje = "Bienvenido al Sistema Rita";
			            accesoConcedido = true;
			        } else if (usuario.equals("Frank") && claveFinal.equals("2502")) {
			            mensaje = "Bienvenido al Sistema Frank";
			            accesoConcedido = true;
			        }

			        if (accesoConcedido) {
			            dispose();
			            JOptionPane.showMessageDialog(null, mensaje, "INGRESASTE EXITOSAMENTE", JOptionPane.INFORMATION_MESSAGE);
			            MenuPrincipal p = new MenuPrincipal();
			            p.setExtendedState(JFrame.MAXIMIZED_BOTH);
			            p.setVisible(true);
			        } else {
			            JOptionPane.showMessageDialog(null, "Credenciales incorrectas, intentelo nuevamente por favor", "ERROR", JOptionPane.ERROR_MESSAGE);
			            txtusuario.setText("");
			            txtcontra.setText("");
			            txtusuario.requestFocus();
			        }
			    }
			});
		btniniciar.setBounds(171, 291, 165, 50);
		contentPane.add(btniniciar);
	}
}
