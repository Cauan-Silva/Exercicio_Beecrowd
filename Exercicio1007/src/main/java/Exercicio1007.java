import java.util.Scanner;

public class Exercicio1007 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            
            int DIFERENCA = (A * B) - (C * D);
            
            System.out.printf("DIFERENCA = %d%n", DIFERENCA);
        }
    }
}
