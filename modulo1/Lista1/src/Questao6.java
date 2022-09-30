//      6.Escreva um algoritmo para ler o numero total de eleitores de um municipio, o numero de votos brancos,
//        nulos e validos. Calcular e escrever o percentual que cada um representa em relacdo ao total de eleitores.


import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalEleitores;
        int votosBrancos;
        int votosNulos;
        int votosValidos;
        int percentualBrancos;
        int percentualNulos;
        int percentualValidos;

        System.out.println("Digite o total de eleitores: ");
        totalEleitores = input.nextInt();
        System.out.println("Digite o número de votos válidos: ");
        votosValidos = input.nextInt();
        System.out.println("Digite o total de votos brancos: ");
        votosBrancos = input.nextInt();
        System.out.println("Digite o total de votos nulos: ");
        votosNulos = input.nextInt();

        percentualValidos = (100 * votosValidos)/totalEleitores;
        percentualBrancos = (100 * votosBrancos)/totalEleitores;
        percentualNulos = (100 * votosNulos)/totalEleitores;

        System.out.println("====== Total de eleitores: " + totalEleitores + " ======");
        System.out.println("Votos válidos: " + percentualValidos + "%\nVotos brancos: " + percentualBrancos + "%\nVotos nulos: "+ percentualNulos + "%");
        System.out.println("=================================");
    }
}
