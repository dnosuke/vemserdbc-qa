import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String maisEmConta = "";
        double somaMercado1 = 0, somaMercado2 = 0, somaMercado3 = 0;
        double[][] precos = {
                {7.5, 3.5, 4.5}, //00 01 02
                {10.5, 8.5, 9.5},//10 11 12
                {9.5, 5.5, 4.5}, //20 21 22
                {7.5, 6.5, 9.5},
                {7.5, 7.7, 7.15},
                {2.5, 8.5, 5.5},
                {6.55, 6.35, 6.85},
                {1.2, 1.0, 1.25},
                {1.5, 4.5, 5.5},
                {2.5, 2.5, 3.5},
        };

        //linha 1= Mercado1, linha 2= Mercado2, linha 3= Mercado3

        for (int i = 0; i < precos.length; i++) {
            somaMercado1 += precos[i][0];
        }
        for (int i = 0; i < precos.length; i++) {
            somaMercado2 += precos[i][1];
        }

        for (int i = 0; i < precos.length; i++) {
            somaMercado3 += precos[i][2];
        }

        if(somaMercado1/10 < somaMercado2/10 && somaMercado1/10 < somaMercado3/10){
            maisEmConta = "Mercado 1";
        }else if(somaMercado2/10 < somaMercado1/10 && somaMercado2/10 < somaMercado3/10){
            maisEmConta = "Mercado 2";
        }else{
            maisEmConta = "Mercado 3";
        }

        System.out.println("=================================");
        System.out.println("Mercado 1: " + somaMercado1/10);
        System.out.println("Mercado 2: " + somaMercado2/10);
        System.out.println("Mercado 3: " + somaMercado3/10);
        System.out.println("Mercado mais em conta: " + maisEmConta);
        System.out.println("=================================");
    }
}
