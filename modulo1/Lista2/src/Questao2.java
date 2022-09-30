import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroEscolha;
        int numeroTentativa = 0;

        System.out.println("Digite um número: ");
        numeroEscolha = input.nextInt();
        input.nextLine();
        System.out.println("Digite um número para tentativa: ");
        numeroTentativa = input.nextInt();
        input.nextLine();

        while(numeroEscolha != numeroTentativa){
            System.out.println("Errouu!!!");
            if(numeroTentativa > numeroEscolha){
                System.out.println("O número a ser encontrado é menor do o que você digitou.");
            }else {
                System.out.println("O número a ser encontrado é maior do o que você digitou.");
            }
            System.out.println("Digite outro número para tentativa: ");
            numeroTentativa = input.nextInt();
            input.nextLine();
        }

        System.out.println("Muito bem!!! O número escolhido era: " + numeroEscolha);
        input.close();
    }
}
