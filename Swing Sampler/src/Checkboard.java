import java.awt.*;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT

public class Checkboard extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
    		Checkboard canvas = new Checkboard();
	        JFrame frame = new JFrame();
	        frame.setSize(185, 188);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			int counter = 1;
    			for (int x = 0; x < 140; x = x + 20){
    				if (counter == 15){ 
    				counter = 1;
    				}
    				for (int y = 0; y < 140; y = y + 20){
    					if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9 || counter == 11 || counter == 13 || counter == 15) {
    					graphics.setColor(Color.black);
    			        graphics.fillRect(x, y, 20, 20);
    					}
    					else {
        					graphics.setColor(Color.red);
        			        graphics.fillRect(x, y, 20, 20);
        					}
    					System.out.println(counter);
    			        counter++;
    				}
    			}
    		}
    	}