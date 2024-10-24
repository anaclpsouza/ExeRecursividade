import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Calcular Fatorial. \n2. Calcular Fibonacci.");
        String op = sc.nextLine();
        int n = 0;
        int f = 0;

        switch (op) {
            case "1":
                System.out.print("Digite um número: ");
                try {
                    n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("Insira apenas números naturais.");
                        System.exit(1);
                    }
                    System.out.println("O fatorial de " + n + " é: " + fatorial(n));
                } catch (Exception e) {
                    System.out.println("Insira apenas números inteiros.");
                }
                break;
            case "2":
                System.out.print("Digite um número: ");
                try {
                    f = sc.nextInt();
                    if (f < 0) {
                        System.out.println("Digite apenas números positivos para o Fibonacci.");
                    } else {
                        for (int i = 0; i <= f; i++) {
                            System.out.print(fibo(i) + " ");   
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Insira apenas números inteiros.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close();
    }

    public static long fatorial(int n) throws Exception{
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

    public static long fibo(int f) throws Exception {
        if (f == 0) {
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
