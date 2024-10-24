import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (primo(n, 2)) {
            System.out.println(n + " é primo!");
        } else {
            System.out.println(n + " não é primo.");
        }

        sc.close();
    }

    public static boolean primo(int n, int divisor) {
        if (n <= 1) {
            return false;
        } 
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }

        return primo(n, divisor+1);
    }
}
