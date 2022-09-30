import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = null;
        String maisVelho = null;
        String maisPesado = null;
        final String VALOR_DE_SAIDA = "SAIR";
        int idade, quantidadeCadastrados = 0, maiorIdade = 0;
        double peso, altura,somaAlturas = 0, mediaAlturas = 0, alturaMaiorJogador = 0, maiorPeso = 0;


        while(nome != VALOR_DE_SAIDA){
            System.out.println("Digite o nome do jogador: ");
            nome = input.nextLine();
            if(nome == VALOR_DE_SAIDA){
                break;
            }
            System.out.println("Digite a altura do jogador:");
            altura = input.nextDouble();
            System.out.println("Digite a idade do jogador: ");
            idade = input.nextInt();
            System.out.println("Digite o peso do jogador:");
            peso = input.nextDouble();
            input.nextLine();

            if(altura > alturaMaiorJogador){
                alturaMaiorJogador = altura;
            }
            if(idade > maiorIdade){
                maiorIdade = idade;
                maisVelho = nome;
            }
            if(peso > maiorPeso){
                maiorPeso = peso;
                maisPesado = nome;
            }

            quantidadeCadastrados++;
            somaAlturas += altura;
            mediaAlturas = somaAlturas / quantidadeCadastrados;
        }

        System.out.println("=======================================================");
        System.out.println("Quantidade de jogadores: " + quantidadeCadastrados);
        System.out.println("Altura do maior jogador: " + alturaMaiorJogador);
        System.out.println("Jogador mais velho: " + maisVelho);
        System.out.println("Jogador mais pesado: " + maisPesado);
        System.out.printf("Média das alturas dos jogadores: %.2f\n", mediaAlturas);
        System.out.println("=======================================================");
        input.close();

    }
}
