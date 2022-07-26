public class CreditPaymentService {
    void calculate(int creditTerm, double creditSum) {
        double payPerMonth, percent = 9.99;
        int monthSum = 12;
        System.out.println("Сумма кредита       |   " + (int)creditSum);
        if (creditTerm < 2) {
            System.out.println("Срок кредита        |   " + creditTerm + " год");
        } else {
            System.out.println("Срок кредита        |   " + creditTerm + " года");
        }
        monthSum = monthSum * creditTerm;
        creditSum = 1000000;
        double monthPercent = percent / 12 / 100;
        double monthPercentPlusOne = monthPercent + 1.0;
        double powedOnePlusPMP = Math.pow(monthPercentPlusOne, monthSum);
        double annuitantK = monthPercent * powedOnePlusPMP / (powedOnePlusPMP - 1);
        payPerMonth = creditSum * annuitantK;

        System.out.println("Ежемесячный платёж  |   " + (int)payPerMonth +
                "\nПроцентная ставка   |   " + percent + "%");
        System.out.println("________________________________");
    }
}
