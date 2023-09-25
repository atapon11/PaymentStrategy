
public class CraditcardPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.print("Paid by credit card: " + amount);
		
	}
}
