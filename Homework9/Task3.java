
package Homework9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task3 {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		g.setColor(Color.RED);
		g.drawString("An array of numbers", 500, 150);
		
		Integer number = 0;
		
		for (int i = 0; i <= 10; i++) {
			int x = i * 50 + 300;
			
			g.drawRect(x, 200, 50, 50);
			number = (int) (Math.random() * 10);
			g.drawString(number.toString(), x + 15, 225);
		} 
		g.drawString("Type: int", 530, 300);
		

//		// *******************
		w.setImage(img);
	}
}
