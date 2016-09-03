package smazto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Gui extends JComponent {
	private static Color m_tBlack = new Color(0, 0, 0, 150);
	private int changeX;
	private int changeY;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// draw entire component white
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());

		// draw black square
		g.setColor(m_tBlack);
		g.fillRect(100, 100, 120, 120);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 400);
	}

	@Override
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}

	public static void main(String args[]) {
		JFrame mainFrame = new JFrame("Graphics demo");
		mainFrame.getContentPane().add(new Gui());
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}