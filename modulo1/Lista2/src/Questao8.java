import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroDigitado, quantidadeIguais = 0, quantidadeMaiores = 0, quantidadeMenores = 0;
        int[] valores = {2,3,45,6,7,2,78,5,12,11};


        System.out.println("Digite um numero: ");
        numeroDigitado = input.nextInt();

        for (int valor: valores) {
            if(valor == numeroDigitado){
                quantidadeIguais++;
            }
            if(valor < numeroDigitado){
                quantidadeMenores++;
            }
            if(valor > numeroDigitado){
                quantidadeMaiores++;
            }
        }

        System.out.println("===================================");
        System.out.println("Numero: " + numeroDigitado);
        System.out.println("Quantidade de vezes que o numero aparece: " + quantidadeIguais);
        System.out.println("Quantidade de numeros maiores que o digitado: " + quantidadeMaiores);
        System.out.println("Quantidade de numeros menores que o digitado: " + quantidadeMenores);
        System.out.println("===================================");
    }
}
