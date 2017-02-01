import java.awt.*;

import javax.swing.JFrame;

public class BlueAndYellowSquare extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				BlueAndYellowSquare canvas = new BlueAndYellowSquare();
		        JFrame frame = new JFrame();
		        frame.setSize(1000, 1000);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		public void paint(Graphics graphics) 
    		{			
    			
    			graphics.setColor(Color.yellow);
    			graphics.fillRect(800, 800, 175, 150);
    			
    	        graphics.setColor(Color.blue);
    	        graphics.drawLine(800, 800, 975, 800);
    	        
    	        graphics.setColor(Color.blue);
    	        graphics.drawLine(975, 800, 975, 950);
    	        
    	        graphics.setColor(Color.blue);
    	        graphics.drawLine(975, 950, 800, 950);
    	        
    	        graphics.setColor(Color.blue);
    	        graphics.drawLine(800, 950, 800, 800);
    	    
    		}

	}
