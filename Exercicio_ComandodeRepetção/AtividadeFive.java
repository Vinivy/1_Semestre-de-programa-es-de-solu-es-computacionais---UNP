package Exercicio_ComandodeRepetção;

import java.util.Scanner;

public class AtividadeFive {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome");
        String Nome = scanner.nextLine();
        int soma = 0;

        System.out.println(Nome);
        for(int i = 0; i <= 10; i++){

            System.out.println("Digite Sua Idade: ");
            int num = scanner.nextInt();

            
            soma += num;

            System.out.println(soma);
        }
        scanner.close();
    }
    
}
