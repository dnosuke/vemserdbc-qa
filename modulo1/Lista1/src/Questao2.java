
//       2. Criar um algoritmo onde o usuario possa escolher o estado e havera uma lista com determinadas cidades
//        daquele aquele estado. O usuario podera escolher uma cidade, apos escolher a cidade desejada ira
//        aparecer dados sobre a mesma (populacao, principal festa, IDH...).
//
//        OBS: Devera conter 3 estados e para cada estado 2 cidades.


import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int state;
        int city;
        System.out.println("Escolha um Estado: \n 1. Piauí \n 2. Goiás \n 3. Ceará");
        state = input.nextInt();

        switch (state){
            case 1 -> {
                System.out.println("Escolha uma cidade: \n 1. Teresina \n 2. Parnaiba \n 3. Oeiras");
                city = input.nextInt();
                if( city == 1 ) {
                    System.out.println("======Teresina======");
                    System.out.println(" População: 871.126 habitantes.\n IDH: 0,751. \n Comidas Típicas: Maria Isabel, Baião de dois.");
                    System.out.println("====================");
                }else if( city == 2) {
                    System.out.println("======Parnaiba======");
                    System.out.println("População: 183.482 habitantes.\n IDH: 0,789. \n Comidas Típicas: Torta de Caranguejo.");
                    System.out.println("====================");
                }else{
                    System.out.println("======Oeiras======");
                    System.out.println("População: 36.971 habitantes.\n IDH: 0,625. \n Comidas Típicas: Galinha caipira.");
                    System.out.println("====================");
                }
            }
            case 2 -> {
                System.out.println("Escolha uma cidade: \n 1. Anápolis \n 2. Goiania \n 3. Águas Lindas de Goiás");
                city = input.nextInt();
                if( city == 1 ) {
                    System.out.println("======Anápolis======");
                    System.out.println("População: 396.526 habitantes.\n IDH: 0,737. \n Comidas Típicas: Arroz com Pequi.");
                    System.out.println("====================");
                }else if( city == 2) {
                    System.out.println("======Goiania======");
                    System.out.println("População: 1.555.626 habitantes.\n IDH: 0,799. \n Comidas Típicas: Galinhada.");
                    System.out.println("====================");
                }else{
                    System.out.println("======Águas Lindas de Goiás======");
                    System.out.println("População: 222.850 habitantes.\n IDH: 0,686. \n Comidas Típicas: Empadão Goiano.");
                    System.out.println("====================");
                }
            }
            case 3 -> {
                System.out.println("Escolha uma cidade: \n 1. Fortaleza \n 2. Sobral \n 3. Itapipoca");
                city = input.nextInt();
                if( city == 1 ) {
                    System.out.println("======Fortaleza======");
                    System.out.println("População: 2.703.391 habitantes.\n IDH: 0,754. \n Comidas Típicas: Caranguejada, Galinha à cabidela.");
                    System.out.println("====================");
                }else if( city == 2) {
                    System.out.println("======Sobral======");
                    System.out.println("População: 212.437 habitantes.\n IDH: 0,714. \n Comidas Típicas: Paçoca.");
                    System.out.println("====================");
                }else{
                    System.out.println("======Itapipoca======");
                    System.out.println("População: 131.687 habitantes.\n IDH: 0,640. \n Comidas Típicas: Buchada e sarapatel.");
                    System.out.println("====================");
                }
            }
            default -> {
                System.out.println("Número inválido!");
            }
        }
    }
}
