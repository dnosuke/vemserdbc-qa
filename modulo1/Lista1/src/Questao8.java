import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cargo;
        double salario;
        double diferencaSalario;
        double novoSalario;

        System.out.println("Digite o cargo do funcionário: ");
        cargo = input.nextLine();
        System.out.println("Digite o salário: ");
        salario = input.nextDouble();

        switch (cargo){
            case "Gerente" -> {
                novoSalario = salario + salario * 0.1;
                diferencaSalario = novoSalario - salario;
            }
            case "Engenheiro" -> {
                novoSalario = salario + salario * 0.2;
                diferencaSalario = novoSalario - salario;
            }
            case "Técnico" -> {
                novoSalario = salario + salario * 0.3;
                diferencaSalario = novoSalario - salario;
            }
            default -> {
                novoSalario = salario + salario * 0.4;
                diferencaSalario = novoSalario - salario;
            }
        }

        System.out.println("===============");
        System.out.println("Cargo: " + cargo + "\nSalário antigo: R$ " + salario + "\nSalário com aumento: R$ " + novoSalario + "\nDiferença salarial: R$ " + diferencaSalario);
        System.out.println("===============");
    }
}
