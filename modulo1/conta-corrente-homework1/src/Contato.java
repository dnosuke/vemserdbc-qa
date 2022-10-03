public class Contato {
    String descricao;
    String telefone;
     int tipo;

    public void imprimirContato(){
        System.out.println("=========== Contato ================");
        System.out.println("Descrição: " + descricao );
        System.out.println("Telefone: " + telefone + " Tipo: " + tipo  );
    }
}
