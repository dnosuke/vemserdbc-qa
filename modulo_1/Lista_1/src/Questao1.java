//       1. Desenvolver um algoritmo que exiba as seguintes informacdes, porém o que esta sublinhado sera
//        solicitado ao usuario (por meio do Scanner).
//        EXEMPLO: Ola seu nome 6é Jodo, vocé tem 16 anos, é da cidade de Floriandpolis, situada
//        no estado de Santa Catarina.


import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        String city;
        String state;

        System.out.println("Digite seu nome: ");
        name = input.nextLine();
        System.out.println("Digite sua idade: ");
        age = input.nextInt();
        input.nextLine();
        System.out.println("Digite sua cidade: ");
        city = input.nextLine();
        System.out.println("Digite seu Estado: ");
        state = input.nextLine();

        String message = "Olá seu nome é " + name + ", vocé tem " + age + " anos, é da cidade de " + city + ", situada no estado de " + state + ".";

      System.out.println(message);
    }
}
