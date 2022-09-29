import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int indentificacao;
        float nota_1, nota_2, nota_3;
        float media_exercicios;
        float media;
        String conceito = "";
        String message;

        System.out.println("Digite o número de identificação do aluno: ");
        indentificacao = input.nextInt();
        input.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota_1 = input.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota_2 = input.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota_3 = input.nextFloat();
        System.out.println("Digite a média dos exercicios: ");
        media_exercicios = input.nextFloat();

        media = ( nota_1 + nota_2 + nota_3 + media_exercicios ) / 7;
        if ( media == 9.0 ){
            conceito = "A";
        }else if(media >= 7.5 && media < 9.0){
            conceito = "B";
        }else if(media >= 6.0 && media < 7.5){
            conceito = "C";
        }else if(media >= 4.0 && media < 6.0){
            conceito = "D";
        }else{
            conceito = "E";
        }

        if((conceito == "A") || (conceito =="B") || (conceito == "C")){
            message = "APROVADO";
        }else{
            message = "REPROVADO";
        }

        System.out.println("==============");
        System.out.println("Número de identificação: " + indentificacao +
                "\nPrimeira nota: " + nota_1 +
                "\nSegunda nota: " + nota_2 +
                "\nTerceira nota: " + nota_3 +
                "\nMédia dos exercicios: " + media_exercicios +
                "\nMédia de aproveitamento: " + media);
        System.out.println("==============");
        System.out.println(message);
        System.out.println("==============");
    }
}
