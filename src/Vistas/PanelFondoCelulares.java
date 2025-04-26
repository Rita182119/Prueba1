package Vistas;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class PanelFondoCelulares extends JPanel {

	private static final long serialVersionUID = 1L;

				public PanelFondoCelulares() {
					this.setSize(600, 400);
				}
				public void paintComponent(Graphics g) {
	            Dimension tamanio = getSize();
	            ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/IMG/FondoCelular.jpg"));
	            g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
	            setOpaque(false);
	            super.paintComponent(g);
	        }
	}
