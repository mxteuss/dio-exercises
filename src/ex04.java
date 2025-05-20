import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um numero inteiro");
        int n = sc.nextInt();

        System.out.println( n - 1 + ": Seu antecessor ");
        System.out.println( n + 1 + ": Seu sucessor ");
        sc.close();

    }
}
