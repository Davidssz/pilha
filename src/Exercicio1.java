import java.util.Scanner;
import java.util.Stack;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        Stack<Integer> numPares = new Stack<>();
        Stack<Integer> numImpares = new Stack<>();

            System.out.print("Digite 10 números entre 1 e 99: " );

        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                value = scanner.nextInt();
            } while (value <= 0 || value >= 100);

            if (value % 2 == 0) {
                numPares.push(value);
            } else {
                numImpares.push(value);
            }
        }
        System.out.println("Números pares:");
        while (!numPares.isEmpty()) {
            System.out.println(numPares.pop());
        }

        System.out.println("Números ímpares:");
        while (!numImpares.isEmpty()) {
            System.out.println(numImpares.pop());
        }
    }
    }
