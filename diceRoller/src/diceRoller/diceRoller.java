package diceRoller;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;
public class diceRoller {
	static int rollNum = 0; 
	
	
	private static class ImagePanel extends JComponent {
	    private Image image;
	    public ImagePanel(Image image) {
	        this.image = image;
	    }
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, this);
	    }
	}
	
	private static void createAndShowGUI() throws IOException {
        Random diceRoll = new Random(); 
        //Create and set up the window.
        JFrame frame = new JFrame("DND Dice Roller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        //Dice Rolls 
        JLabel d2roll = new JLabel();
        d2roll.setText("D2");
        d2roll.setBounds(375, 0, 250, 50);
        frame.add(d2roll);
        
        JLabel d4roll = new JLabel(); 
        d4roll.setText("D4");
        d4roll.setBounds(375, 60, 250, 50);
        frame.add(d4roll);
        
        JLabel d6roll = new JLabel(); 
        d6roll.setText("D6");
        d6roll.setBounds(375, 120, 250, 50);
        frame.add(d6roll);
        
        JLabel d8roll = new JLabel(); 
        d8roll.setText("D8");
        d8roll.setBounds(375, 180, 250, 50);
        frame.add(d8roll);
        
        JLabel d10roll = new JLabel(); 
        d10roll.setText("D10");
        d10roll.setBounds(375, 240, 250, 50);
        frame.add(d10roll);
        
        JLabel d12roll = new JLabel(); 
        d12roll.setText("D12");
        d12roll.setBounds(375, 300, 250, 50);
        frame.add(d12roll);
        
        JLabel d20roll = new JLabel(); 
        d20roll.setText("D20");
        d20roll.setBounds(375, 360, 250, 50);
        frame.add(d20roll);
        
        JLabel totalRoll = new JLabel();
        totalRoll.setText("Total Roll: " + rollNum);
        totalRoll.setBounds(225,420,100,50);
        frame.add(totalRoll);

        //Dice Rollers
        //D2 is not added to the total roll. 
        JButton d2 = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed(ActionEvent e) {
				int roll = 0; 
				roll = diceRoll.nextInt(2)+1;
				d2roll.setText(new String(Integer.toString(roll)));
			}
        }); 
        JButton d4 = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed(ActionEvent e) {
				int roll = 0; 
				roll = diceRoll.nextInt(4)+1;
				d4roll.setText(new String(Integer.toString(roll)));
				rollNum += roll;
				totalRoll.setText("Total Roll: " + rollNum);
				
			}
        }); 
        JButton d6 = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed(ActionEvent e) {
				int roll = 0; 
				roll = diceRoll.nextInt(6)+1;
				d6roll.setText(new String(Integer.toString(roll)));
				rollNum += roll;
				totalRoll.setText("Total Roll: " + rollNum);
				
			}
        }); 
        JButton d8 = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed(ActionEvent e) {
				int roll = 0; 
				roll = diceRoll.nextInt(8)+1;
				d8roll.setText(new String(Integer.toString(roll)));
				rollNum += roll;
				totalRoll.setText("Total Roll: " + rollNum);
			}
        }); 
        JButton d10 = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed(ActionEvent e) {
				int roll = 0; 
				roll = diceRoll.nextInt(10)+1;
				d10roll.setText(new String(Integer.toString(roll)));
				rollNum += roll;
				totalRoll.setText("Total Roll: " + rollNum);
				
			}
        }); 
        JButton d12 = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed(ActionEvent e) {
				int roll = 0; 
				roll = diceRoll.nextInt(12)+1;
				d12roll.setText(new String(Integer.toString(roll)));
				rollNum += roll;
				totalRoll.setText("Total Roll: " + rollNum);
				
			}
        }); 
        JButton d20 = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed(ActionEvent e) {
				int roll = 0; 
				roll = diceRoll.nextInt(20)+1;
				d20roll.setText(new String(Integer.toString(roll)));
				rollNum += roll;
				totalRoll.setText("Total Roll: " + rollNum);
				
			}
        }); 
        JButton reset = new JButton(new AbstractAction("Add") {
			@Override
			public void actionPerformed(ActionEvent e) {
				d2roll.setText("D2");
				d4roll.setText("D4");
				d6roll.setText("D6");
				d8roll.setText("D8");
				d10roll.setText("D10");
				d12roll.setText("D12");
				d20roll.setText("D20");
				rollNum = 0;
				totalRoll.setText("Total Roll: " + rollNum);
				
			}
        }); 
       
        
        d2.setText("Roll D2");
        d2.setBounds(0, 0, 80, 50);
        frame.add(d2);
        
        d4.setText("Roll D4");
        d4.setBounds(0, 60, 80, 50);
        frame.add(d4);
        
        d6.setText("Roll D6");
        d6.setBounds(0, 120, 80, 50);
        frame.add(d6);
        
        d8.setText("Roll D8");
        d8.setBounds(0, 180, 80, 50);
        frame.add(d8);
        
        d10.setText("Roll D10");
        d10.setBounds(0, 240, 80, 50);
        frame.add(d10);
        
        d12.setText("Roll D12");
        d12.setBounds(0, 300, 80, 50);
        frame.add(d12);
        
        d20.setText("Roll D20");
        d20.setBounds(0, 360, 80, 50);
        frame.add(d20);
        
        reset.setText("Reset");
        reset.setBounds(0, 420, 125, 50);
        frame.add(reset);
        
        //Display the window.
		//frame.setContentPane(new ImagePanel(myImage));
        frame.setSize(512,512);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) throws IOException {
    	createAndShowGUI(); 
    }
}
