package smazto;

import static org.junit.Assert.assertEquals;

import org.junit.Before; //pres napovedu jsme naimportovali before
import org.junit.Test;

public class RobotTest {

	private Robot robot;

	@Before // spusti before pred kazdym testem
	public void setup() {
		robot = new Robot();
	}

	@Test
	public void initialState() {
		assertEquals("Robot [direction=North, x=0, y=0]", robot.toString());
	}

	private void performTurnRight(String direction) {
		robot.turnRight();
		assertEquals(direction, robot.getDirectionName());
	}

	@Test
	public void turnRight() {
		assertEquals("North", robot.getDirectionName());

		performTurnRight("East");
		performTurnRight("South");
		performTurnRight("West");
		performTurnRight("North");
	}

	@Test
	public void turnLeft() {
		robot.turnLeft();

		assertEquals("West", robot.getDirectionName());
	}
}
