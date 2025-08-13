
public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxa) {
        // Atualiza com o triplo da taxa
        super.atualiza(taxa * 3);
    }
}