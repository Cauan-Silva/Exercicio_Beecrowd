import java.util.Scanner;

public class Exercicio1013 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            int maiorAB = (a + b + Math.abs(a - b)) / 2;
            
            int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
            
            System.out.println(maiorABC + " eh o maior");
        }
    }
}