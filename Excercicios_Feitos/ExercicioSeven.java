import java.util.Scanner;

public class ExercicioSeven {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Custo de fabrica :");
        
        double custodeFabrica = scanner.nextDouble();

        double porcenagemdodistribuidor = 0.28;

        double imposto = 0.45;

        double calcularvalores = custodeFabrica + (custodeFabrica * porcenagemdodistribuidor) + (custodeFabrica * imposto);

        System.out.println("O custo do consumidor de seu carro nove é de :" + calcularvalores);

        scanner.close();
    }
}