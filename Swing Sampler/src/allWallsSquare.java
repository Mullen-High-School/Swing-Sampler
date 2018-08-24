import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT

public class allWallsSquare extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        allWallsSquare canvas = new allWallsSquare();
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
   
	        for (int x = 0; x < 10; x++){
	        for (int i = 0; i < 350; i = i + 10)
	        	{
		        graphics.setColor(Color.green);
		        graphics.fillRect(i, 175, 50, 50);
		        
		        delay();
		        
		        graphics.setColor(Color.white);
		        graphics.fillRect(i, 175, 50, 50);
	        	}
	        for (int i = 350; i > 0; i = i - 10){
	        	graphics.setColor(Color.green);
		        graphics.fillRect(i, 175, 50, 50);
		        
		        delay();
		        
		        graphics.setColor(Color.white);
		        graphics.fillRect(i, 175, 50, 50);
	        }
	        }
	        
    		}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(50);
    					} catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}
	