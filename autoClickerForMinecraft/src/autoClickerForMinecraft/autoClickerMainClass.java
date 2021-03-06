package autoClickerForMinecraft;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.*;

public class autoClickerMainClass implements ActionListener{

	//initialize all the variables
	static boolean rightOrLeftClick = true; //true is left click, false is right click
	static JFrame jframe = new JFrame();
	static JPanel panel = new JPanel();
	static JButton jbutton1 = new JButton("Left Click");
	static JButton jbutton2 = new JButton("Right Click");
	
	
	//run the method for all the jframe components
	public static void main(String[] args) {
	
		new autoClickerMainClass();
		
	}
	//initialize jframe components visible and then add them to their respective panels/jframes
	autoClickerMainClass(){
		jframe.setVisible(true);
		panel.setVisible(true);
		jframe.add(panel);
		panel.add(jbutton1);
		panel.add(jbutton2);
	    jbutton1.addActionListener(this);
	}
	@Override
	//Start The autoclicker for 15 seconds of 30cps clicking as well as making the robot object
	public void actionPerformed(ActionEvent e) {
		rightOrLeftClick = true;
		Robot bot;
		try {
			Thread.sleep(3000);
			bot = new Robot();
			for(int i = 0; i<500; i++)
			{
				Thread.sleep(30);
			bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		    bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			}
		 
		    
		} catch (AWTException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	

}
