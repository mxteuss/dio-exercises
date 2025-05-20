import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o número A");
        int a = sc.nextInt();

        System.out.println("Escreva o número B");
        int b = sc.nextInt();

        if (a == b){
            int c = a + b;
            System.out.println(c);
        }
        else if (a != b) {
            int c =  a * b;
            System.out.println(c);
        }
        sc.close();

    }
}
