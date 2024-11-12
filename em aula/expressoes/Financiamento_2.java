// <<component>> price.Financiamento_2
// <<required interface>>
import java.util.function.Function;
// <<class definition>>
class Financiamento_2 {
    // <<instance variable definition>>
    Function<Double, Boolean> Moeda = v -> (10 <= v) && (v <= 5000);
    Function<Double, Boolean> TaxaUsuario = i -> (0 < i) && (i < 20);
    Function<Integer, Boolean> Prestacao = n -> (1 < n) && (n <= 24);
    // <<predicate-method defintion>>
    boolean pm_1(double v, double i, int n) {
        return Moeda.apply(v) && TaxaUsuario.apply(i) && Prestacao.apply(n);
    }
}