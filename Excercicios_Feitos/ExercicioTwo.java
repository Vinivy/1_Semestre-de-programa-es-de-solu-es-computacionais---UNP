import java.util.Scanner;

public class ExercicioTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scanner é uma lib que vem a receber informações dos usuarioas

        System.out.println("Digite o número A:");
        int A = scanner.nextInt();

        System.out.println("Digite o número B:");
        int B = scanner.nextInt();

        System.out.println("Digite o número C:");
        int C = scanner.nextInt();

        /*Declarando que os valores serão inteiros antes das formulas
        usamos apenas dois exemples de Math, que é o pow para potencialização
        e o sqrt para raiz quadrada
        */
        int R = (int) Math.pow((A + B), 2);
        int S = (int) Math.pow((B + C), 2);


        int D = (R + S) / 2;

        System.out.println("O Valor é " + D);

        scanner.close();
    };


}