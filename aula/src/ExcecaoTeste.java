import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoTeste {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    do {

      System.out.println("Digite 1 ou 2:");
      
      int numero = input.nextInt();
      input.nextLine();
      
      try {
        switch (numero) {
          case 1:
          System.out.println("digitou: 1");
          
          break;
          
          case 2:
          System.out.println("digitou: 2");
          
          break;
          
          default:
          throw new Exception();
        }
      }catch(InputMismatchException e){
        System.out.println("Opa!! não pode ser letra");
      }catch (Exception e) {
        System.out.println("Opa!!");
      }
    }while(true);
  }
}
