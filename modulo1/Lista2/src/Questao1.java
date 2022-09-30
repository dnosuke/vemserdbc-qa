import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeProduto;
       float valorProduto;
       float valorFinalProduto;

        System.out.println("Digite o nome do produto: ");
        nomeProduto = input.nextLine();
        System.out.println("Digite o valor do produto: ");
        valorProduto = input.nextFloat();

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: " + valorProduto);
        System.out.println("Promoção: " + nomeProduto);
        System.out.println("--------------------------");

        for (int i = 1; i <= 10; i++) {
            valorFinalProduto = (float) (valorProduto - (valorProduto * 0.05 * i));
            System.out.printf("%d x R$ %.2f = R$ %d\n", i , valorFinalProduto, i);
        }

        input.close();
    }
}
