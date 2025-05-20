import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva qualquer número");
        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? "Esse número é par" : "Esse númmero é ímpar" );
        sc.close();

    }
}
