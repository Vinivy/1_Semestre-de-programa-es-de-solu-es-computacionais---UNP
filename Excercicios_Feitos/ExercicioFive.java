import java.util.Scanner;

public class ExercicioFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sua Primeira Nota : ");
        double NotaOne = scanner.nextDouble();

        System.out.println("Sua Segunda Nota : ");
        double NotaTwo = scanner.nextDouble();

        System.out.println("Sua Trceira Nota : ");
        double NotaThree = scanner.nextDouble();

        double S = NotaOne + NotaTwo + NotaThree / 2;
        System.out.println("Sua media é de : " + S );
        
        scanner.close();
    }
}