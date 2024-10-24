import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = 1;
        int n2 = 1;
        System.out.print("Digite o 1° número: ");
        try {
            n1 = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Insira apenas números inteiros.");
            System.exit(1);
        }
        System.out.print("Digite o 2° número: ");
        try {
            n2 = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Insira apenas números inteiros.");
            System.exit(1);
        }
        if (n1 < 0 || n2 < 0) {
            System.out.println("Insira apenas números naturais.");
        } else {
            System.out.println(n1 + " * " + n2 + " é: " + somaMul(n1, n2));
        }

        sc.close();
    }

    public static int somaMul(int n1, int n2) throws Exception{
        if ((n1 == 0) || (n2 == 0)) {
            return 0;
        }

        return n1 + somaMul(n1, n2 - 1);
    }
}
