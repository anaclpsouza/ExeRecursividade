import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.print("Digite um número: ");
        try {
            n = sc.nextInt();
            System.out.println("2 elevado a " + n + " é: " + potencia(n));
        } catch (Exception e) {
            System.out.println("Insira apenas números.");
        }


        sc.close();
    }

    public static double potencia(int n) throws Exception{
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return 2 * potencia(n - 1);
        } else {
            return 1.0 / (2 * potencia(-n -1));
        }
    }
}
