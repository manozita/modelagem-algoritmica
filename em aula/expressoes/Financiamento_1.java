import java.lang.Math;
// <<class definition>>
class Financiamento_1 {
    // <<function-method definition>>
    int pm_1(int v, int i, int n) {
        double k = Math.pow(1 + i, n);
        double cf = (k * i) / (k - 1);
        return v * cf;
    }
}