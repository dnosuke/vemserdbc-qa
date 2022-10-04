public class ContaCorrente extends Conta implements Impressao {
    private double chequeEspecial;

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean depositar(double valor) {
        return false;
    }

    public boolean sacar(double valor){
        if(valor > 0 && (valor < saldo+chequeEspecial)){
                saldo -= valor;
                return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean transferir(ContaCorrente conta, double valor) {
        return false;
    }

    public double retornarSaldoComChequeEspecial(){
        System.out.println("retornando saldo com cheque especial ...");
        return saldo + chequeEspecial;
    }

    @Override
    public void imprimirContaCorrente() {
        System.out.println("===========================");
        System.out.println("Conta Corrente: " + numeroConta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Cliente: " + cliente.nome);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
        System.out.println("===========================");
    }
}
