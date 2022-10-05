public interface Movimentacao {
    boolean depositar(double valor);
    boolean sacar(double valor);
    boolean transferir(Conta conta, double valor);
}
