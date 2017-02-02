import java.awt.*;
import javax.swing.JFrame;

public class rgbCycle extends Canvas
	{
		static int width = 0;
		static int height = 0;
		static String shapeColor = "";
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				
				rgbCycle canvas = new rgbCycle();
		        JFrame frame = new JFrame();
		        frame.setSize(500, 400);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null);
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		public void paint(Graphics graphics) 
    		{	for(int x = 0; x < 10; x++){
    			for(int r = 0; r < 255; r = r + 3){
    				for(int g = 0; g < 255; g = g + 3){
    					for(int b = 0; b < 255; b = b + 3){
    							System.out.println(r + ", " + g + ", " + b);
    							graphics.setColor(new Color(r,g,b));
    							graphics.fillRect(100, 100, 100, 100);
    						}
    					}
    				}
    			}
    		}

	}
