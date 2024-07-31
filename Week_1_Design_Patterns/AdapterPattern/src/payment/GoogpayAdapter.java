package payment;

public class GoogPayAdapter implements PaymentProcessor {
    private GoogPay googPay;

    public GoogPayAdapter(GoogPay googPay) {
        this.googPay = googPay;
    }

    @Override
    public void paymentProcess(String amount) {
        googPay.pay(amount);
    }
}
