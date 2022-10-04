public interface Movimentacao {
    public boolean depositar(double valor){

    }
    public boolean sacar(double valor){
        if(valor > 0 && (valor < saldo+chequeEspecial)){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean transferir(ContaCorrente conta, double valor){
        if(sacar(valor)){
            return conta.depositar(valor);
        }else{
            System.out.println("Operação não permitida.");
            return false;
        }
    }
}
