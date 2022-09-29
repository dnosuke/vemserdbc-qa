import java.util.Scanner;

public class Questao_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String word;

        System.out.println("Escolha o tipo de tradução:\n 1. Português => Inglês\n 2. Inglês => Português");
        choice = input.nextInt();
        input.nextLine();

        if(choice == 1) {
            System.out.println("Digite a palavra a ser traduzida:");
            word = input.nextLine();
            System.out.println("---------Português => Inglês----------");
            switch (word) {
                case "Cachorro" -> {
                    System.out.println(word + " => Dog");
                }
                case "Tempo" -> {
                    System.out.println(word + " => Time");
                }
                case "Amor" -> {
                    System.out.println(word + " => Love");
                }
                case "Cidade" -> {
                    System.out.println(word + " => City");
                }
                case "Feliz" -> {
                    System.out.println(word + " => Happy");
                }
                case "Triste" -> {
                    System.out.println(word + " => Sad");
                }
                case "Deveria" -> {
                    System.out.println(word + " => Should");
                }
                case "Poderia" -> {
                    System.out.println(word + " => Could");
                }
            }
        }else if (choice == 2){
            System.out.println("Digite a palavra a ser traduzida:");
            word = input.nextLine();
            System.out.println("---------Inglês => Português----------");
            switch (word) {
                case "Dog" -> {
                    System.out.println(word + " => Cachorro");
                }
                case "Time" -> {
                    System.out.println(word + " => Tempo");
                }
                case "Love" -> {
                    System.out.println(word + " => Amor");
                }
                case "City" -> {
                    System.out.println(word + " => Cidade");
                }
                case "Happy" -> {
                    System.out.println(word + " => Feliz");
                }
                case "Sad" -> {
                    System.out.println(word + " => Triste");
                }
                case "Should" -> {
                    System.out.println(word + " => Deveria");
                }
                case "Could" -> {
                    System.out.println(word + " => Poderia");
                }
                default -> {
                    System.out.println("Essa palavra não é válida.");
                }
            }
        }else{
            System.out.println("Escolha inválida.");
        }

    }
}
