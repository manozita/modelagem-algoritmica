
class FubaComprador
{
    void montarTabela(double preco, int meses, double taxa) {
        System.out.println("|| Mes || Juros || Prestacao || Saldo ||\n");
        for (int j = 1; j <= meses; j++) {
            System.out.println("[ " + j + " ]");
            
        }
    }
    int calcularParcela (double PV, double i, int n) {
        return (PV*i) / (1 - Math.pow(1+i, -n));
    }
}
