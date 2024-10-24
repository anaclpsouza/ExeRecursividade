import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        System.out.println("2 elevado a " + n + " é: " + potencia(n));

        sc.close();
    }

    public static double potencia(int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return 2 * potencia(n - 1);
        } else {
            return 1.0 / (2 * potencia(-n -1));
        }
    }
}
