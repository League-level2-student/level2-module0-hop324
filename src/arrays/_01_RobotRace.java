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
			robot.setSpeed(100);
		}
		
		Boolean yeet = false;
		int winner = 0;
		
		rob[0].penDown();
		rob[1].penDown();
		rob[2].penDown();
		rob[3].penDown();
		rob[4].penDown();
		
		
		
	while(!yeet)

	{
			for(int k = 0; k < rob.length; k++) {
				Random randy = new Random();
					for(int OwO = randy.nextInt(5); OwO > 0; OwO--) {
						int bully = 0;
						rob[k].turn(1);
						rob[k].move(1);
						System.out.println(rob[k].getX() + "Robot: " + bully);
						System.out.println(rob[k].getY() + "Robot: " + bully);
						bully++;
						if((rob[k].getX() == 400 || rob[k].getX() == 410 || rob[k].getX() == 420 || rob[k].getX() == 430 || rob[k].getX() == 440 )&&(rob[k].getY() >= 300 && rob[k].getY() <= 305)) {
							yeet = true;
								if(rob[k].getX() == rob[0].getX()) {
									winner = 1;
									}
								else if(rob[k].getX() == rob[1].getX()) {
									winner = 2;
									}
								else if(rob[k].getX() == rob[2].getX()) {
									winner = 3;
									}
								else if(rob[k].getX() == rob[3].getX()) {
									winner = 4;
									}
								else if(rob[k].getX() == rob[4].getX()) {
									winner = 5;
							}
						}
					}
				

		}
	}
	if(winner == 1) {
		JOptionPane.showMessageDialog(null, "Robot #1 Wins! Yay!");
	}
	else if(winner == 2) {
		JOptionPane.showMessageDialog(null, "Robot #2 Wins! Yay!");
	}
	else if(winner == 3) {
		JOptionPane.showMessageDialog(null, "Robot #3 Wins! Yay!");
	}
	else if(winner == 4) {
		JOptionPane.showMessageDialog(null, "Robot #4 Wins! Yay!");
	}
	else if(winner == 5) {
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
