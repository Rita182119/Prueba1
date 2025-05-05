package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ListaProveedores extends JFrame {

	private JTextArea textArea;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaProveedores frame = new ListaProveedores(null);
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
	public ListaProveedores(ArrayList<String[]> listaProveedores) {
		setTitle("LISTA COMPLETA DE CLIENTES");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        mostrarProveedores(listaProveedores);
    }

    private void mostrarProveedores(ArrayList<String[]> listaProveedores) {
        StringBuilder sb = new StringBuilder();
        for (String[] cliente : listaProveedores) {
            sb.append("RUC: ").append(String.format("%-15.15s", cliente[0]))
              .append("|    Razón Social: ").append(cliente[1])
              .append("\n");
        }

        if (sb.length() == 0) {
            sb.append("No hay Proveedores registrados.");
        }

        textArea.setText(sb.toString());
	}

}
