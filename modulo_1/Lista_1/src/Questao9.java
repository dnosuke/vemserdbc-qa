import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horaEntrada;
        int minutoEntrada;
        int horaSaida;
        int minutoSaida;
        int minutosTotal=0;
        int horasTotal=0;

        System.out.println("Digite a hora de inicio: \nHoras: ");
        horaEntrada = input.nextInt();
        input.nextLine();
        System.out.println("Minutos: ");
        minutoEntrada = input.nextInt();

        System.out.println("Digite a hora de Término: \nHoras: ");
        horaSaida = input.nextInt();
        input.nextLine();
        System.out.println("Minutos: ");
        minutoSaida = input.nextInt();

        if(horaSaida > horaEntrada){
            horasTotal = (horaSaida - horaEntrada);
            minutosTotal =  Math.abs(minutoSaida - minutoEntrada);
        }else{
            horasTotal = ((horaSaida - horaEntrada) + 24);
            minutosTotal =  Math.abs(minutoSaida - minutoEntrada);
        }

        System.out.println("A duração do jogo foi de " + horasTotal + " horas e " + minutosTotal + " minutos.");
    }
}
