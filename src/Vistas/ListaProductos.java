package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ListaProductos extends JFrame {
	
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
					ListaProductos frame = new ListaProductos(null);
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
	public ListaProductos(ArrayList<String[]> listaProductos) {
		setTitle("LISTA COMPLETA DE CLIENTES");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        mostrarClientes(listaProductos);
    }

    private void mostrarClientes(ArrayList<String[]> listaProductos) {
        StringBuilder sb = new StringBuilder();
        for (String[] cliente : listaProductos) {
            sb.append("Lote: ").append(cliente[0])
              .append("    |    Marca: ").append(cliente[1])
              .append("    |    Modelo: ").append(cliente[2])
              .append("\n");
        }

        if (sb.length() == 0) {
            sb.append("No hay clientes registrados.");
        }

        textArea.setText(sb.toString());
	}

}
