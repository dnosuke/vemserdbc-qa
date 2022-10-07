import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String tipo;
    Comida[] comidasTipo = Comida.values();

    /* System.out.println("Escolha o tipo de comida: ");
    tipo = input.nextLine(); */

   /*  Arrays.stream(Comida.values())
    .filter(comidas -> comidas.getDescricao()
    .contains(tipo.toLowerCase()))
    .findFirst()
    .ifPresent(comidas -> System.out.println(comidas.getValor())); */
    
    for (Comida comida : comidasTipo) {
      System.out.println(comida);
    }

    /* System.out.println(comidasTipo[2]); */
    input.close();
  }
}
