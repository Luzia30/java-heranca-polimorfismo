
public class AppBanco {
    public static void main(String[] args) {
        Banco banco = new Banco(10);

        Conta cc1 = new ContaCorrente();
        cc1.deposita(500);

        Conta cp1 = new ContaPoupanca();
        cp1.deposita(800);

        banco.adiciona(cc1);
        banco.adiciona(cp1);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.02);

        for (int i = 0; i < banco.pegaTotalDeContas(); i++) {
            adc.roda(banco.pegaConta(i));
        }

        System.out.println("Saldo total no banco: " + adc.getSaldoTotal());
    }
}

