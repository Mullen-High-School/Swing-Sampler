import java.util.Scanner;
import java.awt.*;
import javax.swing.JFrame;

public class UserPicker extends Canvas
	{
		static int width = 0;
		static int height = 0;
		static int shapeColor = 0;
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				userInput();
				UserPicker canvas = new UserPicker();
		        JFrame frame = new JFrame();
		        frame.setSize(500, 400);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null);
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		public static void userInput(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("width?");
			width = userInput.nextInt();
			System.out.println("height?");
			height = userInput.nextInt();
			System.out.println("color?");
			System.out.println("1) blue");
			System.out.println("2) red");
			shapeColor = userInput.nextInt();
		}
		public void paint(Graphics graphics) 
    		{	
    			if (shapeColor == 1){
    	        graphics.setColor(Color.blue);
    	        graphics.fillRect(100, 100, width, height);
    			}
    			else if (shapeColor == 2){
    	        graphics.setColor(Color.red);
    	        graphics.fillRect(100, 100, width, height);
    			}
    		}

	}
