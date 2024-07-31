package financial;

public class FinancialForecasting {

    public static double computeFutureValue(double[] growthRates, int Count, double startValue) {
        if (Count == 0) {
            return startValue;
        }
        return computeFutureValue(growthRates, Count - 1, startValue) * (1 + growthRates[Count - 1]);
    }

    public static double computeFutureValueWithMemo(double[] growthRates, int Count, double startValue, Double[] cache) {
        if (Count == 0) {
            return startValue;
        }
        if (cache[Count] != null) {
            return cache[Count];
        }
        cache[Count] = computeFutureValueWithMemo(growthRates, Count - 1, startValue, cache) * (1 + growthRates[Count - 1]);
        return cache[Count];
    }
}
