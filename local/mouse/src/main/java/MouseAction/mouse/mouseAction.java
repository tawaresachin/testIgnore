package MouseAction.mouse;

import java.awt.AWTException;
import java.awt.Robot;

public class mouseAction {
		
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		Robot robo=new Robot();
		while(true)
		{
		robo.mouseMove(0, 200);
		Thread.sleep(10000);
		robo.mouseMove(100, 200);
		Thread.sleep(10000);
		}
	}

}
