package github.dragondreamer749.dreamengine.sprites;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import github.dragondreamer749.dreamengine.resources.ResourceLocation;
import javax.imageio.ImageIO;

//e
public class Sequences {

	
	private HashMap <String, ArrayList<BufferedImage>> sequence = new HashMap <String, ArrayList<BufferedImage>>();
	
	private ArrayList<ResourceLocation> locations = new ArrayList<ResourceLocation>();
	
	public Sequences(HashMap <String, ArrayList<BufferedImage>> sequence) {
		this.sequence = sequence;
	}
	
	public boolean setSequence(String sequenceName, ArrayList<BufferedImage> sequence, ArrayList<ResourceLocation> locations) {
		
		if(!sequence.isEmpty() 
				&& !sequenceName.isEmpty() && this.sequence.containsKey(sequenceName)
				&& !locations.isEmpty()) {
			
			try {
				
				this.sequence.put(sequenceName, sequence); 
				
				
			}catch(Exception e) {
				return false;
			}
			
			
			
			return true;
		}
		
		return false;
	}
	
	public void DrawImage() {
		
		BufferedImage img;
		try {
			img = ImageIO.read(new File(".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	
}
