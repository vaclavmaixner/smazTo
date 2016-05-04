package smazto;

public class Main {

	public static void main(String[] args) {
		Robot robot1 = new Robot();

		robot1.turnRight();
		robot1.turnRight();
		robot1.forward();
		robot1.backward();
		robot1.forward();
		robot1.turnRight();
		robot1.forward();
		robot1.forward();
		robot1.turnLeft();
		robot1.turnLeft();

		System.out.println(robot1);

	}

}
