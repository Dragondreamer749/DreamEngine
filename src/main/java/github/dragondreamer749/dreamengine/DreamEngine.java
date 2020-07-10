package github.dragondreamer749.dreamengine;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class DreamEngine extends JPanel{
	
	
	
	public DreamEngine()  {
		
			
			
		}
	
	
	public static void main(String args[]) {
		
	
		JFrame frame = new JFrame();
		frame.getContentPane().add(new DreamEngine());

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(1200, 600);
	      frame.setLocationRelativeTo(null);
	      frame.setVisible(true);
	}
	
	


}
