import java.util.Scanner;

public class ExercicioSix {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o tempo de duração do evento em segundos
        System.out.print("Digite o tempo de duração do evento em segundos: ");
        int segundos = scanner.nextInt();

        // Chamar a função para converter o tempo em horas, minutos e segundos
        int[] tempo = converterTempo(segundos);

        // Imprimir o resultado
        System.out.println("O evento dura " + tempo[0] + " horas, " + tempo[1] + " minutos e " + tempo[2] + " segundos.");
        scanner.close();
        }

    // Função para converter o tempo em horas, minutos e segundos
    public static int[] converterTempo(int segundos) {
        // Calcular as horas
        int horas = segundos / 3600;
        // Calcular os minutos
        int minutos = (segundos % 3600) / 60;
        // Calcular os segundos restantes
        int segundosRestantes = segundos % 60;

        // Criar um array para armazenar o resultado
        int[] tempo = {horas, minutos, segundosRestantes};
        // Retornar o array com o tempo convertido
        return tempo;
    }
    
}
