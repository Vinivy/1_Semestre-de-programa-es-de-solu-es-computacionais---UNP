package Exercicio_ComandodeRepetção;

import java.util.Scanner;

public class AtividadeFuor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Seu Nome: ");
        String Nome = scanner.nextLine();
        
        System.out.println("Digite a quantidades de fezes que vc queira visualizar seu nome: ");
        int vezes = scanner.nextInt();

        for(int k = 0 ;k <= vezes; k++ ){
            System.out.println(Nome);
        };
    }
}
