import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int indentificacao;
        float nota1, nota2, nota3;
        float mediaExercicios;
        float media;
        String conceito = "";
        String message;

        System.out.println("Digite o número de identificação do aluno: ");
        indentificacao = input.nextInt();
        input.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextFloat();
        System.out.println("Digite a média dos exercicios: ");
        mediaExercicios = input.nextFloat();

        media = ( nota1 + nota2 + nota3 + mediaExercicios ) / 7;
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
                "\nPrimeira nota: " + nota1 +
                "\nSegunda nota: " + nota2 +
                "\nTerceira nota: " + nota3 +
                "\nMédia dos exercicios: " + mediaExercicios +
                "\nMédia de aproveitamento: " + media);
        System.out.println("==============");
        System.out.println(message);
        System.out.println("==============");
    }
}
