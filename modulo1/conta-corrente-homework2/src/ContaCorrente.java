public class ContaCorrente extends Conta implements Impressao {
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, String numeroConta, String agencia, double saldo, double chequeEspecial) {
        super(cliente, numeroConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean depositar(double valor) {
        double v = this.getSaldo() + valor;
        if(valor >= 0){
            this.setSaldo(v);
            return true;
        }else{
            System.out.println("Operação não permitida.");
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor > 0 && (valor <= this.getSaldo()+this.chequeEspecial)){
            double v = this.getSaldo() - valor;
            this.setSaldo(v);
                return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean transferir(Conta conta, double valor) {
        double v = conta.getSaldo() + valor;
        double v1 = this.getSaldo() - valor;
        if(getSaldo() + this.chequeEspecial >= valor && valor > 0){
            conta.setSaldo(v);
            this.setSaldo(v1);
            return true;
        }
        return false;
    }

    public double retornarSaldoComChequeEspecial(){
        System.out.println("retornando saldo com cheque especial ...");
        return this.getSaldo() + this.chequeEspecial;
    }
    @Override
    public void imprimir() {
        System.out.println("===========================");
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Conta Corrente: " + this.getNumeroConta());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.printf("Saldo: R$ %.2f\n", this.getSaldo());
        System.out.println("===========================");
    }
}

