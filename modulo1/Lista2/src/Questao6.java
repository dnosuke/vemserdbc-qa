import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somaHistoria = 0, somaMatematica = 0, somaGeografia = 0, somaCiencias = 0, somaFilosofia  = 0, mediaGeral;
        double[][] notas = {
                {7.5, 3.5, 4.5, 8.7},
                {6.5, 8.5, 9.5, 10},
                {1.5, 3.5, 4.5, 5.7},
                {7.5, 6.5, 9.5, 8.7},
                {2.5, 8.5, 5.5, 8.7},
        };

        //linha 1= historia, linha 2= matemática, linha 3= geografia, linha 4 = ciencias, linha 5= filosofia

        for (int i = 0; i < notas[0].length; i++) {
                somaHistoria += notas[0][i];
            }
        for (int i = 0; i < notas[1].length; i++) {
                somaMatematica += notas[1][i];
            }

        for (int i = 0; i < notas[2].length; i++) {
                somaGeografia += notas[2][i];
            }

        for (int i = 0; i < notas[3].length; i++) {
                somaCiencias += notas[3][i];
            }

        for (int i = 0; i < notas[4].length; i++) {
                somaFilosofia += notas[4][i];
            }

        mediaGeral = (somaHistoria + somaMatematica + somaFilosofia + somaCiencias + somaGeografia )/20;



        System.out.println("=================================");
        System.out.println("Historia: " + somaHistoria/4);
        System.out.println("Matematica: " + somaMatematica/4);
        System.out.println("Geografia: " + somaGeografia/4);
        System.out.println("Ciencias: " + somaCiencias/4);
        System.out.println("Filosofia: " + somaFilosofia/4);
        System.out.println("Média Geral: " + mediaGeral);
        System.out.println("=================================");
    }
}

