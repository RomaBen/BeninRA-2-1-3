public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int creditTerm = 1, monthSum = 12;
        double creditSum = 1000000, percent = 9.99;
        int payPM;

        while (creditTerm < 4) {
            System.out.println("Сумма кредита       |   " + (int)creditSum);
            if (creditTerm < 2) {
                System.out.println("Срок кредита        |   " + creditTerm + " год");
            } else {
                System.out.println("Срок кредита        |   " + creditTerm + " года");
            }
            payPM = (int) service.calculate(creditTerm, monthSum, creditSum, percent);
            System.out.println("Ежемесячный платёж  |   " + payPM +
                    "\nПроцентная ставка   |   " + percent + "%");
            System.out.println("________________________________");
            creditTerm++;
        }
    }
}