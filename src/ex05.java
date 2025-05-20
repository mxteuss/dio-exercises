import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMin = 1.293;
        System.out.println("Digte seu salário:  ");
        double salario = sc.nextDouble();

        double x = salario / salarioMin;
        System.out.println("Você recebe " + x + " salários minimos");
        sc.close();

    }
}
