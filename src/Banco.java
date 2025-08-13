
public class Banco {
    private Conta[] contas;
    private int indice = 0;

    public Banco(int tamanho) {
        contas = new Conta[tamanho];
    }

    public void adiciona(Conta c) {
        contas[indice] = c;
        indice++;
    }

    public Conta pegaConta(int x) {
        return contas[x];
    }

    public int pegaTotalDeContas() {
        return indice;
    }
}