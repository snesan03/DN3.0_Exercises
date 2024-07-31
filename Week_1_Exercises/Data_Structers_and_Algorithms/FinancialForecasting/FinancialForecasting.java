package financialforecast;

public class FinancialForecasting {
	public static double futureValueRecursive(double presentValue, double rate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return futureValueRecursive(presentValue, rate, periods - 1) * (1 + rate);
    }

	public static void main(String[] args) {
        double presentValue = 1000;
        double rate = 0.05;
        int periods = 10;

        double futureValueRecursive = futureValueRecursive(presentValue, rate, periods);
        System.out.println("Future Value after " + periods + " periods: " + futureValueRecursive);

        
}
}