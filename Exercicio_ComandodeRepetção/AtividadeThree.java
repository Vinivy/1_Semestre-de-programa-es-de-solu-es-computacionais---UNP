package Exercicio_ComandodeRepetção;

import java.util.Scanner;

public class AtividadeThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String Nome = scanner.nextLine();

        for(int i = 0; i <= 10; i++){
            System.out.println(Nome);            
        };
    }
}
