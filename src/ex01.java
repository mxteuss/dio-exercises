import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número A: ");
        int a = sc.nextInt();
        System.out.println("Insira o número B:");
        int b = sc.nextInt();
        System.out.println("Insira o número de C: ");
        int c = sc.nextInt();

        int sum = a + b;
        System.out.print(c > sum ? "C é maior que A e B" : "A e B juntos são maiores ou iguais a C");
        sc.close();

    }
}