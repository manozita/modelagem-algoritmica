// <<component>> price.Financiamento_3
// <<required interface>>
import java.util.function.Function;
// <<class definition>>
class Financiamento_3 {
    // <<instance variable definition>>
    Function<Double, Boolean> Moeda = v -> (10 <= v) && (v <= 5000);
    Function<Double, Boolean> Taxa = t -> (0 < t) && (t < 20);
    Function<Integer, Boolean> Prestacao = n -> (1 < n) && (n <= 24);
    // <<strict function-method definition>>
    double pm_1(double v, double t, int n) {
        if (Moeda.apply(v) && Taxa.apply(t) && Prestacao.apply(n)) {
            var i = t / 100;
            var k = Math.pow(1 + i, n);
            var cf = (k * i) / (k - 1);
            return v * cf;
        }
        // Interrompe-se a computação no caso de violação do
        // predicado de tipo:
        throw new RuntimeException(
            "Argumento inválido= (" + v + ", " + t + ", " + n + ")"
        );
    }
}