//      5.Escreva um algoritmo para ler as dimensGdes de um retangulo (base e altura), calcular e escrever a area do
//        retangulo.


import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base;
        float height;
        float area;

        System.out.println("Digite a altura do triângulo: ");
        height = input.nextFloat();
        System.out.println("Digite a base do triângulo: ");
        base = input.nextFloat();

        area = (base * height) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}
