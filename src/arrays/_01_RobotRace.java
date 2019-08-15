package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class _01_RobotRace {
	//1. make a main method
	public static void main(String [] args) {
		Robot[] rob = new Robot[5];
		
		for(int u = 0; u < rob.length; u++) {
			int pop = u;
			int middle = 40;
			int lineUp = middle+=pop;
			Robot robot = new Robot();
			rob[u] = robot;
			robot.setY(300);
			robot.miniaturize();
			robot.setX(10*lineUp);
			robot.setSpeed(10);
		}
		
		int robot1Holder = rob[0].getX();
		int robot1HolderY = rob[0].getY();
		int robot2Holder = rob[1].getX();
		int robot2HolderY = rob[1].getY();
		int robot3Holder = rob[2].getX();
		int robot3HolderY = rob[2].getY();
		int robot4Holder = rob[3].getX();
		int robot4HolderY = rob[3].getY();
		int robot5Holder = rob[4].getX();
		int robot5HolderY = rob[4].getY();
		
		
	while(	(robot1Holder > 390 && robot1Holder < 409) && (robot1HolderY > 300 && robot1HolderY < 310) &&
			(robot2Holder > 390 && robot2Holder < 409) && (robot2HolderY > 300 && robot2HolderY < 310) &&
			(robot3Holder > 390 && robot3Holder < 409) && (robot3HolderY > 300 && robot3HolderY < 310) &&
			(robot4Holder > 390 && robot4Holder < 409) && (robot4HolderY > 300 && robot4HolderY < 310) &&
			(robot5Holder > 390 && robot5Holder < 409) && (robot5HolderY > 300 && robot5HolderY < 310)
			) 
	{
		for(int k = 0; k < rob.length; k++) {
			Random randy = new Random();
				rob[k].turn(1);
				rob[k].move(randy.nextInt(5));	

		}
	}
	if(rob[0].getY() == 300 ||rob[0].getY() == 301 ||rob[0].getY() == 302 ||rob[0].getY() == 303 ||rob[0].getY() == 304 ||rob[0].getY() == 305 ||rob[0].getY() == 306 ||rob[0].getY() == 307 ||rob[0].getY() == 308 ||rob[0].getY() == 309 && rob[0].getX() == 400) {
		JOptionPane.showMessageDialog(null, "Robot #1 Wins! Yay!");
	}
	else if(rob[1].getY() == 300 ||rob[0].getY() == 301 ||rob[1].getY() == 302 ||rob[1].getY() == 303 ||rob[1].getY() == 304 ||rob[1].getY() == 305 ||rob[1].getY() == 306 ||rob[1].getY() == 307 ||rob[1].getY() == 308 ||rob[1].getY() == 309 && rob[1].getX() == 410) {
		JOptionPane.showMessageDialog(null, "Robot #2 Wins! Yay!");
	}
	else if(rob[2].getY() == 300 ||rob[0].getY() == 301 ||rob[2].getY() == 302 ||rob[2].getY() == 303 ||rob[2].getY() == 304 ||rob[2].getY() == 305 ||rob[2].getY() == 306 ||rob[2].getY() == 307 ||rob[2].getY() == 308 ||rob[2].getY() == 309 && rob[2].getX() == 420) {
		JOptionPane.showMessageDialog(null, "Robot #3 Wins! Yay!");
	}
	else if(rob[3].getY() == 300 ||rob[0].getY() == 301 ||rob[3].getY() == 302 ||rob[3].getY() == 303 ||rob[3].getY() == 304 ||rob[3].getY() == 305 ||rob[3].getY() == 306 ||rob[3].getY() == 307 ||rob[3].getY() == 308 ||rob[3].getY() == 309 && rob[3].getX() == 430) {
		JOptionPane.showMessageDialog(null, "Robot #4 Wins! Yay!");
	}
	else if(rob[4].getY() == 300 ||rob[0].getY() == 301 ||rob[4].getY() == 302 ||rob[4].getY() == 303 ||rob[4].getY() == 304 ||rob[4].getY() == 305 ||rob[4].getY() == 306 ||rob[4].getY() == 307 ||rob[4].getY() == 308 ||rob[4].getY() == 309 && rob[4].getX() == 440) {
		JOptionPane.showMessageDialog(null, "Robot #5 Wins! Yay!");
	}
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
