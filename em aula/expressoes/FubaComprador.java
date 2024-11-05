class FubaComprador
{
    void montarTabela(double preco, int parcelas, double taxa) {
        double saldoDevedor, prestacao, precoFinal, juros;
        saldoDevedor = preco;
        prestacao = pm1(preco, taxa, parcelas);
        precoFinal = prestacao * parcelas;

        System.out.printf("Valor da prestação mensal: R$ %.2f\n", prestacao);
        System.out.printf("Preço final do notebook: R$ %.2f\n\n", precoFinal);
        
        System.out.printf("%-5s | %-10s | %-10s | %-10s\n", "Mês", "Juros", "Prestação", "Saldo");
        System.out.println("-------------------------------------------------------");
        
        for (int j = 1; j <= parcelas; j++) {
            juros = saldoDevedor * taxa;
            saldoDevedor -= (prestacao - juros);

            System.out.printf("%-5d | %-10.2f | %-10.2f | %-10.2f\n", j, juros, prestacao, saldoDevedor);
        }
    }
    double pm1 (double v, double i, int n) {
        return v * (Math.pow(1 + i, n) * i) / (Math.pow(1 + i, n) - 1);
    }
}
