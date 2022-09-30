//      5.Escreva um algoritmo para ler as dimensGdes de um retangulo (base e altura), calcular e escrever a area do
//        retangulo.


import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base;
        float height;
        float area;

        System.out.println("Digite a altura do retângulo: ");
        height = input.nextFloat();
        System.out.println("Digite a base do retângulo: ");
        base = input.nextFloat();

        area = base * height;

        System.out.println("A área do retângulo é: " + area);
    }
}
