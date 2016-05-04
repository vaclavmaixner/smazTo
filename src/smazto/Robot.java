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

	@Override
	public String toString() {
		return "Robot [direction=" + direction + ", x=" + x + ", y=" + y + "]";
	}
}
