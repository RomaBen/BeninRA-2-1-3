public class CreditPaymentService {
    double calculate(int creditTerm, int monthSum, double creditSum, double percent) {
        monthSum = monthSum * creditTerm;
        double monthPercent = percent / 12 / 100;
        double monthPercentPlusOne = monthPercent + 1.0;
        double powedOnePlusPMP = Math.pow(monthPercentPlusOne, monthSum);
        double annuitantK = monthPercent * powedOnePlusPMP / (powedOnePlusPMP - 1);
        double payPerMonth = creditSum * annuitantK;
        return payPerMonth;
    }
}
