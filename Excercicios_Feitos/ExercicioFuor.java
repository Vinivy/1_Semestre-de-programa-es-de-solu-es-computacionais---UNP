import java.util.Scanner;

public class ExercicioFuor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade em anos:");
        int idadeEmAnos = scanner.nextInt();

        System.out.println("Informe sua idade em meses:");
        int meses = scanner.nextInt();

        System.out.println("Informe sua idade em dias:");
        int dias = scanner.nextInt();

        int totalDiasDeVida = calcularDiasDeVida(idadeEmAnos, meses, dias);

        System.out.println("Você viveu " + totalDiasDeVida + " dias até agora.");

        scanner.close();
    }

    public static int calcularDiasDeVida(int idadeEmAnos, int meses, int dias){
        int totalDias = idadeEmAnos * 365 + meses * 30 + dias;
        return totalDias;
    }
}