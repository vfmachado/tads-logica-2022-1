public class ContaBancaria {
    String nome;
    String conta;
    private float saldo;

    ContaBancaria(String nome, String conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "\nProprietario(a): " + this.nome
        + "\nSaldo R$ " + this.saldo;
    }
}
