package financial;

public class FinancialForecasting {

    public static double computeFutureValue(double[] growthRates, int periodCount, double startValue) {
        if (periodCount == 0) {
            return startValue;
        }
        return computeFutureValue(growthRates, periodCount - 1, startValue) * (1 + growthRates[periodCount - 1]);
    }

    public static double computeFutureValueWithMemo(double[] growthRates, int periodCount, double startValue, Double[] cache) {
        if (periodCount == 0) {
            return startValue;
        }
        if (cache[periodCount] != null) {
            return cache[periodCount];
        }
        cache[periodCount] = computeFutureValueWithMemo(growthRates, periodCount - 1, startValue, cache) * (1 + growthRates[periodCount - 1]);
        return cache[periodCount];
    }
}
