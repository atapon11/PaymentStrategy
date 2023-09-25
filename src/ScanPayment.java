public class ScanPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.print("Paid by Scan QR code: " + amount);	
	}	
}
