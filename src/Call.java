
public class Call {
	private String number;
	private float minutes;

	public Call(String number, float length) {
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
