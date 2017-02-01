import java.awt.*;

import javax.swing.JFrame;

public class GraphicsChallenge extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				GraphicsChallenge canvas = new GraphicsChallenge();
		        JFrame frame = new JFrame();
		        frame.setSize(1600, 1000);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		public void paint(Graphics graphics) 
    		{			
    	        graphics.setColor(Color.blue);
    	        graphics.fillRect(500, 500, 800, 400);
    	        
    			graphics.setColor(Color.black);
    	        graphics.drawLine(0, 0, 1600, 975);
    	        
    	        graphics.setColor(Color.black);
    	        graphics.drawLine(0, 975, 1600, 0);
    	    
    		}

	}
