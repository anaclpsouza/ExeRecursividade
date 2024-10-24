import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2° número: ");
        int n2 = sc.nextInt();

        System.out.println(n1 + " * " + n2 + " é: " + somaMul(n1, n2));

        sc.close();
    }

    public static int somaMul(int n1, int n2) {
        if ((n1 == 0) || (n2 == 0)) {
            return 0;
        }

        return n1 + somaMul(n1, n2-1);
    }
}
