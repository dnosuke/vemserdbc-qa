public class ContaPagamento extends Conta implements Impressao {
    final static double TAXA_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > 0 && valor >= TAXA_SAQUE){
            setSaldo(getSaldo() - valor - TAXA_SAQUE);
            return true;
        }else{
            System.out.println("Operação não permitida.");
            return false;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("===========================");
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Conta Pagamento: " + this.getNumeroConta());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.printf("Saldo: R$ %.2f\n", this.getSaldo());
        System.out.println("===========================");

    }
}
