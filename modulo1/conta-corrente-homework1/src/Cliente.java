public class Cliente {
    String nome = "";
    String cpf = "";
    Contato[] contatos = new Contato[2];
    Endereco[] enderecos = new Endereco[2];

   public void imprimirContatos(){
       System.out.println("Contato: " + contatos);
   }
   public void imprimirEnderecos(){
       System.out.println("Endereços: " + enderecos);
   }
   public void imprimirCliente(){
       System.out.println("Cliente: " + nome);
   }
}
