public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Contato contatoCliente1 = new Contato();
        Contato contatoCliente2 = new Contato();
        Endereco cliente1Endereco1 = new Endereco();
        Endereco cliente2Endereco1 = new Endereco();
        ContaCorrente contaCliente1 = new ContaCorrente();
        ContaCorrente contaCliente2 = new ContaCorrente();

        //Cadastro cliente 1
        cliente1.nome = "Joao";
        cliente1.cpf = "555.555.555-75";
        contatoCliente1.telefone = "98888-8888";
        contatoCliente1.descricao = "Casa";
        contatoCliente1.tipo = 1;
        cliente1Endereco1.logradouro = "R. Bonito";
        cliente1Endereco1.cidade = "Salvador";
        cliente1Endereco1.numero = 1234;
        cliente1Endereco1.cep = "77777-777";
        cliente1Endereco1.tipo = 1;
        cliente1Endereco1.estado = "Bahia";
        cliente1Endereco1.pais = "Brasil";
        cliente1.enderecos[0] = cliente1Endereco1;
        cliente1.contatos[0] = contatoCliente1;
        contaCliente1.cliente = cliente1;
        contaCliente1.numeroConta = "1234-7";
        contaCliente1.agencia = 1234;
        contaCliente1.saldo = 50;
        contaCliente1.chequeEspecial = 100;

        //Cadastro cliente 2
        cliente2.nome = "Marcelo";
        cliente2.cpf = "666.555.555-75";
        contatoCliente2.telefone = "98888-9999";
        contatoCliente2.descricao = "Empresa";
        contatoCliente2.tipo = 2;
        cliente2Endereco1.logradouro = "R. Quintino";
        cliente2Endereco1.cidade = "Goiania";
        cliente2Endereco1.numero = 5678;
        cliente2Endereco1.cep = "77777-666";
        cliente2Endereco1.tipo = 2;
        cliente2Endereco1.estado = "Goiás";
        cliente2Endereco1.pais = "Brasil";
        cliente2.enderecos[0] = cliente2Endereco1;
        cliente2.contatos[0] = contatoCliente2;
        contaCliente2.cliente = cliente2;
        contaCliente2.numeroConta = "5555-7";
        contaCliente2.agencia = 5675;
        contaCliente2.saldo = 50.0;
        contaCliente2.chequeEspecial = 100;

        //Operações com cliente 1
        System.out.println("================== Cliente 1 =======================");
        System.out.println("Depositando..." + contaCliente1.depositar(300.00));
        System.out.printf("Novo saldo: R$ %.2f\n", contaCliente1.saldo);
        System.out.printf("Saldo com cheque especial: R$ %.2f\n", contaCliente1.retornarSaldoComChequeEspecial());
        contaCliente1.cliente.imprimirCliente();
        contaCliente1.cliente.imprimirEnderecos();
        contaCliente1.cliente.imprimirContatos();

        //operações com cliente 2
        System.out.println("================== Cliente 2 =======================");
        System.out.println("Depositando..." + contaCliente2.depositar(3400.00));
        System.out.printf("Novo saldo: R$ %.2f\n", contaCliente2.saldo);
        System.out.printf("Saldo com cheque especial: R$ %.2f\n", contaCliente2.retornarSaldoComChequeEspecial());

      //  Transferencia entre os clientes
        System.out.println("=============== Transferencia cliente 1 para cliente 2 =================");
        System.out.println("transferindo..." + contaCliente1.transferir(contaCliente2, 360.80));
        System.out.printf("Novo saldo da conta cliente 1: R$ %.2f\n", contaCliente1.saldo);
        System.out.printf("Novo saldo da conta cliente 2: R$ %.2f\n", contaCliente2.saldo);

        contaCliente1.sacar(100);

        contaCliente1.imprimirContaCorrente();
        contaCliente2.imprimirContaCorrente();

    }
}