import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2° número: ");
        int n2 = sc.nextInt();

        System.out.println("O máximo divisor comum entre " + n1 + " e " + n2 + " é: " + maxDiv(n1, n2));

        sc.close();

    }

    public static int maxDiv(int n1, int n2) {
        if ((n1 >= n2) && (n1 % n2 == 0)) {
            return n2;
        }
        if (n1 < n2) {
            return maxDiv(n1, n2);
        } else {
            return maxDiv(n2, n1 % n2);
        }
    }
}
