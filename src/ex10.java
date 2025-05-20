import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double media = n1 + n2 + n3 / 3;
        System.out.println("A média é: " + media );
        sc.close();
    }
}
