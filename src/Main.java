public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int creditTerm = 1;
        double creditSum = 1000000;
        service.calculate(creditTerm, creditSum);
        creditTerm++;
        service.calculate(creditTerm, creditSum);
        creditTerm++;
        service.calculate(creditTerm, creditSum);
    }
}