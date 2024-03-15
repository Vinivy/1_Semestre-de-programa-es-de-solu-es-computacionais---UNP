import java.util.Scanner;

public class ExercicioThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua Idade em anos:");
        int idade = scanner.nextInt();

        System.out.println("Informe sua idade em meses:");
        int meses = scanner.nextInt();

        System.out.println("Informe sua idade em dias:");
        int dias = scanner.nextInt();

        int idadeEmDias = CalcularEmDias(idade, meses, dias);

        System.out.println("O Total em Dias é : " + idadeEmDias);

        scanner.close();
    }

    public static int CalcularEmDias(int idade, int meses, int dias){
        int idadeEmDias = idade * 365 + meses * 30 + dias;
        return idadeEmDias;
    } 
    


}