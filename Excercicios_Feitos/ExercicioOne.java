 import java.util.Scanner;

 public class ExercicioOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Console
        System.out.println("Digite as coordenadas de x1 e y1");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        //Console
        System.out.println("Digite as coordenadas de x2 e y2");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = CalcularDistancia(x1, y1, x2, y2);
        System.out.println("A distancia entre os dois pontos é: " + distancia);

        scanner.close();
     };

     public static double CalcularDistancia(double x1,double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
     }
 }
 