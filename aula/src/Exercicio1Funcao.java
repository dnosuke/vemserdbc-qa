public class Exercicio1Funcao {
  public static void main(String[] args) {
    Calculo soma = (valor1, valor2) -> valor1 + valor2;
    Calculo multiplicacao = (valor1, valor2) -> valor1 * valor2;

    System.out.println(soma.calcula(2, 2));
    System.out.println(multiplicacao.calcula(3, 2));
  }
}
