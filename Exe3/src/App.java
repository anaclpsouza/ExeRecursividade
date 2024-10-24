import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        try {
            n = sc.nextInt();
            if (primo(n, 2)) {
                System.out.println(n + " é primo!");
            } else {
                System.out.println(n + " não é primo.");
            }
        } catch (Exception e) {
            System.out.println("Insira apenas números");
        }

        sc.close();
    }

    public static boolean primo(int n, int divisor) throws Exception{
        if (n <= 1) {
            return false;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }

        return primo(n, divisor + 1);
    }
}
