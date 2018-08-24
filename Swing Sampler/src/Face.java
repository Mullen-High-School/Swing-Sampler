import java.awt.*;

import javax.swing.JFrame;

public class Face extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				Face canvas = new Face();
		        JFrame frame = new JFrame();
		        frame.setSize(400, 450);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		public void paint(Graphics graphics) 
    		{			  	        
    	        graphics.setColor(Color.yellow);
    	        graphics.fillOval(50, 25, 300, 350);
    	        
    	        graphics.setColor(Color.white);
    	        graphics.fillOval(125, 150, 75, 50);
    	        
    	        graphics.setColor(Color.white);
    	        graphics.fillOval(225, 150, 75, 50);
    	        
    	        graphics.setColor(Color.black);
    	        graphics.fillOval(145, 160, 25, 25);
    	        
    	        graphics.setColor(Color.black);
    	        graphics.fillOval(250, 160, 25, 25);
    	        
    	        graphics.setColor(Color.blue);
    	        graphics.fillOval(200, 200, 20, 20);
    	        
    	        graphics.setColor(Color.red);
    	        graphics.fillOval(185, 250, 50, 50);
    	    
    		}

	}
