package smazto;

public class Robot extends Object {
	private int direction;
	private int x, y;

	public void turnRight() {
		direction = (direction + 1) % 4;
	}

	public void turnAround() {
		turnRight();
		turnRight();
	}

	public void turnLeft() {
		turnAround();
		turnRight();
	}

	public void forward() {
		if (direction % 2 == 0) {
			x -= (direction - 1);
		} else {
			y += (direction - 2);
		}
	}

	public void backward() {
		turnAround();
		forward();
		turnAround();
	}

	public String getDirectionName() { // toto zjednodusit - vycet, switch
		if (direction == 0) {
			return "North";
		}
		if (direction == 1) {
			return "East";
		}
		if (direction == 2) {
			return "South";
		}
		return "West";
	}

	@Override
	public String toString() {
		return "Robot [direction=" + getDirectionName() + ", x=" + x + ", y=" + y + "]";
	}
}
