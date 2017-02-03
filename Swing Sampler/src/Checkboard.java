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
	        graphics.setColor(Color.black);
	        graphics.fillRect(0, 0, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(0, 20, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(0, 40, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(0, 60, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(0, 80, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(0, 100, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(0, 120, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(0, 140, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(20, 0, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(20, 20, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(20, 40, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(20, 60, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(20, 80, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(20, 100, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(20, 120, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(20, 140, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(40, 0, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(40, 20, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(40, 40, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(40, 60, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(40, 80, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(40, 100, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(40, 120, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(40, 140, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(60, 0, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(60, 20, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(60, 40, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(60, 60, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(60, 80, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(60, 100, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(60, 120, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(60, 140, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(80, 0, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(80, 20, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(80, 40, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(80, 60, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(80, 80, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(80, 100, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(80, 120, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(80, 140, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(100, 0, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(100, 20, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(100, 40, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(100, 60, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(100, 80, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(100, 100, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(100, 120, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(100, 140, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(120, 0, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(120, 20, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(120, 40, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(120, 60, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(120, 80, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(120, 100, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(120, 120, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(120, 140, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(140, 0, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(140, 20, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(140, 40, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(140, 60, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(140, 80, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(140, 100, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(140, 120, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(140, 140, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(160, 0, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(160, 20, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(160, 40, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(160, 60, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(160, 80, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(160, 100, 20, 20);
	        graphics.setColor(Color.black);
	        graphics.fillRect(160, 120, 20, 20);
	        graphics.setColor(Color.white);
	        graphics.fillRect(160, 140, 20, 20);
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
	