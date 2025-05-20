import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor booleano (true ou false): ");
        boolean x = sc.nextBoolean();

        System.out.print("Digite o segundo valor booleano (true ou false): ");
        boolean y = sc.nextBoolean();
        if (x == y) {
            if (x) {
                System.out.println("Ambos são VERDADEIRO (true).");
            } else {
                System.out.println("Ambos são FALSO (false).");
            }
        } else {
            System.out.println("Os valores são diferentes.");
        }

        sc.close();
    }
}
