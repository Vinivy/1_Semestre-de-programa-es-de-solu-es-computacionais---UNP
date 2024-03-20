package Exercicio_ComandodeRepetção;

import java.util.Scanner;

public class AtividaeSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Soma = 0;

        for(int i = 1; i <= 20; i++){

            System.out.println("Digite Sua idade pessoa " + i);
            int Idade = scanner.nextInt();

            Soma += Idade;
        }
        System.out.println("A soma das Idades são: "+ Soma);
        scanner.close();
    }
}
