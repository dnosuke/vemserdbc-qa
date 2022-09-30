import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero: ");
            valores[i] = input.nextInt();
        }

        for (int i = valores.length; i > 0  ; i--) {
            System.out.println(valores[i-1]);
        }
        }
}
