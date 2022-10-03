public class Endereco {
   int tipo;
   String logradouro;
   int numero;
   String complemento;
   String cep;
   String cidade;
   String estado;
   String pais;

   public void imprimirEndereco(){
       System.out.println("========== Endereco ===============");
       System.out.println("Tipo: " + tipo);
       System.out.println("Logradouro: " + logradouro + ", Número: " + numero);
       System.out.println("Complemento: " + complemento);
       System.out.println("CEP: " + cep);
       System.out.println("Cidade: " + cidade);
       System.out.println("Estado: " + estado + " País: " + pais );
   }
}
