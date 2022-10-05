import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Casa", "89999-9999", 1);
        Contato contato2 = new Contato("Trabalho", "89999-1111", 2);
        Contato contato3 = new Contato("Nasa", "89999-1111", 2);
        Contato contato4 = new Contato("Micro", "89999-1111", 2);
        Endereco endereco1 = new Endereco(1, "rua dois", 1234, "", "70166-333", "anapolis", "Goias","Brasil");
        Endereco endereco2 = new Endereco(1, "rua três", 4567, "", "88888-333", "Fortaleza", "Ceara","Brasil");
        Endereco endereco3 = new Endereco(1, "rua cuatro", 4567, "", "88888-333", "Fortaleza", "Ceara","Brasil");
        Endereco endereco4 = new Endereco(1, "rua cinco", 4567, "", "88888-333", "Fortaleza", "Ceara","Brasil");

        ArrayList<Contato> contato = new ArrayList<>(Arrays.asList(contato1, contato2));
        ArrayList<Endereco> endereco = new ArrayList<>(Arrays.asList(endereco1, endereco2));

        ArrayList<Contato> contatoArray2 = new ArrayList<>(Arrays.asList(contato3, contato4));
        ArrayList<Endereco> enderecoArray2 = new ArrayList<>(Arrays.asList(endereco3, endereco4));

        Cliente cliente1 = new Cliente("Jao", "7777777-77", contato, endereco);
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, "12345-5", "6666", 600.0 , 300);
        ContaPagamento contaPagamento1 = new ContaPagamento(cliente1, "66666-5", "6666", 500.0 );

        Cliente cliente2 = new Cliente("Carlos", "1111111-77", contatoArray2, enderecoArray2);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente2, "55555-5", "6666", 300.0 );
//
//            cliente1.imprimirContatos();
//            cliente1.imprimirEnderecos();

        //deposito
        contaCorrente1.depositar(300);
        contaPagamento1.depositar(200);
        System.out.println("Saldo conta pagamento 1: " + contaPagamento1.getSaldo()); // 700

        //transferencia
        contaCorrente1.transferir(contaPagamento1,300); // 900 - 300
        System.out.println("Saldo conta corrente 1: " + contaCorrente1.getSaldo()); // 600
        contaPoupanca2.transferir(contaPagamento1,200); // 300 - 200
        System.out.println("Saldo conta poupança 2: " + contaPoupanca2.getSaldo()); // 100
        contaPagamento1.transferir(contaPoupanca2, 300); // 1200 - 300
        contaPagamento1.transferir(contaPoupanca2, 0);
        System.out.println("Saldo conta pagamento 1: " + contaPagamento1.getSaldo()); // 900
        contaPagamento1.transferir(contaPoupanca2, 900); // saldo - 900
        System.out.println("Saldo conta pagamento 1: " + contaPagamento1.getSaldo()); // 0

//        saque
        contaPagamento1.sacar(-100);
        contaPagamento1.sacar(0);
        contaPagamento1.sacar(100);


        contaCorrente1.imprimir();
        contaPagamento1.imprimir();
        contaPoupanca2.imprimir();
    }
}