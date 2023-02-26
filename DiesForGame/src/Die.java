import java.util.Random;

public class Die {
	private int minValue = 1;
	private int maxValue = 6;
	private int faceValue;

	public Die() {
		faceValue = 1;
	}

	public int roll() {
		AnimatedDie animate =new AnimatedDie();
		animate.roll();
		Random rnd = new Random();
		this.faceValue = rnd.nextInt(maxValue - minValue )+ 1;
		System.out.println(animate.getDie()[faceValue-1]);
		return faceValue;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setfaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
	public String toString() {
		AnimatedDie stringDie =new AnimatedDie();
		return stringDie.getDie()[faceValue];
	}
}
