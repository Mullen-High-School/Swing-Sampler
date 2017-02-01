import java.awt.*;

import javax.swing.JFrame;

public class GraphicsChallenge2 extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				GraphicsChallenge2 canvas = new GraphicsChallenge2();
		        JFrame frame = new JFrame();
		        frame.setSize(400, 400);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		public void paint(Graphics graphics) 
    		{			  	        
    	        graphics.setColor(Color.red);
    	        graphics.drawLine(100, 100, 350, 100);
    	        
    	        graphics.setColor(Color.red);
    	        graphics.drawLine(350, 100, 350, 350);
    	        
    	        graphics.setColor(Color.red);
    	        graphics.drawLine(350, 350, 100, 350);
    	        
    	        graphics.setColor(Color.red);
    	        graphics.drawLine(100, 350, 100, 100);
    	    
    		}

	}
