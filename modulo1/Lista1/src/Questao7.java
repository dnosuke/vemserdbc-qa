import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String codigoProduto;
        int quantidade;
        double precoTotal;

        System.out.println("Digite o código do produto: ");
        codigoProduto = input.nextLine();
        System.out.println("Digite a quantidade comprada: ");
        quantidade = input.nextInt();

        switch (codigoProduto){
            case "ABCD" -> {
                precoTotal = 5.3 * quantidade;
                System.out.println("Total devido: R$ " + Math.round((precoTotal*100.0))/100.0);
            }
            case "XYPK" -> {
                precoTotal = 6.0 * quantidade;
                System.out.println("Total devido: R$ " + Math.round((precoTotal*100.0))/100.0);
            }
            case "KLMP" -> {
                precoTotal = 3.2 * quantidade;
                System.out.println("Total devido: R$ " + Math.round((precoTotal*100.0))/100.0 );
            }
            case "QRST" -> {
                precoTotal = 2.5 * quantidade;
                System.out.println("Total devido: R$ " + Math.round((precoTotal*100.0))/100.0 );
            }
            default -> {
                System.out.println("Código inválido.");
            }
        }

    }
}
