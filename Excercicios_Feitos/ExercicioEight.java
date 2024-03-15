import java.util.Scanner;

public class ExercicioEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor de A :");

        double A = scanner.nextDouble();

        System.out.println("Digite o Valor de B :");

        double B = scanner.nextDouble();

        System.out.println("Digite o Valor de C :");

        double C = scanner.nextDouble();

        System.out.println("Digite o Valor de D :");

        double D = scanner.nextDouble();

        System.out.println("Digite o Valor de E :");

        double E = scanner.nextDouble();

        System.out.println("Digite o Valor de F :");

        double F = scanner.nextDouble();

        double ValordeX = (C * E - B * F) / (A * E - B * D);

        double ValordeY = (A * F - C * D) / (A * E - B * D);

        System.out.println("Valor de X : " + ValordeX + "Valor de Y : " + ValordeY);

        scanner.close();
    }
    
}