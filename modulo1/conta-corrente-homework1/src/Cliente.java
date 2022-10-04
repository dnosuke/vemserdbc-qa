public class Cliente {
    String nome = "";
    String cpf = "";
    Contato[] contatos = new Contato[2];
    Endereco[] enderecos = new Endereco[2];

   public void imprimirContatos(){
       for(int i = 0; i < contatos.length ; i++ ) {
           if(contatos[i] != null) {
               contatos[i].imprimirContato();
           }
       }
   }
   public void imprimirEnderecos(){
       for(int i = 0; i < enderecos.length ; i++ ) {
           if(enderecos[i] != null) {
              enderecos[i].imprimirEndereco();
           }
       }
   }
   public void imprimirCliente(){
       System.out.println("Cliente: " + nome + ", " + "Cpf: " + cpf);
   }
}
