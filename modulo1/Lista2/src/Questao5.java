import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notaFinal = 0, maiorNotaFinal = 0, mediaNotasFinais = 0;
        int alunoMaiorNotaFinal = 0;
        double[][] notas = {
                {1, 3.5, 4.5, 0},
                {2, 8.5, 9.5, 0},
                {3, 3.5, 4.5, 0},
                {4, 6.5, 9.5, 0},
                {5, 8.5, 5.5, 0},
        };

        //coluna 1= numero matricula, coluna 2= media das provas, coluna 3= media das provas, coluna 4 = nota final

        for (int i = 0; i < notas.length; i++) {
            notaFinal = notas[i][1] * 0.6 + notas[i][2] * 0.4;
            notas[i][3] = notaFinal;
            System.out.printf("Nota Final %.2f do aluno %d\n", notaFinal, (int) notas[i][0]);
        }
        for (int i = 0; i < notas.length; i++) {
            if(notas[i][3] > maiorNotaFinal){
                maiorNotaFinal = notas[i][3];
                alunoMaiorNotaFinal =(int) notas[i][0];
            }
        }
        for (int i = 0; i < notas.length; i++) {
            mediaNotasFinais += notas[i][3];
        }




        System.out.println("=================================");
        System.out.println("Maior nota final foi do aluno: " + alunoMaiorNotaFinal);
        System.out.printf("Média das notas finais: %.2f\n", mediaNotasFinais/5);
        System.out.println("=================================");
    }
}
