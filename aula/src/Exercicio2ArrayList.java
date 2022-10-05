import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Exercicio2ArrayList {
  public static void main(String[] args) {

   /*  List<String> lista = new ArrayList<>(); */

    /* lista.add("Jao");
    lista.add("Pedro");
    lista.add("Vidal");
    lista.add("Bruyne");

    System.out.println(lista.get(lista.size()-2));
    System.out.println(lista.get(0));
    System.out.println(lista.remove(lista.size()-1));

    System.out.println(lista);
    System.out.println(lista.size()); */

    /* Queue<String> fila = new LinkedList<>();
    
    fila.add("jao");
    fila.add("maria");
    fila.add("gaby");
    System.out.println(fila);
    String atendido = fila.poll();
    System.out.println(atendido);
    System.out.println(fila); */
  
    /* Stack<String> pilha = new Stack<>();

    pilha.add("prato1");
    pilha.add("prato2");
    pilha.add("prato3");

    System.out.println(pilha);
    String saiu = pilha.pop();
    System.out.println(pilha);
 */

  Map<String, String> tabela = new HashMap<>();
  tabela.put("12345","jao" );
  tabela.put("23455","Mal" );
  tabela.put("12345","Donati" );

  String pessoa = tabela.get("12345");
  System.out.println(pessoa);

  }
}