import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = 1;
        int n2 = 1;
        System.out.print("Digite o 1° número: ");
        try {
            n1 = sc.nextInt();
            // p calcular MDC, caso o n° seja negativo, é considerado o módulo do n°
            if (n1 < 0) {
                n1 = -n1;
            }
        } catch (Exception e) {
            System.out.println("Insira apenas números inteiros.");
            System.exit(1);
        }
        System.out.print("Digite o 2° número: ");
        try {
            n2 = sc.nextInt();
            if (n2 < 0) {
                n2 = -n2;
            }
        } catch (Exception e) {
            System.out.println("Insira apenas números inteiros.");
            System.exit(1);
        }
        System.out.println("O máximo divisor comum entre " + n1 + " e " + n2 + " é: " + maxDiv(n1, n2));

        sc.close();

    }

    public static int maxDiv(int n1, int n2) throws Exception{
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
