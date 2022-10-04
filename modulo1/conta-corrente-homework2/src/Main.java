public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Casa", "89999-9999", 1);
        Contato contato2 = new Contato("Trabalho", "89999-1111", 2);
        Endereco endereco1 = new Endereco(1, "rua dois", 1234, "", "70166-333", "anapolis", "Goias","Brasil");
        Endereco endereco2 = new Endereco(1, "rua três", 4567, "", "88888-333", "Fortaleza", "Ceara","Brasil");

        Cliente cliente1 = new Cliente("Jao", "7777777-77", new Contato[]{contato1, contato2}, new Endereco[]{endereco1, endereco2});
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, "12345-5", "6666", 600.0 , 300);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente1, "66666-5", "6666", 500.0 );

        Cliente cliente2 = new Cliente("Carlos", "1111111-77", new Contato[]{contato2}, new Endereco[]{endereco2});
        ContaCorrente contaCorrente2 = new ContaCorrente(cliente2, "11111-5", "6666", 400.0 , 300);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente2, "55555-5", "6666", 300.0 );



        //deposito
        contaCorrente1.depositar(300);
        contaPoupanca1.depositar(200);

        //transferencia
        contaCorrente1.transferir(contaPoupanca1,300);
        contaPoupanca1.creditarTaxa();
        contaPoupanca2.transferir(contaCorrente1,200);

        //saque
        contaPoupanca2.sacar(100);
        contaCorrente2.sacar(300);
        contaCorrente2.sacar(-300);

        contaCorrente1.imprimir();
        contaPoupanca1.imprimir();
        contaCorrente2.imprimir();
        contaPoupanca2.imprimir();
    }
}