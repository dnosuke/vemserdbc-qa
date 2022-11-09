import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void deveTestarSaqueContaCorrenteSemSaldo(){
        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(1000);
        conta.setChequeEspecial(100);
        //act
        boolean retorno = conta.sacar(1500);
        //asssert
        Assertions.assertTrue(retorno);
    } // não dar certo o valor do saque (saque > saldo + ce)
    @Test
    public void deveTestarSaqueContaPoupancaEVerificarSaldoComSucesso() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.setSaldo(1000);

        boolean retorno = conta.sacar(100);

        Assertions.assertTrue(retorno);
        Assertions.assertEquals(900, conta.getSaldo());
    } //: deve creditar taxa antes
//    public void deveTestarSaqueContaPoupancaSemSaldo: não dar certo o valor do saque (saque > saldo)
//    public void deveTestarSaqueContaPagamentoEVerificarSaldoComSucesso
//    public void deveTestarSaqueContaPagamentoSemSaldo: não dar certo o valor do saque (saque > saldo)
//    public void deveTestarTransferenciaEVerificarSaldoComSucesso
//    public void deveTestarTransferenciaSemSaldo: não dar certo o valor do saque (saque > saldo)
//    public void deveTestarDepositoEVerificarSaldoComSucesso
//    public void deveTestarDepositoNegativo
}
