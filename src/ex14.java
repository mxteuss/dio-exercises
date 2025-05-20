import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();


        int temp = a;
        a = b;
        b = temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        sc.close();
    }

}
