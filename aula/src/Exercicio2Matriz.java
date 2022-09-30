public class Exercicio2Matriz {
    public static void main(String[] args){
        int[][] matriz = new int[2][2];
        int somaTotal,somaPrimeiraLinha,somaSegundaLinha, subtracao;

        matriz[0][0] = 23;
        matriz[0][1] = 12;
        matriz[1][0] = 2;
        matriz[1][1] = 6;

        somaTotal = matriz[0][0] + matriz[0][1] + matriz[1][0] + matriz[1][1];
        somaPrimeiraLinha = matriz[0][0] + matriz[0][1];
        somaSegundaLinha = matriz[1][0] + matriz[1][1];
        subtracao = somaPrimeiraLinha - somaSegundaLinha;
            System.out.println("Total: " + somaTotal+ "\nSoma Primeira linha: " + somaPrimeiraLinha +
                    "\nSoma segunda linha: " + somaSegundaLinha+ "\nSubtração da primeira linha com a segunda: " + subtracao);


    }
}