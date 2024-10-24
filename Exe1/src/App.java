import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Calcular Fatorial. \n2. Calcular Fibonacci.");
        String op = sc.nextLine();

        switch (op) {
            case "1":
                System.out.print("Digite um número: ");
                int n = sc.nextInt();
                System.out.println("O fatorial de " + n + " é: " + fatorial(n));
                break;
            case "2":
                System.out.print("Digite um número: ");
                int f = sc.nextInt();
                System.out.println("O " + f + "° número da sequência fibonacci é: " + fibo(f));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close();
    }

    public static long fatorial(int n) {
        if ((n == 1) || (n == 0)) {
            return 1;
        } else {
            long f = 1;
            for (int i = n; i > 0; i--) {
                f *= (i);
            }
            return f;
        }
    }

    public static long fibo(int f) {
        if (f < 0) {
            System.out.println("Insira apenas números positivos.");
        } else if (f == 0) {
            return 0;
        } else if (f == 1) {
            return 1;
        }
        long a = 0, b = 1, resultado = 0;
        for (int i = 2; i <= f; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }
        return resultado;
    }
}
