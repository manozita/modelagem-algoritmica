import java.lang.Math;
// <<class definition>>
class Financiamento_1 {
    // <<function-method definition>>
    double pm_1(double v, double i, int n) {
        double k = Math.pow(1 + i, n);
        double cf = (k * i) / (k - 1);
        return v * cf;
    }
}