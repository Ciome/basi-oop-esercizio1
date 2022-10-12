
public class BasiOOPEsercizio1 {

	public static void main(String[] args) {
		SIM sim1 = new SIM("3334445555", 5);
		
		sim1.addCall("3384796484", 12.0f);
		sim1.addCall("3384796484", 10.0f);
		sim1.addCall("3384222484", 9.0f);
		
		sim1.printSIMData();

		System.out.println("total call minutes: " + sim1.getTotalMinutes());
		System.out.println("calls to 3384796484: " + sim1.getNumberOfCallsToNumber("3384796484"));
	}

}
