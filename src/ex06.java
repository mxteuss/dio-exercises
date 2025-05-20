import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor qualquer: ");
        double n = sc.nextDouble();

        n += n * 0.05;

        System.out.println("Reajuste: " + n);
        sc.close();

    }

}
