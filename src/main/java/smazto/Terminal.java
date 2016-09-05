package smazto;

import java.util.Scanner;

public class Terminal {

	private String command; // variable that works with the user input
	private Robot robot1 = new Robot(); // new instance of class Robot
	private final RobotDisplay display;

	public Terminal(RobotDisplay display) {
		this.display = display;
	}

	// public void readUserCommand() {

	// }

	public void commandLoop() {
		// inicializace - vytisknout pocatecni stav a pripravit user input
		display.displayRobot(robot1);
		Scanner scan = new Scanner(System.in); // scanner gets user input
		// command = "go";

		while (!"exit".equalsIgnoreCase(command)) {
			System.out.println(robot1);
			command = scan.next();
			executeCommand();
		}
		scan.close();
		// ll
	}

	private void executeCommand() {
		switch (command) {
		case "right":
			robot1.turnRight();
			break;
		case "left":
			robot1.turnLeft();
			break;
		case "around":
			robot1.turnAround();
			break;
		case "forward":
			robot1.forward();
			break;
		case "backward":
			robot1.backward();
			break;
		}

	}

	public static void main(String[] args) {
		Gui gui = new Gui();
		Gui.open(gui);
		Terminal robot1 = new Terminal(new GuiRobotDisplay(gui));

		// robot1.readUserCommand();
		robot1.commandLoop();
	}
}