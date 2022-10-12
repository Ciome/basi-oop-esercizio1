import java.util.ArrayList;

public class SIM {
	private String number;
	private float credit;
	private ArrayList<Call> calls;

	public SIM(String number, float credit) {
		this.number = number;
		this.credit = credit;
		calls = new ArrayList<Call>();
	}

	public void addCall(String number, float length) {
		calls.add(new Call(number, length));
	}

	public float getTotalMinutes() {
		float minutes = 0.0f;

		for (int i = 0; i < calls.size(); i++) {
			minutes += calls.get(i).getMinutes();
		}

		return minutes;
	}

	public int getNumberOfCallsToNumber(String number) {
		int nCalls = 0;
		for (int i = 0; i < calls.size(); i++) {
			if (calls.get(i).getNumber().equals(number))
				nCalls += 1;
		}
		return nCalls;
	}

	public void printSIMData() {
		String out = "SIM number: " + number + ", credit: " + credit + "\n";
		for (int i = 0; i < calls.size(); i++) {
			out = out + "call:\n" + calls.get(i).toString() + "\n";
		}

		System.out.print(out);
	}
}
