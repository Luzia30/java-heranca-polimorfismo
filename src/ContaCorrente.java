
public class ContaCorrente extends Conta {
    @Override
    public void deposita(double valor) {
        this.saldo += valor - 0.10; // Desconto de taxa bancária
    }

    @Override
    public void atualiza(double taxa) {
        // Atualiza com o dobro da taxa
        super.atualiza(taxa * 2);
    }
}