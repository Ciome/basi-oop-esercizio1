
public class Call {
	String number;
	float minutes;

	public Call(String number, float length) {
		super();
		this.number = number;
		this.minutes = length;
	}

	public String getNumber() {
		return number;
	}

	public float getMinutes() {
		return minutes;
	}

	public String toString() {
		String out = "number: " + number + ", minutes: " + minutes;
		return out;
	}

}
