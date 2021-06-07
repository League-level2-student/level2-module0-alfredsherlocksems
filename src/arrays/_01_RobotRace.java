package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void main(String[] args) {

		// 1. make a main method

		// 2. create an array of 5 robots.
		Robot robots[] = new Robot[5];
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot();
			robots[i].setY(345);
			if (robots[i] == robots[0]) {
				robots[i].setX(100);
			}
			else {
				robots[i].setX(robots[i-1].getX() + 175);
			}
			robots[i].setAngle(0);
		}
		// 3. use a for loop to initialize the robots.
		
		//I did that above.
		
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		
		//I also did that above.
		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random ran = new Random();
		boolean notFinished = true;
		while (notFinished) {
		for (int i = 0; i < robots.length; i++) {
			robots[i].move(ran.nextInt(50));
			if (robots[i].getY() < 20) {
				notFinished = false;
				JOptionPane.showMessageDialog(null, "Congratulations Robot " + (i + 1) + "! You won!");
				break;
			}
		}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		//I did that above.

		// 7. declare that robot the winner and throw it a party!
		
		//I did that above.

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
