public class Main {

    public static double futureValue(double pv,
                                     double rate,
                                     int years) {

        if (years == 0)
            return pv;

        return futureValue(
                pv * (1 + rate),
                rate,
                years - 1
        );
    }

    public static void main(String[] args) {

        double[][] cases = {
                {10000, 0.10, 5},
                {5000, 0.05, 10},
                {20000, 0.08, 15},
                {1500, 0.12, 3},
                {50000, 0.06, 20}
        };

        for (double[] c : cases) {

            double pv = c[0];
            double rate = c[1];
            int years = (int) c[2];

            double fv = futureValue(pv, rate, years);

            System.out.printf(
                    "Initial: %.2f, Rate: %.2f, Years: %d -> Future Value: %.2f%n",
                    pv, rate, years, fv
            );
        }
    }
}