public class ContaCorrente {
    Cliente cliente;
    String numeroConta;
    int agencia;
    double saldo;
    double chequeEspecial;

    public void imprimirContaCorrente(){
        System.out.println("===========================");
        System.out.println("Conta Corrente: " + numeroConta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Cliente: " + cliente.nome);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
        System.out.println("===========================");
    }
    public boolean sacar(double valor){
        System.out.println("Sacando...");
        if(valor > 0 && (valor < saldo+chequeEspecial)){
                saldo -= valor;
                return true;
        }else{
            return false;
        }
    }
    public boolean depositar(double valor){
        if(valor < 0 ){
            System.out.println("Deposito não permitido.");
            return false;
        }else{
            saldo += valor;
            return true;
        }
    }
    public double retornarSaldoComChequeEspecial(){
        System.out.println("retornando saldo com cheque especial ...");
        return saldo + chequeEspecial;
    }
    public boolean transferir(ContaCorrente conta, double valor){
        if(valor > 0){
            conta.saldo += valor;
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
