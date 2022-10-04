public class ContaPoupanca extends Conta implements Impressao {
    static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }
    @Override
    public Cliente getCliente() {
        return super.getCliente();
    }
    @Override
    public boolean transferir(Conta conta, double valor) {
        double saldoCorrente = conta.getSaldo() + valor;
        double saldoPoupanca = getSaldo() - valor;
        if(getSaldo() > 0 && getSaldo() >= valor){
            this.setSaldo(saldoPoupanca);
            conta.setSaldo(saldoCorrente);
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        double v = this.getSaldo() - valor;
        if(valor > 0 && valor <= getSaldo()){
            this.setSaldo(v);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean depositar(double valor) {
        double v = this.getSaldo() + valor;
        if(valor > 0){
            this.setSaldo(v);
            return true;
        }
        return false;
    }

    void creditarTaxa(){
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
