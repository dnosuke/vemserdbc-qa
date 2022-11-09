public class ContaPoupanca extends Conta implements Impressao {
    static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public ContaPoupanca() {

    }

    @Override
    public Cliente getCliente() {
        return super.getCliente();
    }

   public void creditarTaxa(){
        double v = this.getSaldo() * JUROS_MENSAL;
        this.setSaldo(v);
    }

    @Override
    public void imprimir() {
        System.out.println("===========================");
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Conta Poupança: " + this.getNumeroConta());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.printf("Saldo: R$ %.2f\n", this.getSaldo());
        System.out.println("===========================");
    }
}
